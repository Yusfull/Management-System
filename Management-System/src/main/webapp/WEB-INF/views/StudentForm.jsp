<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>New Student</title>
 <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
	     <h1>Register Students</h1>
		<f:view>
		<table>
			<form:form modelAttribute="students" method="POST" action="save">
				<form:hidden path="studentId"/>
					<tr>
						<td><form:label path="studentId"> ID: </form:label></td>
						<td><form:input path="studentId" disabled="true" /></td>
					</tr>
					<tr>
						<td><form:label path="firstname">First Name:</form:label></td>
						<td><form:input path="firstname" /></td>
					</tr>
					<tr>
						<td><form:label path="lastname">Last Name</form:label></td>
						<td><form:input path="lastname" /></td>
					</tr>
				
				<input type="submit" value="Save" />
			
		</form:form>
		</table>
</f:view>
</body>
</html>