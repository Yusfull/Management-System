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
<title>New Subject</title>
<style>

</style>
</head>
<body>
	     <h1>Subject Manager</h1>
		<f:view>
			<form:form modelAttribute="subject" method="POST" action="saveSubject">
				<table>
					<tr>
						<td><form:label path="subjectId"> Subject ID: </form:label></td>
						<td><form:input path="subjectId" disabled="true" /></td>
					</tr>
					<tr>
						<td><form:label path="subjectName">Subject Name:</form:label></td>
						<td><form:input path="subjectName" /></td>
					</tr>
				</table>
				<input type="submit" value="Save" />
			</form:form>
		</f:view>
</body>
</html>