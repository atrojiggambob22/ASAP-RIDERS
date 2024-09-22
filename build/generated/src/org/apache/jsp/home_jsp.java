package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Travel the globe</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("    <style> \n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;1,100;1,200&family=Roboto+Slab&display=swap');\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    <nav class=\"header\">\n");
      out.write("            <h2>A.S.A.P <span>RIDERS</span></h2>\n");
      out.write("            <div class=\"bbbbb\">\n");
      out.write("                <a id=\"form\" href=\"\"><button>HOME</button></a>\n");
      out.write("                <a href=\"\"><button>ABOUT</button></a>\n");
      out.write("                <a  id=\"place\" href=\"signup.jsp\"><button>SIGNUP</button></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        \n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <h1>The Largest Last Mile <br> Delivery Service in Nigeria</h1>\n");
      out.write("            <br>\n");
      out.write("            <p>Quality Drivers.Great Prices.Negotiable.Stress-Free Delviries<p>\n");
      out.write("                <a href=\"signup.jsp\"> <button>Let's Help You Deliver</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"features\" id=\"Palace\">\n");
      out.write("        <!-- <div class=\"card\">\n");
      out.write("            <div class=\"text-col\">\n");
      out.write("                <h2>INDIA </h2>\n");
      out.write("                <p> heritage, diverse landscapes, and vibrant cities. From the stunning Taj Mahal to the serene backwaters of Kerala, India offers a wide range of experiences for travelers. The country also boasts delicious cuisine, colorful festivals, and warm hospitality that make it a must-visit destination.</p>\n");
      out.write("                <a id=\"btn1\" ><button>Explore more</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"img-col\">\n");
      out.write("                <img src=\"images/shirt1.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div> -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"img-col\" id=\"ii\">\n");
      out.write("                <img src=\"images/firstperson.jpeg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-col \">\n");
      out.write("                <h2 class=\"pop\">The best delivery\n");
      out.write("                     <br>drivers you have ever seen</h2>\n");
      out.write("                <p>First they carried you,Now they carried your packeages for You</p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"text-col\">\n");
      out.write("                <h2 class=\"pop\">Quality riders and <br> patners ready to deliver </h2>\n");
      out.write("                <p>With Pilots and A.S.A.P partners all over  <br>Rivers State,ther will always be one nearby to pick up your percels and more </p>\n");
      out.write("                <a  href=\"signup.jsp\"><button>Let's Help You Deliver!</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"img-col\">\n");
      out.write("                <img src=\"images/person2.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"img-col\">\n");
      out.write("                <img src=\"images/biker.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-col\">\n");
      out.write("                <h2 class=\"pop\">Got a bike?</h2>\n");
      out.write("                <p>if you're a bike owner and are looking to double your earning capacity,we <br> want you on the A.S.A.P RIDERS Team. Join the A.S.A.P Partner Team to increase your earnings</p>\n");
      out.write("                <a href=\"adminsignup.jsp\"><button>Partner with us!</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"popo\">\n");
      out.write("        <h1 id=\"gg\">We Offer More Thann Parcels</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"images/firstcard.jpg\" alt=\"\">\n");
      out.write("                <h2>Hungry?</h2>\n");
      out.write("                <p>We've got you coverd</p>\n");
      out.write("                <a href=\"\">Learn More</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"images/secondcard.jpg\" alt=\"\">\n");
      out.write("                <h2>Running a Buisness?</h2>\n");
      out.write("                <p>Let's handle your deliveries with A.S.A.P Buisness</p>\n");
      out.write("               <a href=\"\">learn More</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"images/thirdcard.jpg\" alt=\"\">\n");
      out.write("                <h2>A.S.A.P Partner</h2>\n");
      out.write("                <p>We've got A.S.A.P Partners to make sure we've got more than enough Pilots to help you with your deliveries</p>\n");
      out.write("                <a href=\"\">Learn More</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("          <div class=\"footer\">\n");
      out.write("            <div id=\"info\">\n");
      out.write("        <h1>Contact Us</h1>\n");
      out.write("        <p>You can reach us through our social media platforms or VIA our mobile numbers below</p>\n");
      out.write("        <label for=\"tel\">+2349061446848</label>\n");
      out.write("        <label for=\"tel\">+2349061446848</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"social-media\">\n");
      out.write("        <img src=\"../images/icons/fb.png\" alt=\"\" id=\"fb\">\n");
      out.write("        <img src=\"../images/icons/ig.png\" alt=\"\" id=\"ig\">\n");
      out.write("        <img src=\"../images/icons/tw.png\" alt=\"\" id=\"tw\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    </footer>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        document.querySelector(\"#btn4\").onclick = function() {\n");
      out.write("            window.open(\"./places3.html\");\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#btn3\").onclick = function() {\n");
      out.write("            window.open(\"./places4.html\");\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#btn2\").onclick = function() {\n");
      out.write("            window.open(\"./places2.html\");\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#btn1\").onclick = function() {\n");
      out.write("            window.open(\"./places.html\");\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#form\").onclick=function(){\n");
      out.write("            window.open(\"../form/form1.html\")\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#place\").onclick=function(){\n");
      out.write("            window.open(\"#Palace\")\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#fb\").onclick=function(){\n");
      out.write("            window.open(\"https://web.facebook.com/johnson.adonu.9\")\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"#ig\").onclick=function(){\n");
      out.write("            window.open(\"https://www.instagram.com/\")\n");
      out.write("        };\n");
      out.write("        document.querySelector(\"tw\").onclick=function(){\n");
      out.write("            window.open(\"https://twitter.com/home\")\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!-- '//' -->");
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
