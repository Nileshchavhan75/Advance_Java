<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.controller.User" %>
<!DOCTYPE html>
<html>
<body>
<h2>User List</h2>
<table border="1">
<tr><th>Username</th><th>Password</th></tr>
<%
List<User> list = (List<User>)request.getAttribute("data");
for(User u : list){
%>
<tr>
<td><%= u.getUsername() %></td>
<td><%= u.getPassword() %></td>
</tr>
<% } %>
</table>
</body>
</html>
