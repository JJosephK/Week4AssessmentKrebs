<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the number multiplier!</title>
</head>
<body>
<h1>This is the number multiplier!</h1>
<form action="firstNumServlet" method="post">
Enter the first number you wish to multiply.<br />
<input type="text" name="numOne" size="10">
Enter the second number you wish to multiply.<br />
<input type="text" name="numTwo" size="10">
<input type="submit" value="Submit Numbers" />
</form>
</body>
</html>