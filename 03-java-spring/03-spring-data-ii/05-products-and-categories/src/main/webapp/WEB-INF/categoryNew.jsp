<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
</head>
<body>
<h1>New Category</h1>
<form method="POST" action="/newCat">
<p>
<label for="name">Name</label>
<input type="text" name="cat">
</p>
<button>Create</button>
</form>
</body>
</html>