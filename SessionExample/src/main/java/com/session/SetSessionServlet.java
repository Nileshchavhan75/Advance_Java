package com.session;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/SetSessionServlet")

public class SetSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Creating a new session
        HttpSession session = request.getSession();

        // Storing data in session
        session.setAttribute("username", "Nillu BOss");

        out.println("<h2>Session Created Successfully!</h2>");
        out.println("<a href='GetSessionServlet'>Click here to retrieve session data</a>");
    }
}
