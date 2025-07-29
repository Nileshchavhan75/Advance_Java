<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // Get username from request
    String user = request.getParameter("username");

    // Set it into session
    session.setAttribute("username", user);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<h2>Welcome <%= session.getAttribute("username") %>!</h2>
<p>This data is stored in the session and will persist across JSP pages.</p>

</body>
</html>
