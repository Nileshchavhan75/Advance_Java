<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- Get the username from form --%>
<%
    String name = request.getParameter("username");
    request.setAttribute("user", name); // store in request scope
%>

<jsp:forward page="welcome.jsp" />
