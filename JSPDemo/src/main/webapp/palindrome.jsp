<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Palindrome Check</title>
</head>
<body>
<form method="post">
        Enter a number: <input type="text" name="num">
        <input type="submit" value="Check Palindrome">
    </form>

    <%
        String numStr = request.getParameter("num");
        if(numStr != null) {
            int num = Integer.parseInt(numStr);
            int rev = 0, temp = num;
            while(temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if(num == rev) {
                out.println("<h3>" + num + " is a Palindrome Number!</h3>");
            } else {
                out.println("<h3>" + num + " is NOT a Palindrome Number!</h3>");
            }
        }
    %>
</body>
</html>