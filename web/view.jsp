<%-- 
    Document   : view
    Created on : 26 Jun, 2018, 2:38:28 AM
    Author     : SATYARTH
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Request Invoice</title>
    </head>
    <body>
        <%
            String name= (String)session.getAttribute("name");
            String empid= (String)session.getAttribute("empid");
            String invoice= name.charAt(0)+ empid;
            String status="Pending";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            Statement st=con.createStatement();
            st.executeQuery("Insert into VIEWSTATUS values('"+name+"','"+empid+"','"+invoice+"','"+status+"')");
            
            %>
       
            <div class="container">
  <h2>Request Confirmation</h2>
  <p>This is an electronically generated receipt:</p>            
  <table class="table table-striped">
      <thead>
          <tr>
      <td>Name</td>
      <td>Employee ID</td>
      <td>Invoice</td>
          </tr>
      </thead>
    <tbody>
      <tr>
        <td><%= name %></td>
        <td><%=empid %></td>
        <td><%=invoice %></td>
      </tr>
    </tbody>
  </table>
            </div>
      <a href="index.html">Home</a>
    </body>
</html>
