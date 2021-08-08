<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/delete/${language.id}">
<input type="hidden" name="_method" value="delete">
<button>Delete</button>
</form>
<p><a href="/delete/${language.id}">Delete</a></p>
<p><a href="/">Dashboard</a></p>

<form:form action="/edit/${language.id}" method="POST" modelAttribute="language">
<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<p>
<form:label path="creator">Creator</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>
</p>
<p>
<form:label path="currentVersion">Version</form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>

<input type="hidden" name="_method" value="put">
<button>Submit</button>
</form:form>
</body>
</html>