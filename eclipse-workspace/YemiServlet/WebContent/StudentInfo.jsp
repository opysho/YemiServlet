<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.List" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "za.co.fnb.People.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>STUDENT INFORMATION .......</h2>
<body>
<br>

<%
List<Person> list = new ArrayList<>();
list = (List<Person>)request.getAttribute("studentInfoList");
for(Person p : list){
out.println("Surname : "+p.getSurname());
out.println("First name : "+p.getFirstName());
out.println("Date of Birth : "+p.getDateOfBirth());
out.println("Age : "+p.getAge());
out.println("Sex : "+p.getSex());
out.println("Address : "+p.getAddress());
out.println("Phone number : "+p.getPhoneNumber());
out.println("Email : "+p.getEmail());
out.println("Grade : "+p.getGrade());
out.println("Subject : "+p.getSubject1());
out.println("Subject : "+p.getSubject2());
out.println("Subject : "+p.getSubject3());
out.println("Subject : "+p.getSubject4());
out.println("Subject : "+p.getSubject5());

}
%>
<br>
<form method = "post" action="returnToMenu.html">

<input type= "submit" value = "Go back to menu.">


</form>

</body>
</html>