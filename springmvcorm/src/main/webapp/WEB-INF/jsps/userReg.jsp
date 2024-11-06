<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>
	$(document).ready(function() {
		
		$("#id").change(
			funtion(){
				$.ajax({
						url:'validateEmail',
						data:{id:$("#id").val()},
						success:function(responseText){
							$("#errMsg").text(responseText);
							
							if(responseText != ""){
								$("#id").focus();
							}
						}
					})		
			})
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		Id:<input type="text" name="id" id="id" /><span id="errMsg"> </span> Name:<input
				type="text" name="name" />
		Email:<input type="text" name="email" /> <input type="submit"
				name="register" />
			</pre>
	</form>

	<br /> ${result}
</body>
</html>