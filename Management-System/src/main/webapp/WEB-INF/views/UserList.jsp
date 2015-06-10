<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<style>

</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style.css"/>

</head>
           <center><h2>List of Registered Students</h2></center>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://localhost:8080/spring/UserList">Home</a>
		</div>
		
		<div>
			<ul class="nav navbar-nav">

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-expanded="false"> Manage <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li class="active"><a href="new"> Students</a></li>
						<li><a href="newTeacher">Teachers</a></li>
						<li><a href="newGroup">Groups</a></li>
						<li><a href="newSubject">Subjects</a></li>
						<li><a href="#">Marks</a></li>
						<li><a href="#">Tests</a></li>
						<li><a href="#">Users</a></li>
						
												
					</ul>
				</li>
			</ul>
		</div>
		<div>
			<ul class="nav navbar-nav">

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-expanded="false"> View Repots <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li class="active"><a href="#"> Students</a></li>
						<li><a href="printAuditReport">Audit Report</a></li>
						<li><a href="printTopAchiever">Student marks Report</a></li>
						<li><a href="printAverage">Avarage Student Report</a></li>
						<li><a href="#">Students with distinction Report</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<div class="navbar-header">
			<a class="navbar-brand" href="#">About</a>
		</div>
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Contact Us</a>
		</div>
	</div>
	</nav>
<form>
   
	<center><div
		style="overflow: scroll;  overflow: auto;">
		<h2>
			List of Registered Students
		</h2>
		<table width=50% height=40px border="15"  align="center" class="my-table" >
		    
			<th>No</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Actions</th>

			<c:forEach var="students" items="${studList}" varStatus="status">
				<tr height=30>
					<td>${status.index + 1}</td>
					<td>${students.firstname}</td>
					<td>${students.lastname}</td>
					<td><a href="edit?id=${students.studentId}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${students.studentId}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div></center>
	</form>
</body>
</html>
