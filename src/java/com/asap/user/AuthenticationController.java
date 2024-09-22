package com.asap.user;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AuthenticationController", urlPatterns =
{
	"/signup", "/login","/index", 
})
public class AuthenticationController extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String action = request.getServletPath();
		
		if(action.equals("/signup"))
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		else if(action.equals("/login"))
			request.getRequestDispatcher("login.jsp").forward(request, response);  
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
		UserService userService = new UserService(em);
		
		if(action.equals("/signup"))
		{
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String username = request.getParameter("username");
			String phonenumber = request.getParameter("phoneNumber");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			if(firstName.isEmpty() || lastName.isEmpty() 
					|| username.isEmpty() || password.isEmpty())
			{
				session.setAttribute("feedback", "Please fill all fields");
				response.sendRedirect("signup");
				return;
			}
			
			if(userService.getUserByUsername(username) != null)
			{
				session.setAttribute("feedback",
						String.format("Username (%s) is taken", username));
				response.sendRedirect("signup");
				return;
			}
			
			User user = new User(
                                firstName, lastName, email,username, PasswordService.hashPassword(password));
			
			userService.addUser(user);
			
			session.setAttribute("feedback",
						"User account created, login to continue");
				response.sendRedirect("/login");
		}
		else if(action.equals("/login"))
		{
			String username = request.getParameter("username");
			String password = request.getParameter("login-password");
			
			if(username.isEmpty() || password.isEmpty())
			{
				session.setAttribute("feedback", "Please fill all fields");
				response.sendRedirect("login");
				return;
			}
			
			User user = userService.getUserByUsername(username);
			// ensure that user exitst
			if(user == null)
			{
				session.setAttribute("feedback",
						"Username and/or password is incorrect");
				response.sendRedirect("login");
				return;
			}
			
			//ensure that password is correct
			boolean passwordsMatch =
					PasswordService.verifyPassword(password, user.getPassword());
			if(!passwordsMatch)
			{
				session.setAttribute("feedback",
						"Username and/or password is incorrect");
				response.sendRedirect("login");
				return;
			}
//                        else if (action.equals("/index"))
			session.setAttribute(
					"loggedInUser", user);
			response.sendRedirect("/index");
		}
                
                
	}
}