<%-- 
    Document   : res
    Created on : 24 Jun, 2018, 1:27:22 PM
    Author     : SATYARTH
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>RESIDENTIAL</title>
</head>
<body bgcolor="#ccffe6">
<center><img class="centerImage" src="untitled.jpg" alt="Smiley face" height="250" width="250">
	<h1>AIRPORT AUTHORITY OF INDIA</h1>
	<h2>WELCOME</h2>
	<h2>Quarter Allocation System</h2>
</center>


<table border="5" cellpadding="3" width="100%" align="center"
cellspacing="3">
  <tr>
    <td bgcolor="#33ff33" ><center><font size="4"><b>REGISTRATION</b></center></font></center></td>
      <td bgcolor="#33ff33"><center><font size="4"><b>OFFICIAL DETAILS</b></center></font></center></td>
          <td bgcolor="#42b3f4"><center><font size="4"><b>RESIDENTIAL DETAILS</b></center></font></center></td>

  </tr>
</table>
<br>
<br>
<br>

<style type="text/css">
	#r1{
		 background-color: #ff1a1a; 
    border: none;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
	}

		#s1{
		 background-color: #009933; 
    border: none;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
	}


</style>

<form action="residence.jsp">


<table style="font-weight: bold; font-size: 18" border="1" cellpadding="3" width="80%" bgcolor="#ffcccc" align="center"
cellspacing="12">

<tr>
<td colspan=2>
<center><font size=4><b>RESIDENTIAL FORM</b></font></center>
</td>
</tr>

<tr>
<td>1) Present Residential Address</td>
<td><input type="text" name="padd" size="30" required></td>
</tr>

<tr>
<td>2) Are you or or spouse occupying accomodation alloted by any departmental or any other pool</td>
<td><input type="radio" name="oacc" value="yes" size="10" required>YES
<input type="radio" name="oacc" value="no" size="10" required>NO</td>
</tr>


<tr>
<td>3) Sanctioned housing / building loan?</td>
<td><input type="radio" name="loan" value="yes" size="10" required>YES
<input type="radio" name="loan" value="no" size="10" required>NO</td>
</tr>
<tr>
<td>4) Whether applied for housing loan from any other source other than govt.?</td>
<td><input type="radio" name="gloan" value="yes" size="10" required>YES
<input type="radio" name="gloan" value="no" size="10" required>NO</td>
</tr>
</table>
<br>
<br>
<center><input type="reset" id="r1"/>

	<span style="display:inline-block; width: 50px;"></span>
<input id="s1" type="submit" value="submit" name="submit"/>
</center>

</form>
<br>
<br>
<% 
   String name= (String)session.getAttribute("name");
   String empid= (String)session.getAttribute("empid");
   String padd= request.getParameter("padd");
   String oacc= request.getParameter("oacc");
   String loan= request.getParameter("loan");
   String otherloan= request.getParameter("gloan");
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
   Statement st=con.createStatement();
   if(request.getParameter("submit")!=null)
          {
              st.executeQuery("Insert into RESAAI values('"+name+"','"+empid+"','"+padd+"','"+oacc+"','"+loan+"','"+otherloan+"')");
              out.println("<h1>Inserted</h1>");
          }

   if(oacc!=null) {
   if(oacc.equalsIgnoreCase("yes"))
    response.sendRedirect("error.jsp");
   else
    response.sendRedirect("view.jsp");
}
%>

</body>
</html>

