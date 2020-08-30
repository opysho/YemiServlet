<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<h3>REGISTER NOW !!!!</h3>
<body>
<form method = "post" action="registercomplete.html">
<b></b>
<label><h3>PERSONAL INFORMATION</h3></label>
<br>
<p><label>Surname :</label>
<input type ="text" name="surname" value = ""/>
<br>
<p><label>First names :</label>
<input type = "text" name = "firstName" value = ""/>
<br>
<p><label>Identity number : </label>
<input type="text" name="idNumber" value=""/>
<br>
<p><label>Date of birth :</label>
<label><em>Year</em></label>
<select name="year">
	<option>Select</option>
	<option value="2000">2000</option>
	<option value="2001">2001</option>
	<option value="2002">2002</option>
	<option value="2003">2003</option>
	<option value="2004">2004</option>
	<option value="2005">2005</option>
	<option value="2006">2006</option>
	<option value="2007">2007</option>
	<option value="2008">2008</option>
	<option value="2009">2009</option>
	<option value="2010">2010</option>
	<option value="2011">2011</option>
</select>
<label><em>Month</em></label>
<select name="month">
	<option>Select</option>
	<option value="January">January</option>
	<option value="February">February</option>
	<option value="March">March</option>
	<option value="April">April</option>
	<option value="May">May</option>
	<option value="June">June</option>
	<option value="July">July</option>
	<option value="August">August</option>
	<option value="September">September</option>
	<option value="October">October</option>
	<option value="November">November</option>
	<option value="December">December</option>
</select>
<label><em>Day</em></label>
<select name="day">
	<option>Select</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
	<option value="13">13</option>
	<option value="14">14</option>
	<option value="15">15</option>
	<option value="16">16</option>
	<option value="17">17</option>
	<option value="18">18</option>
	<option value="19">19</option>
	<option value="20">20</option>
	<option value="21">21</option>
	<option value="22">22</option>
	<option value="23">23</option>
	<option value="24">24</option>
	<option value="25">25</option>
	<option value="26">26</option>
	<option value="27">27</option>
	<option value="28">28</option>
	<option value="29">29</option>
	<option value="30">30</option>
	<option value="31">31</option>
</select>

<br>
<p><label>Age :</label>
<input type="text" name="age" value=""/>
<br>
<p><label>Sex :</label>
<label>Female </label>
<input type="radio" name= "sex" value="female"/>
<label>Male </label>
<input type = "radio" name="sex" value="male"/>
<br>
<p><label>Address :</label>
<input type="text" name="address" value=""/>
<br>
<p><label>Email :</label>
<input type ="text" name="email" value=""/>
<br>
<p><label>Phone number :</label>
<input type="text" name ="phoneNumber" value = ""/>
<br>
<p><label><h3>ACADEMIC INFORMATION</h3></label>
<br>
<label><em>FOR STUDENT APPLICANTS ONLY</em></label>
<br>
<p><label>Previous school attended :</label>
<input type="text" name ="previousSchoolAttended" value=""/>
<br>
<p><label>Grade completed :</label>
<input type="text" name="gradeCompleted" value =""/>
<br>
<p><label>Grade applying for :</label>
<input type="text" name ="gradeApplying" value = ""/>
<br>
<label>Subject 1 :</label>
<select name="subject1">
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
<label>Subject 2 :</label>
<select name="subject2">
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
<label>Subject 3 :</label>
<select name="subject3">
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
<label>Subject 4 :</label>
<select name="subject4">
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
<label>Subject 5 :</label>
<select name="subject5">
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
<p><label><h3>GUARDIAN INFORMATION/ NEXT OF KIN</h3></label>
<br>
<p><label>Surname :</label>
<input type="text" name ="guardianSurname" value = ""/>
<br>
<p><label>Full names :</label>
<input type="text" name ="guardianFullnames" value = ""/>
<br>
<p><label>Address :</label>
<input type="text" name ="guardianAddress" value = ""/>
<br>
<p><label>Phone number :</label>
<input type="text" name ="guardianPhoneNumber" value = ""/>
<br>
<p><label>Post :</label>
<select name="position">
	<option>Select</option>
	<option value="Prinicipal">Principal</option>
	<option value="Student">Student</option>
	<option value="Teacher">Teacher</option>
	<option value="Office Clerk">Office Clerk</option>
	<option value="Driver">Driver</option>
	<option value="Janitor">Janitor</option>
	<option value="Security">Security</option>
	<option value="Technician">Technician</option>
	<option value="Accountant">Accountant</option>
	<option value="Cook">Cook</option>
</select>
<br>
<p><label>Access number :</label>
<input type="text" name ="personalNumber" value=""/>
<br>
<p><label>Password :</label>
<input type="text" name="password" value=""/>
<br>
<br>
<input type="submit" value="Submit application !!!"/>


</form>
</body>
</html>