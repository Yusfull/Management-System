<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:f="http://java.sun.com/jsf/core"
	  xmlns:h="http://java.sun.com/jsf/html">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teacher Form</title>
<style>

</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Home</a>
		</div>

		<div>
			<ul class="nav navbar-nav">

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-expanded="false"> Manage <span class="caret"></span>
				</a></li>
			</ul>
		</div>
	</div>
	</nav>
	
	<f:view >
		<form:form modelAttribute="teacher" method="POST" action="saveTeacher" autocomplete="true">
		<center><h1>Register Teachers</h1></center>
			<table align="center" border="5" cellpadding="2" cellspacing="4" height="70px" width="80px">
				<tr>
					<td><form:label path="teacherId"> ID: </form:label></td>
					<td><form:input path="teacherId" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="firstname">Teacher Name:</form:label></td>
					<td><form:input path="firstname" /></td>
				</tr>
				<tr>
					<td><form:label path="lastname">Last Name</form:label></td>
					<td><form:input path="lastname" /></td>
				</tr>
			</table>
			<center><input type="submit" value="Save" /></center>
		</form:form>
	</f:view>

</body>
</html>