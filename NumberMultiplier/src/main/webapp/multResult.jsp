<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Multiplication Results</title>
</head>
<body>
<p>${userMult.getFinalResult()} Is your final result <br /><p>
<a href="index.jsp">Start over</a> <a href="mult2.jsp">Do another multiplication</a>
</body>
</html>