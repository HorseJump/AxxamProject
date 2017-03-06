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
		
//		$("#addContent").click(function() {
//			$(".content").append('<textarea name="tutorialContent" class="contentBox"></textarea>');
//			$(".content").append('<button type="button" class="btn btn-danger" id="deleteContent">Delete -</button>');
//		});
		
//		$("#addVideo").click(function() {
//			$(".content").append('<input type="text" name="tutorialContent" class="videoBox">');
//			$(".content").append('<button type="button" class="btn btn-danger" id="deleteContent">Delete -</button>');
//		});
		
//		$(".content").on('click', '#deleteContent', function() {
//			$(this).prev().remove();
//			$(this).remove();
//		});
	});