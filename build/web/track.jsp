<%-- 
    Document   : res
    Created on : 24 Jun, 2018, 1:27:22 PM
    Author     : SATYARTH
--%>

<%@page import="java.sql.ResultSet"%>
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
    <td bgcolor="#33ff33" ><center><font size="4"><b>APPLICATION TRACKING</b></center></font></center></td>
     

  </tr>
</table>

<br>
<br>
<br>
<form name="track">
<table  border="1" width="80%" bgcolor="#99ff66" align="center" cellpadding="3" cellspacing="12">

<tr>
<td colspan=4><center><font size=4><b>AIRPORT AUTHORITY OF INDIA</b></font></center></td>
</tr>
<br>
<tr>
<td><b>REQUEST INVOICE :  </b></td>

<td><input type="text" size=25 name="invoice"></td>
</tr>
</table>
    <br><br>
    
    <center><input type="reset" id="r1"/>

	<span style="display:inline-block; width: 50px;"></span>
<input id="s1" type="submit" value="submit" name="submit"/>
</center>
    
    <%
            String invoice=request.getParameter("invoice");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
           
            Statement st=con.createStatement();
            String select="select * from VIEWSTATUS where INVOICE='"+invoice+"'"; 
            ResultSet rs=st.executeQuery(select);
            if(rs.next()) {
            String name=rs.getString("NAME");
            String empid=rs.getString("EMPID");
            String status=rs.getString("STATUS");
            session.setAttribute("name1",name);
            session.setAttribute("empid1", empid);
            session.setAttribute("invoice",invoice);
            session.setAttribute("status",status);
            response.sendRedirect("showstatus.jsp");
            }
           
        %>
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


<br>
<br>


	

</form>
<br>
<br>


</body>
</html>


