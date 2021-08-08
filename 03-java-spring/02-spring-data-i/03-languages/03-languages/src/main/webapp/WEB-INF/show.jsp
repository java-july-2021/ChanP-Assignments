<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><a href="/">Dashboard</a></p><br>

<p><c:out value="${thisLang.name}"/></p>
<p><c:out value="${thisLang.creator}"/></p>
<p><c:out value="${thisLang.currentVersion}"/></p>
<p><a href="/edit/${thisLang.id}">Edit</a></p>
<form method="POST" action="/delete/${thisLang.id}">
<input type="hidden" name="_method" value="delete">
<button>Delete</button>
</form>
</body>
</html>