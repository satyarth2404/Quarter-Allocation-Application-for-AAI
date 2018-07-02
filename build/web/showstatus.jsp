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
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
    <td bgcolor="#33ff33" ><center><font size="4"><b>BOOKING STATUS</b></center></font></center></td>
     

  </tr>
</table>

<br>
<br>
<br>
<%
    String name=(String)session.getAttribute("name1");
    String empid=(String)session.getAttribute("empid1");
    String invoice=(String)session.getAttribute("invoice");
    String status=(String)session.getAttribute("status");
 
    %>
    
    <table class="table table-striped">
      <thead>
          <tr>
      <td>Name</td>
      <td>Employee ID</td>
      <td>Invoice</td>
      <td>Status</td>
          </tr>
      </thead>
    <tbody>
      <tr>
        <td><%= name %></td>
        <td><%=empid %></td>
        <td><%=invoice %></td>
        <td><%=status %></td>
      </tr>
    </tbody>
  </table>
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

