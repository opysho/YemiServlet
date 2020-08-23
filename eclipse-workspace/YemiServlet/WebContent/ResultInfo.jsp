<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.List" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "za.co.fnb.Result.Result" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><h2>RESULT INFORMATION</h2>

<%
List<Result> lists = new ArrayList<>();
lists = (List<Result>)request.getAttribute("personResult");

for(Result result: lists)
{
out.println("Access number :" + result.getExamNumber());
out.println("Subject name :" + result.getSubject());
out.println("Assignment Mark :" +result.getAssignmentMarks());
out.println("Test Mark :" +result.getTestMarks());
out.println("Exam Mark :" +result.getExaminationMarks());
out.println("Final Score :" + result.getAverageMarks() + "%");
out.println("    ");
double remark = result.getAverageMarks();
if(remark < 50.0){
	out.println("Your is below average, you need to work harder");
}else {
	out.println("Your result is above average, welldone. Keep it up!");
}
}
%>
<form method = "post" action="returnToMenu.html">
<br>
<input type= "submit" value = "Go back to menu.">
</form>

</body>
</html>