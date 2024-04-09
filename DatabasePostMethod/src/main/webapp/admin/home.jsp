<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style>
		body{
			background-color:black;
		}
		.container{
			position:absolute;
			left:50%;
			top:50%;
			transform:translate(-50%,-50%);
			border:2px solid black;
			padding:15px;
			background-color:white;
		}
		input{
			margin-bottom:10px;
		}
		input[type="submit"]{
			margin-left:100px;
		}
		h3{
			margin-left:70px;
		}
		.contains{
			background-color:white;
			width:300px;
			padding:15px;
		}
	</style>
</head>
<body>
	<form class="container" action="addPlacement">
		<h3>Fill the Form</h3>
		<label>Id:</label>
		<input type="number" name="id">
		<br>
		<label>Name:</label>
		<input type="text" name="name">
		<br>
		<label>Degree:</label>
		<input type="text" name="degree">
		<br>
		<label>Department:</label>
		<input type="text" name="department">
		<br>
		<label>Mentor Name:</label>
		<input type="text" name="mentorName">
		<br> 
		<label>Date Of Birth</label>
		<input type="text" name="dob">
		<br>
		<label>Gender</label>
		<input type="text" name="gender">
		<br>
		<label>Phone Number:</label>
		<input type="number" name="phoneNumber">
		<br>
		<input type="submit">
	</form>
	
	<form class="contains" action="getPlacement">
		<h3>Getting the datas</h3>
		<label>Id:</label>
		<input type="number" name="id">
		<br>
		<input type="submit">
	</form>
</body>
</html>