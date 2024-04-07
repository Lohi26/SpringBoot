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
			border:2px solid black;
			padding:20px;
		}
		
	</style>
</head>
<body>
	<form action="addDetails" class=container>
		<label>Id:</label>
		<input tyep="number" name=id>
		<br>
		<label>Name:</label>
		<input type="text" name="name">
		<br>
		<label>Age:</label>
		<input type="number" name="age">
		<br>
		<input type="submit">
	</form>
	
	<form action="getDetails">
		<label>Id:</label>
		<input tyep="number" name=id>
		<br>
		<input type="submit">
	</form>
</body>
</html>