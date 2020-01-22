<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet">
<table>
<tr><td>Username</td><td><input type="text" name="user"></td></tr>
<tr><td>Password:</td><td><input type="password" name="pass"/></td></tr> 
<tr><td><input type="submit" value="Submit"/></td></tr>
<td><input type="submit" value="Reset"/></td></tr>
</table>
</form>
</body>
</html>