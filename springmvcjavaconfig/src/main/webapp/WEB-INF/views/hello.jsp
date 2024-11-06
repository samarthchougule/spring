<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");

	out.println("ID: " + id);
	out.println("Name: " + name);
	out.println("Salary: " + salary);
	%>
	
	<br/>
	Id:
	${id}
	Name:
	${name}
	Salary:
	${salary}
	
</body>
</html>
