$(document).ready(function() {
		$("#topicChoice").change(function() {
			var topicId = $("select#topicChoice option:checked").val();
			if(topicId !== "None") {
				$.post("/AxxamTmusni/getSubtopics", {"topicId": topicId}, function(data) {
					$("#subtopicChoice").empty();
					$("#subtopicChoice").append('<option selected>Select a Subtopic</option>');
					for(var i = 0; i < data.length; i++) {
						$("#subtopicChoice").append('<option value=' + data[i].subtopicId + '>'
								+ data[i].subtopicName + '</option>');
					}
				});
			} else {
				$("#subtopicChoice").empty();
			}
		});
	});