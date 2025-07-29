package com.salary;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/DAHRA_CalculatorServlet")
public class DAHRA_CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        double basicSalary = Double.parseDouble(request.getParameter("basicSalary"));

        // DA (Dearness Allowance) = 30% of basic salary
        double da = 0.30 * basicSalary;

        // HRA (House Rent Allowance) = 20% of basic salary
        double hra = 0.20 * basicSalary;

        // Storing values in request attributes
        request.setAttribute("basicSalary", basicSalary);
        request.setAttribute("da", da);
        request.setAttribute("hra", hra);

        // Forward request to GrossSalaryServlet
        RequestDispatcher rd = request.getRequestDispatcher("GrossSalaryServlet");
        rd.forward(request, response);
    }
}
