<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<br>
<b></b>

<%
String reply;
reply = (String)request.getAttribute("responseName");
out.println(reply);
%>

<br>
<b></b>

<form method= "post" action="frontPage.html" >
<input type="submit" value= "Return to the Home page"/>
</form>
</body>
</html>