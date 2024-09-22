package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Welcome To Shopping Cart</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;1,100;1,200&family=Roboto+Slab&display=swap');\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Shadows+Into+Light&display=swap')\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"hero\">\n");
      out.write("            <nav>\n");
      out.write("                <h2 class=\"logo\">A.S.A.P <span>RIDERS</span></h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <!--<li><a href=\"cart.jsp\">Cart</a></li>-->\n");
      out.write("                    <!--<li><a href=\"orders.jsp\">Orders</a></li>-->\n");
      out.write("                    <!--<li><a href=\"signup.jsp\">Login</a></li>-->\n");
      out.write("                    <li><a href=\"#\">LogOut</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt2.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                        <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt3.jpg\">\n");
      out.write("                        <p>James Blake</p>\n");
      out.write("<!--                        <blockquote>Long Sleeve</blockquote>-->\n");
      out.write("                        <!-- for information about the product -->\n");
      out.write("                        <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                        <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"images/shirt1.jpg\">\n");
      out.write("                    <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p> <!--for the price-->\n");
      out.write("                    <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                    <!--<button>Add to cart</button>-->\n");
      out.write("                    <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                       <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                </div>\n");
      out.write("               </div> \n");
      out.write("                <div class=\"container\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                      <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                       <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                       <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt3.jpg\">\n");
      out.write("                       <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p> <!--for the price-->\n");
      out.write("                     <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                        <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>   <!--for the price-->\n");
      out.write("                        <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                       <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt3.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p> <!--for the price-->\n");
      out.write("                        <button>Contact</button>\n");
      out.write("\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                    <img src=\"images/shirt1.jpg\">\n");
      out.write("                   <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>   <!--for the price-->\n");
      out.write("                   <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                    <!--<button>Add to cart</button>-->\n");
      out.write("                    <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                    <img src=\"images/shirt3.jpg\">\n");
      out.write("                    <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                   <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                    <!--<button>Add to cart</button>-->\n");
      out.write("                    <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                    <img src=\"images/shirt1.jpg\">\n");
      out.write("                    <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                   <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                    <!--<button>Add to cart</button>-->\n");
      out.write("                    <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                       <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>  <!--for the price-->\n");
      out.write("                       <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/shirt1.jpg\">\n");
      out.write("                        <p>Amos Prince</p><!-- for information about the product -->\n");
      out.write("                     <p>+234999999999</p>   <!--for the price-->\n");
      out.write("                        <button onclick=\"window.location.href='mailto:mathiasonyebuchi13@gmail.com'\">Contact</button>\n");
      out.write("                        <!--<button>Add to cart</button>-->\n");
      out.write("                        <!--should i do it like junia?-->\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
