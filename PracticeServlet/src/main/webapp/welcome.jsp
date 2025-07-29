<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
<%
String name = (String)request.getAttribute("username");

%>
<h2>welcome <%=name %></h2>
<p>This massage is forwarded </p>
</body>
</html>