<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<title>Axxam Tmusni</title>
	<meta charset="utf-8" /> 
	<!-- Adds bootstrap library -->
	<c:url value="/css/bootstrap.min.css" var="bootstrapUrl" />
	<link rel="stylesheet" type="text/css" href="${bootstrapUrl}">
	
	<!-- Adds css library for common pages -->
	<c:url value="/css/general.css" var="cssURL"/>
	<link rel="stylesheet" type="text/css" href="${cssURL}">
</head>

	<body>
		<div class="jumbotron" id="heading">
			<div class="container">
				<h1 class="main-title">Axxam Tmusni</h1>
				<h2 class="main-title"> Where the world's children learn and grow</h2>
			</div>
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