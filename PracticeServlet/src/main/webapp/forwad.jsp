<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = request.getParameter("username");
request.setAttribute("username", name);
%>
<jsp:forward page="welcome.jsp"></jsp:forward>
