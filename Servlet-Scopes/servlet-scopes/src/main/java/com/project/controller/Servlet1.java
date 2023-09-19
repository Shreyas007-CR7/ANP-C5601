package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//testSessionScope(request, response);
		//testRequestScope(request, response);
		testApplicationScope(request, response);
		
		
	}
	private void testApplicationScope(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("From servlet1 username = "+user);
		System.out.println("From servlet1 Password = "+pass);
		
		ServletContext application = getServletContext();		
		application.setAttribute("user_name", user);
		application.setAttribute("password", pass);
		
		HttpSession session = request.getSession();
		session.setAttribute("user_name2", user);
		session.setAttribute("password2", pass);
		
		response.sendRedirect("Servlet2");
		
	}
	private void testRequestScope(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("From servlet1 username = "+user);
		System.out.println("From servlet1 Password = "+pass);
		
//		request.setAttribute("user_name", user);
//		request.setAttribute("password", pass);
		
		//response.sendRedirect("Servlet2");
		request.getRequestDispatcher("Servlet2").forward(request, response);
	
		
	}
	private void testSessionScope(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("user_name", user);
		session.setAttribute("password", pass);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='lime'>");
		out.println("<h3><a href='logout.jsp'>Logout</a></h3>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}

}
