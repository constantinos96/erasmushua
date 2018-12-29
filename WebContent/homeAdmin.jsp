<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div  style="text-align:center;">
		<p>Welcome to the ERASMUS System!!</p>
	</div>
	<h1>Choose what you want to do:<br></h1>
	<form action="createUser.jsp" method="get">
		Create new user:
		<input type="submit" name="OK">
	</form>
	<br>
	<form action="searchUserForDelete.jsp" method="get">	
		Delete an existing user:
		<input type="submit" name="OK">
	</form>
	<br>
	<form action="searchUserForModify.jsp" method="get">		
			Modify the details of an existing user:
			<input type="submit" value="OK"><br>
	</form>
</body>
</html>