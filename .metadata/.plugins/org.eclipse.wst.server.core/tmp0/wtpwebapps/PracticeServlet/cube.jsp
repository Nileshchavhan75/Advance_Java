<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cube</title>
</head>
<body>
<form method = "post">
<label>Enter Number:</label>
<input type = "number" name = "num">
<input type = "submit" name = "Calculate cube">
</form>

<%
String numStr = request.getParameter("num");
if(numStr != null){
	int num = Integer.parseInt(numStr);
	int cube = num * num * num;
%>
<h3>Cube of: <%= num %> is  <%=cube %></h3>
<%
}
%>
</body>
</html>