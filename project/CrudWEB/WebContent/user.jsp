<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

My name is
<c:out value="${user.name}"></c:out>
and I have
<c:out value="${user.edad}"></c:out>
years old.

<br />

All users are:

<c:forEach items="${users}" var="u">	
	<c:if test="${u.edad ne null and u.edad ne 100 }">
		<br />
		name: ${u.name}
		<br />	
		age: ${u.edad}		
	</c:if>	
</c:forEach>
