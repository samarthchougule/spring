<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, com.samarth.spring.springmvc.dto.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display List</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for (Employee emp : employees) {
	  out.println(emp.getId());
	  out.println(emp.getName());
	  out.println(emp.getSalary());
	}
	%>
</body>
</html>