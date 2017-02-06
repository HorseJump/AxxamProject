<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<title>Axxam Tmusni</title>
	<!-- Adds bootstrap library -->
	
	<c:url value="/css/bootstrap.min.css" var="bootstrapUrl" />
	<link rel="stylesheet" type="text/css" href="${bootstrapUrl}">
	
	<!-- Adds css library for common pages -->
	<c:url value="/css/general.css" var="cssURL"/>
	<link rel="stylesheet" type="text/css" href="${cssURL}">
</head>

	<body>
		<div id="heading">
			<h1 class="main-title">Axxam Tmusni</h1>
			<h2 class="main-title"> <small>Where children learn and grow</small></h2>
		</div>
		<div id="navigation-bar">
			<ul class="nav navbar-nav">
				<c:url value="/" var="homeURL"/>
				<li><a href = "${homeURL}">Home</a></li>
				<c:url value="/about" var="aboutURL"/>
				<li><a href="${aboutURL}">About Us</a></li>
				<c:url value="/login" var="loginURL"/>
				<li><a href="${loginURL}">Login</a></li>
				<c:url value="/signUp" var="signUpURL"/>
				<li><a href="${signUpURL}">Sign Up</a></li>
			</ul>
		</div>