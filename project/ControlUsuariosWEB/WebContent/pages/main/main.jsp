<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h3>Me&uacute;</h3>
<ul>
	<li><a href="nuevoUsuario" >Nuevo usuario</a></li>
</ul>
<h2>Usuarios</h2>
<c:if test="${empty usuarios}">No existen usuarios</c:if>
<c:forEach items="${usuarios}" var="user">
	Email : ${user.email}
	<br>
	Password : ${user.password}
	<br>
	<br>
</c:forEach>
</body>
</html>