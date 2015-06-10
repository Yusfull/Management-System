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
<title>New Group</title>
<style>
body {
	background-image: url("C:\\Users\\Eusuph\\Documents\\yusuf work\\images\\edu3.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-color: #cccccc;
}
</style>
</head>
<body>
	     <h1>Group Manager</h1>
		<f:view>
			<form:form modelAttribute="group" method="POST" action="saveGroup">
				<table>
					<tr>
						<td><form:label path="groupId"> Group ID: </form:label></td>
						<td><form:input path="groupId" disabled="true" /></td>
					</tr>
					<tr>
						<td><form:label path="groupName">Group Name:</form:label></td>
						<td><form:input path="groupName" /></td>
					</tr>
				</table>
				<input type="submit" value="Save" />
			</form:form>
		</f:view>
</body>
</html>