<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cube Calculator</title>
</head>
<body>

<h2>Cube Calculator</h2>

<form method="post">
    <label>Enter a number:</label>
    <input type="number" name="num" required>
    <input type="submit" value="Calculate Cube">
</form>

<%
    String numStr = request.getParameter("num");

    if (numStr != null) {
        int num = Integer.parseInt(numStr);
        int cube = num * num * num;
%>
        <h3>Cube of <%= num %> is <%= cube %></h3>
<%
    }
%>

</body>
</html>
