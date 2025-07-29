<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.mvc.db.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
  <table border="1">
    <tr>
     <th>Id</th>
     <th>Name</th>
     <th>RollNo</th>
     <th>Course</th>
    </tr>
  
     <%
        Connection con=DatabaseConnection.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
        while(rs.next()){
        	
      %>
     <tr>
      <td><%= rs.getInt("id") %></td>
      <td><%= rs.getString("name") %></td>
      <td><%= rs.getInt("roll") %></td>
      <td><%= rs.getString("course") %></td>
    </tr>
    <%
        }
    %>
  </table>

</center>
</body>
</html>