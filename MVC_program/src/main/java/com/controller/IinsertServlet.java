package com.controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class IinsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    InsertBean bean = new InsertBean();
    bean.setUsername(username);
    bean.setPassword(password);

    Database.insert(bean);

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h2>Data inserted successfully!</h2>");
  }
}
