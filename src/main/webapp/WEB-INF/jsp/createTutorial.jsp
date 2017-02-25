<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<title>Axxam Tmusni: Create a Tutorial</title>
	<meta charset="utf-8" /> 
	<!-- Adds bootstrap library -->
	<c:url value="/css/bootstrap.min.css" var="bootstrapUrl" />
	<link rel="stylesheet" type="text/css" href="${bootstrapUrl}">
	
	<!-- Adds css library for common pages -->
	<c:url value="/css/createTutorial.css" var="cssURL"/>
	<link rel="stylesheet" type="text/css" href="${cssURL}">
	
	<!-- Adds AJAX -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
	<script src="http://malsup.github.com/jquery.form.js"></script> 
	
	<!-- Adds JS file -->
	<script src="js/createTutorial.js"></script>
</head>
	<body>
	<div class="center-tutorial">
		<h2>Choose a Topic</h2>
		<c:url value="/getSubtopics" var="getSubs"/>
		
			<select name="topicId" id="topicChoice">
				<option value="None" selected>Select a Topic</option>
				<c:forEach var="topic" items="${topics}">
					<option value="${topic.topicId}"><c:out value="${topic.topicName}"></c:out></option>
				</c:forEach>
			</select>
		<h2>Choose a Subtopic</h2>
		<select name="subtopicId" id="subtopicChoice">
		</select><br>
	</div>
	</body>
</html>