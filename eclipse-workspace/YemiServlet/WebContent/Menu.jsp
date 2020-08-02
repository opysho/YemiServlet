'<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1> PROGRAM MENU LIST</h1>
<body>
<form method = "post" action="studentInfo.html">
<p><label>Check a student information!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name = "accessNumber" value =""/><label><em>Only student access number allowed.</em></label>
<br>
<input type = "submit" value= "Click Here !!!!"/>
</form>

<b></b>

<form method = "post" action="studentResult.html">
<p><label>Check student results!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name = "accessNumber" value =""/><label><em>Only student access number allowed.</em></label>
<br>
<input type = "submit" value= "Click Here !!!!"/>
</form>

<b></b>

<form method="post" action="checkFees.html">

<p><label>Check financial records!!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name="accessNumber" value=""/>
<br>
<input type="submit" value= "Click Here !!!!">

</form>

<b></b>

<form method="post" action="checkInfo.html">
<p><label>Check personal information!!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name="accessNumber" value=""/><label><em>All access number allowed.</em></label>
<br>
<input type="submit" value= "Click Here !!!!">
</form>

<b></b>

<form method="post" action="updateResult.html">
<p><label>Update Results!!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name="accessNumber" value=""/><label><em>Only a teacher can access this page .</em></label>
<br>
<input type="submit" value= "Click Here !!!!">
</form>

<b></b>
<form method="post" action="updateFees.html">
<p><label>Update Financial Records!!!!</label>
<br>
<label><em>Enter access number</em></label>
<br>
<input type = "text" name="accessNumber" value=""/><label><em>Only the account officer can access this page.</em></label>
<br>
<input type="submit" value= "Click Here !!!!">
</form>

<b></b>





<b></b>

<form method= "post" action="frontPage.html" >
<input type="submit" value= "Return to the Home page"/>
</form>

</body>
</html>