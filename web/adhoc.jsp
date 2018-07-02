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
<center><font size=4><b>ADHOC REGISTRATION</b></font></center>
</td>
</tr>
<br>
<tr>
<td><b>1) Your name</b></td>
<td><input type="text" name="fname" size="30" required>MAX_SIZE=30</td>
</tr>
<tr>
<td><b>2) Employee ID of your family member who passed away</b></td>
<td><input type="text" name="passemp"  size="30" required>MAX_SIZE=30</td>
</tr>

<tr>
<td><b>3) Name of Family Member who passed away</b></td>
<td><input type="text" name="passname" 
size="30" required>MAX_SIZE=30</td>
</tr>

<tr>
<td><b>4) Your Age</b></td>
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
<td><b>7) Relation With the employee of AAI</b></td>
<td><input type="relation" name="nos"  size="30">MAX_SIZE=30</td>
</tr>

<tr>
<td><b>8)Date of death of family member</b></td>
<td><input type="text" name="dod"  size="30">MAX_SIZE=30</td>
</tr>

<tr>
<td><b>9)Your  AADHAAR CARD</b></td>
<td><input type="text" name="aadhar" size="12" required>MAX_SIZE=12</td>
</tr>

<tr>
<td><b>10)Your PAN CARD</b></td>
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
        String passemp= request.getParameter("passemp");
        String passname= request.getParameter("passname");
        String age= request.getParameter("dob");
	String sex = request.getParameter("sex");
	String marital = request.getParameter("Marital");
	String relation = request.getParameter("nos");
	String dod = request.getParameter("dod");
	String aadhar = request.getParameter("aadhar");
        String pan= request.getParameter("pan");
        String email=request.getParameter("emailid");
        String mobile=request.getParameter("mobileno");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        Statement st=con.createStatement();
        session.setAttribute("adname",name);
        session.setAttribute("passemp",passemp);
        int age1=0;
        try {
         age1=Integer.parseInt(age);
        }
        catch(NumberFormatException nfe) {
            nfe.printStackTrace();;
        }
        
          if(request.getParameter("submit")!=null)
          {
              if(age1<18){
            response.sendRedirect("agelimit.jsp");
                }
              else {
              st.executeQuery("Insert into ADHOC values('"+name+"','"+passemp+"','"+passname+"','"+age+"','"+sex+"','"+marital+"','"+relation+"','"+dod+"','"+aadhar+"','"+pan+"','"+email+"','"+mobile+"')");
              response.sendRedirect("adsuc.jsp");
          }
          }
        
%>

</body>
</html>


