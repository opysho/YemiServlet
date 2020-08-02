<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.List" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "za.co.fnb.Fee.Fee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<Fee> list = new ArrayList<>();
list = (List<Fee>)request.getAttribute("finance");

for(Fee fee: list){
out.println("Access Number :" + fee.getPersonalNumber());
out.println("Purpose of payment :" + fee.getPurposeOfPayment());
out.println("Date of payment :" +fee.getDateOfPayment());
out.println("Amount payable :" +fee.getInitialAmount());
out.println("Amount paid  :" +fee.getAmountPaid());
out.println("Amount balance :" + fee.getAmountBalance());
}
%>
<form method = "post" action="returnToMenu.html">
<br>
<input type= "submit" value = "Go back to menu.">
</form>
</body>
</html>