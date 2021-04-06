$(document).ready(function(){
	$("#botonConversor").click(function(){
		var input = $("#valorInput").val();
		var urlGateway = "https://gbg4cgsje4.execute-api.us-east-1.amazonaws.com/v1?value="+input;
		$.ajax({
			type: "GET",
			url: urlGateway,
			success: function(data){
				$("#res").text("Su valor en grados Celsius es: " + data.output);
			}
		});
	})
})