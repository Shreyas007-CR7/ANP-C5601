package com.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserDTO;
import com.project.service.LoginService;
import com.project.service.UserService;
import com.project.service.impl.LoginServiceImpl;
import com.project.service.impl.UserServiceImpl;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService = new LoginServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		boolean isAuthenticated = loginService.authenticate(username, password);
		if(isAuthenticated==true) {
			resp.sendRedirect("welcome.jsp");
		}else {
			resp.sendRedirect("error.jsp");
		}
		
	}
	
}