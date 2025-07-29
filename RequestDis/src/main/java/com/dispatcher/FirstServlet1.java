package com.dispatcher;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {

    private static final long serialVersionUID = 1L; // ✅ Add this to remove warning

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("username");

        request.setAttribute("username", name);

        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet1");
        rd.forward(request, response);
    }
}
