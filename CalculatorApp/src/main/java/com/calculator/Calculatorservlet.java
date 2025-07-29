package com.calculator;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/Calculatorservlet")
public class Calculatorservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Read input values from the form
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            int result = 0;

            // Perform calculation based on the selected operation
            switch (operation) {
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

            // Display the result
            out.println("<h2>Result: " + result + "</h2>");

        } catch (NumberFormatException e) {
            out.println("<h2>Error: Please enter valid numbers!</h2>");
        }
    }
}
