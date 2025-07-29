package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.mvc.dao.Operations;
import com.mvc.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Driver extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		
		String name=req.getParameter("name");
		String myRoll=req.getParameter("roll");
		int roll=0;
		if(myRoll!=null && !myRoll.trim().isEmpty()) {
			try {
				roll=Integer.parseInt(myRoll);
			}catch(NumberFormatException e) {
				pw.println("<h1>Invalid Number Format ..!</h1>");
			}
			
		}
		String course=req.getParameter("course");
		String action=req.getParameter("action");
		
		Student s=new Student();
		s.setName(name);
		s.setRollNo(roll);
		s.setCourse(course);
		
		Operations op=new Operations();
		if(action.equals("insert")) {
			int status=op.insertRecord(s);
			if(status>0) {
				pw.println("<h1>Data inserted Successfully ..!</h1>");
				rd.include(req, res);
			}else
			{
				pw.println("<h1>Data Failed to insert ..!</h1>");
				rd.include(req, res);
			}
		}
		else if(action.equals("update")) {
			int status=op.updateRecord(s);
			if(status>0) {
				pw.println("<h1>Data updated Successfully ..!</h1>");
				rd.include(req, res);
			}else
			{
				pw.println("<h1>Data Failed to update ..!</h1>");
				rd.include(req, res);
			}
		}
		else if(action.equals("delete")) {
			int status=op.deleteRecord(s);
			if(status>0) {
				pw.println("<h1>Data deleted Successfully ..!</h1>");
				rd.include(req, res);
			}else
			{
				pw.println("<h1>Data Failed to delete..!</h1>");
				rd.include(req, res);
			}
		}
		else if(action.equals("show")) {
			res.sendRedirect("view.jsp");
		}
		
		
		
	}

}
