package FirstServlet;  // Use the correct package name
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

    private static final long serialVersionUID = 1L; // 🔐 Prevents serialization warning

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Welcome to Servlets!</h1>");
    }
}
