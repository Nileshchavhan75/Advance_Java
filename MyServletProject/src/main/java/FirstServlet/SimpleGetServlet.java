package FirstServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/SimpleGetServlet")
public class SimpleGetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html"); // Set response type
        PrintWriter out = response.getWriter(); // Get writer object
        out.println("<h1>Welcome to Servlet</h1>"); // Display message
    }
}
