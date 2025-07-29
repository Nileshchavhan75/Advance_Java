package com.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/SecondServlet1") // ✅ Match with dispatcher path
public class SecondServlet1 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = (String) request.getAttribute("username");

        out.println("<h2>Welcome, " + name + "! You have been forwarded successfully.</h2>");
    }
}
