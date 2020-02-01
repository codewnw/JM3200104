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
	<h1>Student Profile</h1>
	<table border="1">
		<tr>
			<td>Name:</td>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td>Age:</td>
			<td>${student.age}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${student.gender}</td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>${student.country}</td>
		</tr>
		<tr>
			<td>Courses:</td>
			<td>${student.courses[0]} &nbsp; ${student.courses[1]} &nbsp; ${student.courses[2]}</td>
		</tr>
		<tr>
			<td>Graduate:</td>
			<td>${student.graduate}</td>
		</tr>
		<tr>
			<td>Comment:</td>
			<td>${student.comment}</td>
		</tr>
	</table>






</body>
</html>