<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<c:forEach items="${employeeList}" var="employee"> 
${employee.id}:${employee.lastName},${employee.firstName}<br>
</c:forEach>
</center>
</body>
</html> 