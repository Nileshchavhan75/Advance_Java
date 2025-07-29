package com.servletex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			 int num1 = Integer.parseInt(request.getParameter("num1"));
	         int num2 = Integer.parseInt(request.getParameter("num2"));
	         String operation = request.getParameter("operations");
	         
	         int result = 0;
	         
	         switch(operation) {
	         case "add":
	        	 result = num1 + num2;
	        	 break;
	         case "subtract":
	        	 result = num1 - num2;
	        	 break;
	         case "multiply":
	        	 result = num1 * num2;
	        	 break;
	         case "divide":
	        	 if (num2 != 0) {
                     result = num1 / num2;
                 } else {
                     out.println("<h2>Error: Cannot divide by zero</h2>");
                     return;
                 }
                 break;
	         default:
                 out.println("<h2>Error: Invalid operation</h2>");
                 return;
         }
	         out.println("<h2>Result: " + result + "</h2>");
                 
	         }catch (NumberFormatException e) {
	             out.println("<h2>Error: Please enter valid numbers!</h2>");
	         
		}
	}

}
