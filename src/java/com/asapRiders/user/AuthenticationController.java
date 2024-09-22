package com.asapRiders.user;


import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "AuthenticationController", urlPatterns =
{
	"/adminsignup", "/adminlogin","/index" 
})
public class AuthenticationController extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String action = request.getServletPath();
		
		if(action.equals("/adminsignup"))
			request.getRequestDispatcher("adminsignup.jsp").forward(request, response);
		else if(action.equals("/adminlogin"))
			request.getRequestDispatcher("adminlogin.jsp").forward(request, response);  
                else if(action.equals("/index"))
			request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String action = request.getServletPath();
		
		HttpSession session = request.getSession();
		
		EntityManager em = Persistence
				.createEntityManagerFactory(
						"RidersPU")
				.createEntityManager();			
		RiderService riderService = new RiderService(em);
                
		if(action.equals("/adminsignup"))
		{
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String username = request.getParameter("username");
			String phonenumber = request.getParameter("phoneNumber");
			String email = request.getParameter("email");
                      String homeAddress = request.getParameter("homeAddress");
			String password = request.getParameter("password");
                     
			
			if(firstName.isEmpty() || lastName.isEmpty() 
					|| username.isEmpty() ||phonenumber.isEmpty() ||email.isEmpty()
                               ||homeAddress.isEmpty() || password.isEmpty())
			{
				session.setAttribute("feedback", "Please fill all fields");
				response.sendRedirect("adminsignup");
				return;
			}
			
			if(riderService.getRiderByUsername(username) != null)
			{
				session.setAttribute("feedback",
						String.format("Username (%s) is taken", username));
				response.sendRedirect("adminsignup");
				return;
			}
			
			Riders rider = new Riders(
                                firstName, lastName,username,phonenumber, email,homeAddress, PasswordService.hashPassword(password));
			
			riderService.addRider(rider);
			
			session.setAttribute("feedback",
						"User account created, login to continue");
				response.sendRedirect("adminlogin");
		}
		else if(action.equals("/adminlogin"))
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(username.isEmpty() || password.isEmpty())
			{
				session.setAttribute("feedback", "Please fill all fields");
				response.sendRedirect("adminlogin");
				return;
			}
			
			Riders rider = riderService.getRiderByUsername(username);
			// ensure that user exitst
			if(rider == null)
			{
				session.setAttribute("feedback",
						"Username and/or password is incorrect");
				response.sendRedirect("adminlogin");
				return;
			}
			
			//ensure that password is correct
			boolean passwordsMatch =
					PasswordService.verifyPassword(password, rider.getPassword());
			if(!passwordsMatch)
			{
				session.setAttribute("feedback",
						"Username and/or password is incorrect");
				response.sendRedirect("adminlogin");
				return;
			}
//                        else if (action.equals("/index"))
			session.setAttribute(
					"loggedInUser", rider);
			response.sendRedirect("/index");
		}
                
                
	}
}