<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div  style="text-align:center;">
		<p>Welcome to the ERASMUS System!!</p>
	</div>
	<h1>Choose what you want to do:<br></h1>
	<form action="createApp.jsp" method="get">
		Create new application:
		<input type="submit" name="OK">
	</form>
	<br>
	<form action="seeRank.jsp" method="get">	
		See your ranking:
		<input type="submit" name="OK">
	</form>
	<br>
</body>
</html>