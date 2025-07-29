<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    String name = (String) request.getAttribute("user");
%>

<h2>Welcome, <%= name %>! This page was forwarded using jsp:forward tag.</h2>

</body>
</html>
