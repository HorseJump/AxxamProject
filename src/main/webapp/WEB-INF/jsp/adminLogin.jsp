<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>

<html>
<head>
	<title>Admin Login</title>
	<meta charset="utf-8" /> 
	<!-- Adds bootstrap library -->
	<c:url value="/css/bootstrap.min.css" var="bootstrapUrl" />
	<link rel="stylesheet" type="text/css" href="${bootstrapUrl}">
	
	<!-- Adds css library for common pages -->
	<c:url value="/css/adminLoginStyles.css" var="cssURL"/>
	<link rel="stylesheet" type="text/css" href="${cssURL}">
</head>
	<body>
		<div>
			<c:url value="/" var="homeURL"/>
			<a href="${homeURL}">Return to Homepage</a>
		</div>
		<c:url value="/AdminLogin" var="formAction"/>
		<form id ="adminForm" method="POST" action="${formAction}">
			<div id="loginForms">
				<h2>Admin Login</h2>
				<label for="adminUsername">Username:</label>
				<input type="text" id="adminUsername" name="adminUsername" placeholder="Username"/>
				<br>
				<label for="adminPassword">Password:</label>
				<input type="text" id="adminPassword" name="adminPassword" placeholder="Password"/>
				<button type="submit" id="adminLoginButton" class="btn btn-primary">Login</button>
			</div>
		</form>
	</body>
</html>