<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial Program</title>
</head>
<body>
<form method="post">
        Enter a number: <input type="text" name="num">
        <input type="submit" value="Calculate Factorial">
    </form>

    <%
        String numStr = request.getParameter("num");
        if(numStr != null) {
            int num = Integer.parseInt(numStr);
            int fact = 1;
            for(int i = 1; i <= num; i++) {
                fact *= i;
            }
            out.println("<h3>Factorial of " + num + " is: " + fact + "</h3>");
        }
    %>

</body>
</html>