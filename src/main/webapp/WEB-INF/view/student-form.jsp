<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Student Form</h1>

	<form:form action="students/procress-form" modelAttribute="student"
		method="post">
		<table border="1">
			<tr>
				<td>Name: </td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Age: </td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Gender: </td>
				<td><form:radiobutton path="gender" value="Male" />Male &nbsp; <form:radiobutton path="gender" value="Female" />Female</td>
			</tr>
			<tr>
				<td>Country: </td>
				<td><form:select path="country">
				<form:option value="">--Select--</form:option>
				<form:option value="IND">India</form:option>
				<form:option value="USA">America</form:option>
				<form:option value="UK">Britain</form:option>
				</form:select></td>
			</tr>
			<tr>
				<td>Courses: </td>
				<td><form:checkbox path="courses" value="M1" />Core Java &nbsp; 
				<form:checkbox path="courses" value="M2" />Advance Java &nbsp;
				<form:checkbox path="courses" value="M3" />Java frameworks</td>
			</tr>
			<tr>
				<td>Graduate?: </td>
				<td><form:checkbox path="graduate" /></td>
			</tr>
			<tr>
				<td>Comment: </td>
				<td><form:textarea path="comment" cols="100" rows="5" /></td>
			</tr>
		</table>
		<input type="submit" value="Register">
	</form:form>






</body>
</html>