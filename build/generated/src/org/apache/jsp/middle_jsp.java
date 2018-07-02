package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class middle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Instructions</title>\n");
      out.write("<style>\n");
      out.write("    .header {\n");
      out.write("    background-color:black ;\n");
      out.write("    }\n");
      out.write("    .name{\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#ccffe6\">\n");
      out.write("    ");

        String name=(String)session.getAttribute("nm");
        
      out.write("\n");
      out.write("    \n");
      out.write("      <h1>Please read the instructions carefully before filling the Application Form</h1>\n");
      out.write("\n");
      out.write("      <div class=\"header\">\n");
      out.write("        <h3 class=\"name\"> Hi ");
      out.print(name );
      out.write("</h3>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<h3 style=\"color: red\">All fields marked * are compulsory</h3>\n");
      out.write("\n");
      out.write("<h4>1> Keep the following information ready before filling the Application:</h4>\n");
      out.write("\n");
      out.write("<h4>2> Aadhaar No, PAN No</h4>\n");
      out.write("\n");
      out.write("<h4>3> Date of Birth, Date of Initial Appointment,Date of Arrival in Station.</h4>\n");
      out.write("\n");
      out.write("<h4>4> Scanned Copy of the recent passport size photograph in any of the following formats (jpeg,jpg,gif,png) and less than 50 kb in size.</h4>\n");
      out.write("\n");
      out.write("<h4>5> In case your Department ,Sub division or designation is not in the list provided ,please contact the Housing & Estate Section for adding the same.</h4>\n");
      out.write("\n");
      out.write("<h4>6> Check your Application throughly before submitting.</h4>\n");
      out.write("\n");
      out.write("<h4>7> You cannot edit the Application once it is submitted.</h4>\n");
      out.write("\n");
      out.write("<h4>8> On Submit You will get an Application No. and the Screen for Printing the Application will automatically open.</h4>\n");
      out.write("\n");
      out.write("<h4>9> You can also print the Application form using the 'Download Form' option on the index page.</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h4>10> In case you want to change any data ,change it on the printed Application. Get the change verified by your Forwarding Officer and submit it to the Housing & Estate Section.</h4>\n");
      out.write("\n");
      out.write("<h4>11> In case any information furnished by you is found incorrect you will be liable for disciplinary action by the Department.</h4>\t\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<center><div id=\"button\"><a href=\"regis.jsp\"><b>PROCEED</b></a></div>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
