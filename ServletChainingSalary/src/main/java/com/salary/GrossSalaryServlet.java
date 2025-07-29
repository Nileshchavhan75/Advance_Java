package com.salary;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/GrossSalaryServlet")
public class GrossSalaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Retrieving values from request attributes
        double basicSalary = (double) request.getAttribute("basicSalary");
        double da = (double) request.getAttribute("da");
        double hra = (double) request.getAttribute("hra");

        // Calculating Gross Salary
        double grossSalary = basicSalary + da + hra;

        // Display result
        out.println("<html><body>");
        out.println("<h2>Salary Breakdown</h2>");
        out.println("Basic Salary: " + basicSalary + "<br>");
        out.println("Dearness Allowance (DA): " + da + "<br>");
        out.println("House Rent Allowance (HRA): " + hra + "<br>");
        out.println("<h3>Gross Salary: " + grossSalary + "</h3>");
        out.println("</body></html>");
    }
}
