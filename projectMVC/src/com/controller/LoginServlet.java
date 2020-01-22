package com.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.model.Login;


public class LoginServlet extends HttpServlet 
{
	String user,pass;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		Login l=new Login();
		l.setUsername(user);
		l.setPassword(pass);
		request.setAttribute("Model",l);
		boolean status=l.validate();
		if(status)
			request.getRequestDispatcher("sucess.jsp").forward(request,response);
		else
			request.getRequestDispatcher("error.jsp").forward(request,response);
	}

}
