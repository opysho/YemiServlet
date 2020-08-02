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
<h2>PERSONAL INFORMATION</h2>
<body>
<%
List<Person> list = new ArrayList<>();
list = (List<Person>)request.getAttribute("otherInfo");
for(Person p : list){
out.println("Surname : "+p.getSurname());
out.println("First name : "+p.getFirstName());
out.println("Date of Birth : "+p.getDateOfBirth());
out.println("Age : "+p.getAge());
out.println("Sex : "+p.getSex());
out.println("Address : "+p.getAddress());
out.println("Phone number : "+p.getPhoneNumber());
out.println("Email : "+p.getEmail());
out.println("Previous school attended : "+p.getPreviousSchool());
out.println("Previous grade completed : "+p.getGradeCompleted());
out.println("Present Grade : "+p.getGrade());
out.println("Subject : "+p.getSubject1());
out.println("Subject : "+p.getSubject2());
out.println("Subject : "+p.getSubject3());
out.println("Subject : "+p.getSubject4());
out.println("Subject : "+p.getSubject5());
out.println("Guardian Fullnames : "+p.getGuardianFullnames());
out.println("Guardian Address : "+p.getAddress());
out.println("Guardian Phone number : "+p.getGuardianPhoneNumber());
out.println("Post  : "+p.getPost());
}
%>
<br>
<form method = "post" action="returnToMenu.html">

<input type= "submit" value = "Go back to menu.">


</form>
</body>
</html>