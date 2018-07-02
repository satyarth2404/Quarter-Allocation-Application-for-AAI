package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class office_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>AIRPORT AUTHORITY OF INDIA</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<center><img align=\"top\" src=\"untitled.jpg\" alt=\"Smiley face\" height=\"250\" width=\"250\">\n");
      out.write("\t<h1>AIRPORT AUTHORITY OF INDIA</h1>\n");
      out.write("\t<h2>Quarter Allocation System</h2>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#ccffe6\">\n");
      out.write("\t<table border=\"5\" cellpadding=\"3\" width=\"100%\" align=\"center\"\n");
      out.write("cellspacing=\"3\">\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#33ff33\" ><center><font size=\"4\"><b>REGISTRATION</b></center></font></center></td>\n");
      out.write("      <td bgcolor=\"#42b3f4\"><center><font size=\"4\"><b>OFFICIAL DETAILS</b></center></font></center></td>\n");
      out.write("          <td bgcolor=\"#ff3333\"><center><font size=\"4\"><b>RESIDENTIAL DETAILS</b></center></font></center></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
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
      out.write("\n");
      out.write("<form>\n");
      out.write("\n");
      out.write("<table style=\"font-weight: bold; font-size: 18\" border=\"1\" cellpadding=\"3\" width=\"80%\" bgcolor=\"#ffcccc\" align=\"center\"\n");
      out.write("cellspacing=\"12\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=2>\n");
      out.write("<center><font size=4><b>OFFICIAL FORM</b></font></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>1) Service to which Official/Officer belong</td>\n");
      out.write("<td><input type=text name=\"service\" id=\"service\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>2) Present Address</td>\n");
      out.write("<td><input type=\"text\" name=\"padd\" id=\"padd\"\n");
      out.write("size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>3) Designation</td>\n");
      out.write("<td><input type=\"text\" name=\"designation\" id=\"designation\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>4) Department</td>\n");
      out.write("<td><input type=\"text\" name=\"dept\" id=\"dept\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>5) Groups</td>\n");
      out.write("<td><input type=\"text\" name=\"groups\" id=\"groups\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>6) Date from which continuously employed in govt. service</td>\n");
      out.write("<td><input type=\"text\" name=\"dtemp\" id=\"dtemp\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>7) Date of Superannuation/Retirement</td>\n");
      out.write("<td><input type=\"text\" name=\"dtret\" id=\"dtret\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>8) Date from which continuously posted in the present city</td>\n");
      out.write("<td><input type=\"text\" name=\"dtpresent\" id=\"dtpresent\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>9) Eligible for rent free accomodation</td>\n");
      out.write("<td><input type=\"text\" name=\"eligible\" id=\"eligible\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>10) Entitled for HRA</td>\n");
      out.write("<td><input type=\"text\" name=\"hra\" id=\"hra\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>11) Service Status</td>\n");
      out.write("<td><input type=\"text\" name=\"servicest\" id=\"servicest\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>12) Pay Scale</td>\n");
      out.write("<td><input type=\"text\" name=\"pays\" id=\"pays\" size=\"30\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>13) Basic Pay</td>\n");
      out.write("<td><select name=\"bpay\">\n");
      out.write("<option value=\"10200 - 12749\">10200 - 12749</option>\n");
      out.write("<option value=\"10200 - 12749\">10200 - 12749</option>\n");
      out.write("<option value=\"12750 - 17379\">12750 - 17379</option>\n");
      out.write("<option value=\"17380 - 33599\">17380 - 33599</option>\n");
      out.write("<option value=\"33600 - 40549\">33600 - 40549</option>\n");
      out.write("<option value=\"33600 - 40549\">33600 - 40549</option>\n");
      out.write("<option value=\"40550 - 55019\">40550 - 55019</option>\n");
      out.write("<option value=\"55020 & above\">55020 & above</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b>14) Entitlement of Accomodation</b></td>\n");
      out.write("<td><select name=\"entitlement\">\n");
      out.write("<option value=\"A1\">A1 :10200 - 12749</option>\n");
      out.write("<option value=\"A2\">A2 :10200 - 12749</option>\n");
      out.write("<option value=\"B1\">B1 :12750 - 17379</option>\n");
      out.write("<option value=\"B2\">B2 :17380 - 33599</option>\n");
      out.write("<option value=\"C1\">C1 :33600 - 40549</option>\n");
      out.write("<option value=\"C2\">C2 :33600 - 40549</option>\n");
      out.write("<option value=\"D\">D :40550 - 55019</option>\n");
      out.write("<option value=\"E\">E :55020 & above</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>  \n");
      out.write("</table>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("</form> \n");
      out.write("<br>\n");
      out.write("<br>\n");

   String name=(String)session.getAttribute("name");
   String empid=(String)session.getAttribute("empid");
   String service= request.getParameter("service");
   String padd= request.getParameter("padd");
   String designation= request.getParameter("designation");
   String dept= request.getParameter("dept");
   String groups= request.getParameter("groups");
   String dtemp= request.getParameter("dtemp");
   String dtret= request.getParameter("dtret");
   String dtpresent= request.getParameter("dtpresent");
   String eligible= request.getParameter("eligible");
   String hra= request.getParameter("hra");
   String servicest= request.getParameter("servicest");
   String pays= request.getParameter("pays");
   String bpay= request.getParameter("bpay");
   String entitlement= request.getParameter("entitlement");
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
   try {
   Date date = new Date();
   DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
   String strDate = dateFormat.format(date);
   String date1 = strDate.substring(0,4);
   String date2= dtret.substring(6,10);
   
   Statement st=con.createStatement(); 
   if(request.getParameter("submit")!=null)
          {
              if(date1.compareTo(date2)>0)
                  response.sendRedirect("error.jsp");
              else {
              st.executeQuery("Insert into OFFICEAAI values('"+name+"','"+empid+"','"+service+"','"+padd+"','"+designation+"','"+dept+"','"+groups+"','"+dtemp+"','"+dtret+"','"+dtpresent+"','"+eligible+"','"+hra+"','"+servicest+"','"+pays+"','"+bpay+"','"+entitlement+"')");
              out.println("<h1>Inserted</h1>");
              response.sendRedirect("residence.jsp");
              }
          }
   }
   catch(Exception E) {
       out.println("Exception");
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
