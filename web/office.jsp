<%-- 
    Document   : off.jsp
    Created on : 24 Jun, 2018, 1:26:00 PM
    Author     : SATYARTH
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>AIRPORT AUTHORITY OF INDIA</title>
</head>


	<center><img align="top" src="untitled.jpg" alt="Smiley face" height="250" width="250">
	<h1>AIRPORT AUTHORITY OF INDIA</h1>
	<h2>Quarter Allocation System</h2>
</center>

<body bgcolor="#ccffe6">
	<table border="5" cellpadding="3" width="100%" align="center"
cellspacing="3">
  <tr>
    <td bgcolor="#33ff33" ><center><font size="4"><b>REGISTRATION</b></center></font></center></td>
      <td bgcolor="#42b3f4"><center><font size="4"><b>OFFICIAL DETAILS</b></center></font></center></td>
          <td bgcolor="#ff3333"><center><font size="4"><b>RESIDENTIAL DETAILS</b></center></font></center></td>

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


<form>

<table style="font-weight: bold; font-size: 18" border="1" cellpadding="3" width="80%" bgcolor="#ffcccc" align="center"
cellspacing="12">

<tr>
<td colspan=2>
<center><font size=4><b>OFFICIAL FORM</b></font></center>
</td>
</tr>

<tr>
<td>1) Service to which Official/Officer belong</td>
<td><input type=text name="service" id="service" size="30" required></td>
</tr>

<tr>
<td>2) Present Address</td>
<td><input type="text" name="padd" id="padd"
size="30" required></td>
</tr>
<tr>
<td>3) Designation</td>
<td><input type="text" name="designation" id="designation" size="30" required></td>
</tr>


<tr>
<td>4) Department</td>
<td><input type="text" name="dept" id="dept" size="30" required></td>
</tr>

<tr>
<td>5) Groups</td>
<td><input type="text" name="groups" id="groups" size="30" required></td>
</tr>

<tr>
<td>6) Date from which continuously employed in govt. service</td>
<td><input type="text" name="dtemp" id="dtemp" size="30" required></td>
</tr>

<tr>
<td>7) Date of Superannuation/Retirement</td>
<td><input type="text" name="dtret" id="dtret" size="30" required></td>
</tr>

<tr>
<td>8) Date from which continuously posted in the present city</td>
<td><input type="text" name="dtpresent" id="dtpresent" size="30" required></td>
</tr>

<tr>
<td>9) Eligible for rent free accomodation</td>
<td><input type="text" name="eligible" id="eligible" size="30" required></td>
</tr>
<tr>
<td>10) Entitled for HRA</td>
<td><input type="text" name="hra" id="hra" size="30" required></td>
</tr>
<tr>
<td>11) Service Status</td>
<td><input type="text" name="servicest" id="servicest" size="30" required></td>
</tr>
<tr>
<td>12) Pay Scale</td>
<td><input type="text" name="pays" id="pays" size="30" required></td>
</tr>
<tr>
<td>13) Basic Pay</td>
<td><select name="bpay">
<option value="10200 - 12749">10200 - 12749</option>
<option value="10200 - 12749">10200 - 12749</option>
<option value="12750 - 17379">12750 - 17379</option>
<option value="17380 - 33599">17380 - 33599</option>
<option value="33600 - 40549">33600 - 40549</option>
<option value="33600 - 40549">33600 - 40549</option>
<option value="40550 - 55019">40550 - 55019</option>
<option value="55020 & above">55020 & above</option>
</select></td>
</tr>

<tr>
<td><b>14) Entitlement of Accomodation</b></td>
<td><select name="entitlement">
<option value="A1">A1 :10200 - 12749</option>
<option value="A2">A2 :10200 - 12749</option>
<option value="B1">B1 :12750 - 17379</option>
<option value="B2">B2 :17380 - 33599</option>
<option value="C1">C1 :33600 - 40549</option>
<option value="C2">C2 :33600 - 40549</option>
<option value="D">D :40550 - 55019</option>
<option value="E">E :55020 & above</option>
</select></td>
</tr>  
</table>

<br>
<br>
<center><input type="reset" id="r1"/>

  <span style="display:inline-block; width: 50px;"></span>
<input id="s1" type="submit" value="submit" name="submit"/>
</center>
<br>
<br>


</form> 
<br>
<br>
<%
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
                  response.sendRedirect("erroroff.jsp");
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
   
    %>
</body>
</html>


