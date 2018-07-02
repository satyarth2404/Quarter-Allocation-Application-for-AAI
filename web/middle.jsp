<html>
<head>
<title>Instructions</title>
<style>
    .header {
    background-color:black ;
    }
    .name{
        color: white;
    }
</style>
</head>

<body bgcolor="#ccffe6">
    <%
        String name=(String)session.getAttribute("nm");
        %>
    
      <h1>Please read the instructions carefully before filling the Application Form</h1>

      <div class="header">
        <h3 class="name"> Hi <%=name %></h3>
    </div>
    
<h3 style="color: red">All fields marked * are compulsory</h3>

<h4>1> Keep the following information ready before filling the Application:</h4>

<h4>2> Aadhaar No, PAN No</h4>

<h4>3> Date of Birth, Date of Initial Appointment,Date of Arrival in Station.</h4>

<h4>4> Scanned Copy of the recent passport size photograph in any of the following formats (jpeg,jpg,gif,png) and less than 50 kb in size.</h4>

<h4>5> In case your Department ,Sub division or designation is not in the list provided ,please contact the Housing & Estate Section for adding the same.</h4>

<h4>6> Check your Application throughly before submitting.</h4>

<h4>7> You cannot edit the Application once it is submitted.</h4>

<h4>8> On Submit You will get an Application No. and the Screen for Printing the Application will automatically open.</h4>

<h4>9> You can also print the Application form using the 'Download Form' option on the index page.</h4>


<h4>10> In case you want to change any data ,change it on the printed Application. Get the change verified by your Forwarding Officer and submit it to the Housing & Estate Section.</h4>

<h4>11> In case any information furnished by you is found incorrect you will be liable for disciplinary action by the Department.</h4>	

<br>
<br>

<center><div id="button"><a href="regis.jsp"><b>PROCEED</b></a></div>
</center>
</body>

</html>