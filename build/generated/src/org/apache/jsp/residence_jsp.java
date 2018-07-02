package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class residence_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>RESIDENTIAL</title>\n");
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
      out.write("    <td bgcolor=\"#33ff33\" ><center><font size=\"4\"><b>REGISTRATION</b></center></font></center></td>\n");
      out.write("      <td bgcolor=\"#33ff33\"><center><font size=\"4\"><b>OFFICIAL DETAILS</b></center></font></center></td>\n");
      out.write("          <td bgcolor=\"#42b3f4\"><center><font size=\"4\"><b>RESIDENTIAL DETAILS</b></center></font></center></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
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
      out.write("<form action=\"residence.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table style=\"font-weight: bold; font-size: 18\" border=\"1\" cellpadding=\"3\" width=\"80%\" bgcolor=\"#ffcccc\" align=\"center\"\n");
      out.write("cellspacing=\"12\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=2>\n");
      out.write("<center><font size=4><b>RESIDENTIAL FORM</b></font></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>1) Present Residential Address</td>\n");
      out.write("<td><input type=\"text\" name=\"padd\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>2) Are you or or spouse occupying accomodation alloted by any departmental or any other pool</td>\n");
      out.write("<td><input type=\"radio\" name=\"oacc\" value=\"yes\" size=\"10\" required>YES\n");
      out.write("<input type=\"radio\" name=\"oacc\" value=\"no\" size=\"10\" required>NO</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>3) Sanctioned housing / building loan?</td>\n");
      out.write("<td><input type=\"radio\" name=\"loan\" value=\"yes\" size=\"10\">YES\n");
      out.write("<input type=\"radio\" name=\"loan\" value=\"no\" size=\"10\">NO</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>4) Whether applied for housing loan from any other source other than govt.?</td>\n");
      out.write("<td><input type=\"radio\" name=\"gloan\" value=\"yes\" size=\"10\">YES\n");
      out.write("<input type=\"radio\" name=\"gloan\" value=\"no\" size=\"10\">NO</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<center><input type=\"reset\" id=\"r1\"/>\n");
      out.write("\n");
      out.write("\t<span style=\"display:inline-block; width: 50px;\"></span>\n");
      out.write("<input id=\"s1\" type=\"submit\" value=\"Submit Form\" name=\"submit\"/>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
 
   String oacc= request.getParameter("oacc");
   if(oacc!=null) {
   if(oacc.equalsIgnoreCase("yes"))
    out.println("<h1>Sorry your application is rejected</h1>");
   else
    response.sendRedirect("index.html");
}

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
