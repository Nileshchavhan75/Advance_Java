<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <center>
 <h2>Student Record Managment</h2>
 <form action="Driver" method="get">
    <label for="name">Student Name:</label><br>
    <input type="text" id="name" name="name"><br><br>

    <label for="roll">Roll Number:</label><br>
    <input type="text" id="roll" name="roll"><br><br>

    <label for="course">Course:</label><br>
    <input type="text" id="course" name="course"><br><br>
     
    <button type="submit" name="action" value="insert">insert</button>
    <button type="submit" name="action" value="update">update</button>
    <button type="submit" name="action" value="delete">delete</button>
    <button type="submit" name="action" value="show">show</button>
  </form>
 </center>
</body>
</html>