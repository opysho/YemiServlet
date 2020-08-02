<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Update student academic result!</h2>
<body>
<form method = "post" action="resultInputted.html">
<p><label>Enter access number :</label>
<input type="text" name = "accessNumber" value =""/> <label><em>Student access number only.</em></label>
<br>
<p><label>Enter subject :</label>
<select name="subject">
	<option>Select</option>
	<option value="English">English-101</option>
	<option value="Mathematics">Mathematics-102</option>
	<option value="Biology">Biology-103</option>
	<option value="Physics">Physics-104</option>
	<option value="Chemistry">Chemistry-105</option>
	<option value="Economics">Economics-106</option>
	<option value="Histroy">History-107</option>
	<option value="Literature">Literature-108</option>
	<option value="Physical Education">Physical Education-109</option>
	<option value="Commerce">Commerce-110</option>
</select>
<br>
<p><label>Enter assignment score :</label>
<input type="text" name= "assignment" value=""/>
<br>
<p><label>Enter test score :</label>
<input type="text" name= "test" value=""/>
<br>
<p><label>Enter exam score :</label>
<input type="text" name= "exam" value=""/>
<br>

<input type="submit" value= "Update Result !!!">

</form>

</body>
</html>