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
			margin-left:80px;
		}
	</style>
</head>
<body>
	<form class="container" action="addVote">
		<label>Id:</label>
		<input type="number" name="id">
		<br>
		<label>Name:</label>
		<input type="text" name="name">
		<br>
		<label>Age:</label>
		<input type="number" name="age">
		<br>
		<label>Voting Eligible:</label>
		<input type="text" name="eligible">
		<br>
		<input type="submit">
	</form>
</body>
</html>