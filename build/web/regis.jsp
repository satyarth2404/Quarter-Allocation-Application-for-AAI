<%-- 
    Document   : reg
    Created on : 24 Jun, 2018, 12:14:10 PM
    Author     : SATYARTH
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>AIRPORT AUTHORITY OF INDIA</title>
</head>
<body bgcolor="#ccffe6">
	<center><img align="top" src="untitled.jpg" alt="Smiley face" height="250" width="250">
	<h1>AIRPORT AUTHORITY OF INDIA</h1>
	<h2>Quarter Allocation System</h2></center>


<table border="5" cellpadding="3" width="100%" align="center"
cellspacing="3">
  <tr>
    <td bgcolor="#42b3f4" ><center><font size="4"><b>REGISTRATION</b></center></font></center></td>
      <td bgcolor="#ff3333"><center><font size="4"><b>OFFICIAL DETAILS</b></center></font></center></td>
          <td bgcolor="#ff3333"><center><font size="4"><b>RESIDENTIAL DETAILS</b></center></font></center></td>

  </tr>


</table>
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

<table border="1" cellpadding="3" width="80%" bgcolor="#ffff66" align="center"
cellspacing="12">

<tr>
<td colspan=2>
<center><font size=4><b>Registration Form</b></font></center>
</td>
</tr>
<br>
<tr>
<td><b>1) Name of Employee</b></td>
<td><input type="text" name="fname" size="30" required>MAX_SIZE=30</td>
</tr>
<tr>
<td><b>2) Employee ID</b></td>
<td><input type="text" name="empid"  size="30" required>MAX_SIZE=30</td>
</tr>

<tr>
<td><b>3) Name of Father</b></td>
<td><input type="text" name="fathername" 
size="30" required>MAX_SIZE=30</td>
</tr>

<tr>
<td><b>4) Date Of Birth</b></td>
<td><input type="text" name="dob" size="30" required>MAX_SIZE=30</td>
</tr>



<td><b>5) Sex</b></td>
<td><input type="radio" name="sex" value="male" size="10" required>Male
<input type="radio" name="sex" value="Female" size="10" required>Female</td>
</tr>



<tr>
<td><b>6) Marital Status</b></td>
<td><select Name="Marital">
<option value="Married">Married</option>
<option value="Unmarried">Unmarried</option>
<option value="Widow">Widow</option>
<option value="Widower">Widower</option>
<option value="Divorcee">Divorcee</option>
</select></td>
</tr>  


<tr>
<td><b>7) Name of Spouse (If Applicable)</b></td>
<td><input type="text" name="nos"  size="30">MAX_SIZE=30</td>
</tr>

<tr>
<td><b>8) Spouse's Employee ID (If Applicable)</b></td>
<td><input type="text" name="sei"  size="30">MAX_SIZE=30</td>
</tr>

<tr>
<td><b>9) AADHAAR CARD</b></td>
<td><input type="text" name="aadhar" size="12" required>MAX_SIZE=12</td>
</tr>

<tr>
<td><b>10) PAN CARD</b></td>
<td><input type="text" name="pan"  size="10" required>MAX_SIZE=10</td>
</tr>

<tr>
<td><b>11) Email Id</b></td>
<td><input type="text" name="emailid"  size="30" required>MAX_SIZE=30</td>
</tr>



<tr>
<td><b>12) Mobile No.</b></td>
<td><input type="text" name="mobileno"  size="10" required>MAX_SIZE=10</td>
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
<%      String name =  request.getParameter("fname");
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
         
%>
</body>
</html>


