<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String reply;
reply = (String)request.getAttribute("listIsEmpty");
out.println(reply);
%>

<form method = "post" action="returnToMenu.html">

<input type= "submit" value = "Go back to menu.">


</form>


</body>
</html>