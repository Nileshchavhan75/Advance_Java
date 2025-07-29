package com.ServletChaing;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // HTML form for input
        out.println("<html><body>");
        out.println("<h2>Enter Basic Salary</h2>");
        out.println("<form action='DAHRA_CalculatorServlet' method='post'>");
        out.println("Basic Salary: <input type='text' name='basicSalary'><br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
