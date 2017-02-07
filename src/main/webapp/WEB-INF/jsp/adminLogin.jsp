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
		<h1>This is the Admin Login page!</h1>
	</body>
</html>