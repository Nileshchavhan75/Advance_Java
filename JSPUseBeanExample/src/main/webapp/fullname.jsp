<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JavaBean Full Name Example</title>
</head>
<body>

<%-- Declare the JavaBean --%>
<jsp:useBean id="bean" class="com.controller.FullNameBean" scope="page" />

<%-- Set the properties (you can also get them via form or request) --%>
<jsp:setProperty name="bean" property="fname" value="Bhavi" />
<jsp:setProperty name="bean" property="mname" value="Potil" />
<jsp:setProperty name="bean" property="lname" value="Singh" />

<%-- Display the full name using the bean properties --%>
<h2>Full Name:</h2>
<p>
    <jsp:getProperty name="bean" property="fname" />    
    <jsp:getProperty name="bean" property="mname" />
    <jsp:getProperty name="bean" property="lname" />
</p>

</body>
</html>