<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration form </title>
</head>
<body>
		<form:form action = "processForm" modelAttribute = "student">
				first name : <form:input path = "firstName" />
				<br>
				last name : <form:input path = "lastName" />
				<br>
				<form:select path = "country">
					<form:option value = "Brazil" label = "Brazil"></form:option>
					<form:option value = "France" label = "France"></form:option>
					<form:option value = "Germany" label = "Germany"></form:option>
					<form:option value = "India" label = "India"></form:option>
				</form:select>
				<br>
				<input type = "submit" value = "submit" />
		</form:form>
</body>
</html>