<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<style>
		.container
		{
			position:absolute;
			left:50%;
			top:50%;
			transform:translate(-50%,-50%);
			border:2px solid black;
			padding:20px;
		}
	</style>
<body>
	<form class="container" action="home1">
		Id:
		<input type="number" name="id">
		<br>
		Name:
		<input type="text" name="name">
		<br>
		Age:
		<input type="number" name="age">
		<br>
		<input type="submit">
	</form>
	
	
	<!-- Form for retrieving data -->
	<form action="home2" method="GET">
	    Id:
	    <input type="number" name="id">
	    <br>
	    <input type="submit">
	</form>
		
		
		
</body>
</html>