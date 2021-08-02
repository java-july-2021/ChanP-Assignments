<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language</title>
</head>
<body>
<table>
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
<tbody>
<c:forEach items="${allLanguages}" var="lang">
<tr>
<td>${lang.name}</td>
<td>${lang.creator}</td>
<td>${lang.currentVersion}</td>
<td><a href="/edit/${lang.id}">Edit</a> |<a href="/delete/${lang.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<form:form action="/" method="POST" modelAttribute="Language">
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
<form:label path="currentversion">Version</form:label>
<form:errors path="currentversion"/>
<form:input path="currentversion"/>
</p>
<button>Submit</button>
</form:form>
</body>
</html>