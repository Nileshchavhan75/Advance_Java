package com.controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.controller.UserDao;
import com.controller.User;
import java.util.*;

public class SelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        List<User> list = UserDao.getAllUsers();
        request.setAttribute("data", list);
        RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
        rd.forward(request, response);
    }
}
