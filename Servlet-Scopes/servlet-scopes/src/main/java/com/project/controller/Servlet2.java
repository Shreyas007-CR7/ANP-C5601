package com.project.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("From servlet2 username = "+user);
		System.out.println("From servlet2 Password = "+pass);
		
		ServletContext application = getServletContext();		
		System.out.println("Username = "+application.getAttribute("user_name"));
		System.out.println("Password = "+application.getAttribute("password"));
		
		HttpSession session = request.getSession();
		System.out.println("Username = "+session.getAttribute("user_name2"));
		System.out.println("Password = "+session.getAttribute("password2"));
		
		
		
//		request.getRequestDispatcher("/Servlet3").forward(request, response);
		
	}

}
