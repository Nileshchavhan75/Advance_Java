package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GetSessionServlet")
public class GetSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	  HttpSession session = request.getSession(false);
	  
	  if(session != null && session.getAttribute("username") != null) {
		  String username = (String)session.getAttribute("username");
		  out.println("<h2>Welcome back ,"+username+"</h2>");
	  }else {
		  out.println("<h2>No session found please create session first</h2>");
	  }
	}	
}
