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
	<c:url value="/css/adminDashboard.css" var="cssURL"/>
	<link rel="stylesheet" type="text/css" href="${cssURL}">
	
	<!-- Adds AJAX -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
	<script src="http://malsup.github.com/jquery.form.js"></script> 
	
	<!-- Adds JS file -->
	<script src="js/createTutorial.js"></script>
</head>
	<body>
		
	</body>
</html>