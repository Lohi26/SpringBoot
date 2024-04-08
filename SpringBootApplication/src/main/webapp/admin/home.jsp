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
	<form class="container" action="addNothing">
		<label>Id: </label>
		<input type=number name="id">
		<br>
		<label>Name: </label>
		<input type="text" name="name">
		<br>
		<label>City: </label>
		<input type="text" name="city">
		<br>
		<input type="submit"> 
	</form>
</body>
</html>