<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
<form method="POST" action="/result">
<label for="name">Your Name:</label>
<input type="text" name="name"><br>
<label for="location">Dojo Location:</label>
	<select name="location">
		<option value="San Jose">San Jose</option>
		<option value="San Francisco">San Francisco</option>
		<option value="Los Angeles">Los Angeles</option>
	</select><br>
<label for="language">Favorite Language:</label>
	<select name="language">
		<option value="Python">Python</option>
		<option value="Java">Java</option>
		<option value="Mern">Mern</option>
	</select><br>
<label for="comment">Comment (optional):</label><br>
<textarea name="comment"></textarea><br>
<button>Button</button>
</form>
</body>
</html>