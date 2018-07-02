package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>AIRPORT AUTHORITY OF INDIA</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ccffe6\">\n");
      out.write("\t<center><img class=\"centerImage\"src=\"untitled.jpg\" alt=\"Smiley face\" height=\"250\" width=\"250\">\n");
      out.write("\t<h1>AIRPORT AUTHORITY OF INDIA</h1>\n");
      out.write("\t<h2>WELCOME</h2>\n");
      out.write("\t<h2>Quarter Allocation System</h2>\n");
      out.write("\t<a href=\"https://www.aai.aero/en/system/files/employee_corner/13.%20%20Allotment%20rules.pdf\">Click here for Accomodation Rules</a><br>\n");
      out.write("\t<a href=\"https://www.aai.aero/hi/system/files/employee_corner/Housing%20Allotment%20Revised%20Scheme.pdf\">For Accomodation Rules and forms click here:</a>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<center><div id=\"button\"><a href=\"track.jsp\"><b>CLICK HERE TO TRACK YOUR BOOKING STATUS</b></a></div>\n");
      out.write("</center> <br>\n");
      out.write("\n");
      out.write("<center><div id=\"button\"><a href=\"adhoc.jsp\"><b>CLICK HERE TO APPLY ON AN AD-HOC BASIS</b></a></div>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  #r1{\n");
      out.write("     background-color: #ff1a1a; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("    #s1{\n");
      out.write("     background-color: #009933; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"loginForm\" action=\"emplog\">\n");
      out.write("<table  border=\"1\" width=\"80%\" bgcolor=\"#99ff66\" align=\"center\" cellpadding=\"3\" cellspacing=\"12\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=4><center><font size=4><b>AIRPORT AUTHORITY OF INDIA</b></font></center></td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("<td><b>Username :  </b></td>\n");
      out.write("\n");
      out.write("<td><input type=\"text\" size=25 name=\"username\">  MAX_SIZE=25</td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("<td><b>Password :  </b></td>\n");
      out.write("\n");
      out.write("<td><input type=\"Password\" size=25 name=\"password\">  MAX_SIZE=25</td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<center>\n");
      out.write("<input id=\"r1\" type=\"Reset\">\n");
      out.write("<span style=\"display:inline-block; width: 50px;\"></span>\n");
      out.write("<input id=\"s1\" type=\"submit\" onclick=\"return check(this.form)\" value=\"Login\">\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center><h3>For any info regarding application form or login details, please contact : commn@aai.aero</h3></center>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
