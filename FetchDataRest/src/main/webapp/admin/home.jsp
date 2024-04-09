<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.container{
		position:absolute;
		left:50%;
		top:50%;
		transform:translate(-50%,-50%);
		padding:15px;
		border:2px solid black;
	}
</style>
</head>
<body>
	<form class="container" action="addFormDetails">
		<label>Id:</label>
		<input type="number" name="id">
		<br>
		<label>Name:</label>
		<input type="text" name="name">
		<br>
		<label>Year:</label>
		<input type="number" name="studentYear">
		<br>
		<label>CGPA:</label>
		<input type="number" name="cgpa">
		<br>
		<label>Major Language:</label>
		<input type="text" name="language">
		<br>
		<input type="submit">
	</form>
	
	<form action="/getFormDetails">
		<label>Id:</label>
		<input type="number" name="id">
		<br>
		<input type="submit">
	</form>
</body>
</html>