package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class regis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>AIRPORT AUTHORITY OF INDIA</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ccffe6\">\n");
      out.write("\t<center><img align=\"top\" src=\"untitled.jpg\" alt=\"Smiley face\" height=\"250\" width=\"250\">\n");
      out.write("\t<h1>AIRPORT AUTHORITY OF INDIA</h1>\n");
      out.write("\t<h2>Quarter Allocation System</h2></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"5\" cellpadding=\"3\" width=\"100%\" align=\"center\"\n");
      out.write("cellspacing=\"3\">\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#42b3f4\" ><center><font size=\"4\"><b>REGISTRATION</b></center></font></center></td>\n");
      out.write("      <td bgcolor=\"#ff3333\"><center><font size=\"4\"><b>OFFICIAL DETAILS</b></center></font></center></td>\n");
      out.write("          <td bgcolor=\"#ff3333\"><center><font size=\"4\"><b>RESIDENTIAL DETAILS</b></center></font></center></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
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
      out.write("<form>\n");
      out.write("\n");
      out.write("<table border=\"1\" cellpadding=\"3\" width=\"80%\" bgcolor=\"#ffff66\" align=\"center\"\n");
      out.write("cellspacing=\"12\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=2>\n");
      out.write("<center><font size=4><b>Registration Form</b></font></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("<td><b>1) Name of Employee</b></td>\n");
      out.write("<td><input type=\"text\" name=\"fname\" size=\"30\" required>MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>2) Employee ID</b></td>\n");
      out.write("<td><input type=\"text\" name=\"empid\"  size=\"30\" required>MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>3) Name of Father</b></td>\n");
      out.write("<td><input type=\"text\" name=\"fathername\" \n");
      out.write("size=\"30\" required>MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>4) Date Of Birth</b></td>\n");
      out.write("<td><input type=\"text\" name=\"dob\" size=\"30\" required>MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><b>5) Sex</b></td>\n");
      out.write("<td><input type=\"radio\" name=\"sex\" value=\"male\" size=\"10\" required>Male\n");
      out.write("<input type=\"radio\" name=\"sex\" value=\"Female\" size=\"10\" required>Female</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>6) Marital Status</b></td>\n");
      out.write("<td><select Name=\"Marital\">\n");
      out.write("<option value=\"Married\">Married</option>\n");
      out.write("<option value=\"Unmarried\">Unmarried</option>\n");
      out.write("<option value=\"Widow\">Widow</option>\n");
      out.write("<option value=\"Widower\">Widower</option>\n");
      out.write("<option value=\"Divorcee\">Divorcee</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>7) Name of Spouse (If Applicable)</b></td>\n");
      out.write("<td><input type=\"text\" name=\"nos\"  size=\"30\">MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>8) Spouse's Employee ID (If Applicable)</b></td>\n");
      out.write("<td><input type=\"text\" name=\"sei\"  size=\"30\">MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>9) AADHAAR CARD</b></td>\n");
      out.write("<td><input type=\"text\" name=\"aadhar\" size=\"12\" required>MAX_SIZE=12</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>10) PAN CARD</b></td>\n");
      out.write("<td><input type=\"text\" name=\"pan\"  size=\"10\" required>MAX_SIZE=10</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>11) Email Id</b></td>\n");
      out.write("<td><input type=\"text\" name=\"emailid\"  size=\"30\" required>MAX_SIZE=30</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>12) Mobile No.</b></td>\n");
      out.write("<td><input type=\"text\" name=\"mobileno\"  size=\"10\" required>MAX_SIZE=10</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<center><input type=\"reset\" id=\"r1\"/>\n");
      out.write("\n");
      out.write("  <span style=\"display:inline-block; width: 50px;\"></span>\n");
      out.write("<input id=\"s1\" type=\"submit\" value=\"submit\" name=\"submit\"/>\n");
      out.write("</center>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</form>\n");
      String name =  request.getParameter("fname");
        String empid= request.getParameter("empid");
        String fathername= request.getParameter("fathername");
        String dob= request.getParameter("dob");
	String sex = request.getParameter("sex");
	String marital = request.getParameter("Marital");
	String nos = request.getParameter("nos");
	String sei = request.getParameter("sei");
	String aadhar = request.getParameter("aadhar");
        String pan= request.getParameter("pan");
        String email=request.getParameter("emailid");
        String mobile=request.getParameter("mobileno");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        Statement st=con.createStatement();
        session.setAttribute("name",name);
        session.setAttribute("empid",empid);
          if(request.getParameter("submit")!=null)
          {
              st.executeQuery("Insert into REGAAI values('"+name+"','"+empid+"','"+fathername+"','"+dob+"','"+sex+"','"+marital+"','"+nos+"','"+sei+"','"+aadhar+"','"+pan+"','"+email+"','"+mobile+"')");
              out.println("<h1>Inserted</h1>");
              response.sendRedirect("office.jsp");
          }
         

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
