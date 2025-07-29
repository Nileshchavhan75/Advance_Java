package com.session;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/GetSessionServlet")
public class GetSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving the existing session
        HttpSession session = request.getSession(false); // false means do not create a new session

        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
            out.println("<h2>Welcome back, " + username + "!</h2>");
        } else {
            out.println("<h2>No session found. Please create a session first.</h2>");
        }
    }
}
