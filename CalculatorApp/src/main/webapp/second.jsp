<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Forwarded Page</title>
</head>
<body>
    <h2>This is the second JSP page.</h2>

    <%
        // Retrieving the attribute set in first.jsp
        String user = (String) request.getAttribute("user");
    %>

    <h3>Welcome, <%= user %>!</h3>
</body>
</html>
