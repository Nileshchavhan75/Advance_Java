<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FullName</title>
</head>
<body>
<jsp:useBean id="bean" class = "com.controller.MyBean" scope = "page"></jsp:useBean>

<jsp:setProperty name="bean" property = "fname" value = "Nilesh"/>
<jsp:setProperty name="bean" property = "mname" value = "Mangalsing"/>
<jsp:setProperty name="bean" property = "lname" value = "chavhan"/>

<h2>Full Name: </h2>
<p>
<jsp:getProperty name="bean" property = "fname"/>
<jsp:getProperty name="bean" property = "mname"/>
<jsp:getProperty name="bean" property = "lname"/>

</p>



</body>
</html>