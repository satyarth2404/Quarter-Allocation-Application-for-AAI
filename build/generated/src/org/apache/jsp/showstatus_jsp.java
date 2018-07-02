package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class showstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>RESIDENTIAL</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ccffe6\">\n");
      out.write("<center><img class=\"centerImage\" src=\"untitled.jpg\" alt=\"Smiley face\" height=\"250\" width=\"250\">\n");
      out.write("\t<h1>AIRPORT AUTHORITY OF INDIA</h1>\n");
      out.write("\t<h2>WELCOME</h2>\n");
      out.write("\t<h2>Quarter Allocation System</h2>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"5\" cellpadding=\"3\" width=\"100%\" align=\"center\"\n");
      out.write("cellspacing=\"3\">\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#33ff33\" ><center><font size=\"4\"><b>BOOKING STATUS</b></center></font></center></td>\n");
      out.write("     \n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");

    String name=(String)session.getAttribute("name1");
    String empid=(String)session.getAttribute("empid1");
    String invoice=(String)session.getAttribute("invoice");
    String status=(String)session.getAttribute("status");
 
    
      out.write("\n");
      out.write("    \n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("      <thead>\n");
      out.write("          <tr>\n");
      out.write("      <td>Name</td>\n");
      out.write("      <td>Employee ID</td>\n");
      out.write("      <td>Invoice</td>\n");
      out.write("      <td>Status</td>\n");
      out.write("          </tr>\n");
      out.write("      </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>");
      out.print( name );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(empid );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(invoice );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(status );
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t#r1{\n");
      out.write("\t\t background-color: #ff1a1a; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\t#s1{\n");
      out.write("\t\t background-color: #009933; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
