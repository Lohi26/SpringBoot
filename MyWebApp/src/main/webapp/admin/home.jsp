<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registration Form</title>
	<style>
			body{
				background:linear-gradient(270deg,rgba(204,204,255),rgba(229,204,255),rgba(255,204,255))
			}
			h1{
				position:absolute;
				left:51%;
				transform:translate(-50%);
				text-align:center;
				background-image: url("Example.jpg");
		        background-size: cover;
		        background-clip: text;
		        -webkit-background-clip: text;
		        color: transparent;
		        font-weight:50px;
		        text-transform:uppercase;
			}
			h2{
				position:absolute;
				top:3.5rem;
				left:50%;
				transform:translate(-50%);
				text-align:center;
			}
			.container{
				position:absolute;
				top:12%;
				left:33%;
				width:500px;
			}
			label, input, select{
				display:block;
			}
			label{
				margin-bottom:10px;
				position:relative;
				text-align:center;
				font-weight:bolder;
				font-style:italic;
			}
			input, select{
				position:relative;
				left:35%;
			}
			.techskills{
				position:relative;
				left:41.5%;
			}
			.softtech{
				position:relative;
				left:37%;
			}
			.gender{
				position:relative;
				left:47.5%;
			}
			fieldset{
				border:5px solid black;
			}
			.submit{
				position:relative;
				left:220px;
				top:10px;
				bottom:20px;
				margin-bottom:10px;
			}
	</style>
</head>
<body>
	<h1>First Spring Boot Web Application</h1>
	<h2>Registration Form</h2>
	<fieldset class="container">
		<legend><h3>Fill the form</h3></legend>
		<form class="fill">
			<label>FirstName</label>
			<input type="text" class="firstname" placeholder="Enter first your name">
			<br>
			<label>SecondName</label>
			<input type="text" class="second" placeholder="Enter your second name">
			<br>
			<label>Email</label>
			<input type="email" class="email" placeholder="Enter your email id">
			<br>
			<label>City</label>
			<input type="text" class="city" placeholder="Enter your city name">
			<br>
			<label>Gender</label>
			<label>Male</label>
			<input type="radio" value="male" class="gender">
			<label>Female</label>
			<input type="radio" value="female" class="gender">
			<br>
			<label>Technical Skills</label>
			<select class="techskills">
				<option>-select-</option>
				<option value="C">C</option>
				<option value="java">Java</option>
				<option value="python">Python</option>
				<option value="html">HTML</option>
				<option value="css">CSS</option>
				<option value="javascript">JavaScript</option>
				<option value="react">React JS</option>
				<option value="node">Node JS</option>
			</select>
			<br>
			<label>Soft Skills</label>
			<select class="softtech">
				<option>-select-</option>
				<option value="communi">Communication</option>
				<option value="leader">Leadership</option>
				<option value="solve">Problem Solving</option>
				<option value="time">Time Management</option>
			</select>
			<button class="submit">SUBMIT</button>
		</form>
	</fieldset>
</body>
</html>