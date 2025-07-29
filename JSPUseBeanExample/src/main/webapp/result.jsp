<!-- result.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>
</head>
<body>
    <%
        // Using request implicit object
        String name = request.getParameter("username");

        if (name == null || name.trim().equals("")) {
            // Redirect using response object if input is invalid
            response.sendRedirect("input.jsp");
        } else {
    %>
            <h2>Hello, <%= name %>!</h2>
            <p>This demonstrates the use of <b>request</b> and <b>response</b> objects.</p>
    <%
        }
    %>
</body>
</html>
