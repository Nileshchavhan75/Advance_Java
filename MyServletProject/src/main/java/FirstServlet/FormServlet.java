package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles GET request
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Display form
        out.println("<h2>Simple Form (GET & POST Example)</h2>");
        out.println("<form action='FormServlet' method='post'>");
        out.println("Enter Name: <input type='text' name='username'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
    }

    // Handles POST request
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get user input
        String name = request.getParameter("username");
        out.println("<h3>Hello, " + name + "! (Received using POST)</h3>");
    }
}
