<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Forward Example</title>
</head>
<body>
    <h2>This is the first JSP page.</h2>
    
    <%
        String username = "Nilesh"; // Example data
        request.setAttribute("user", username); // Set attribute to pass data
    %>

    <!-- Forwarding request to second.jsp -->
    <jsp:forward page="second.jsp" />
</body>
</html>
