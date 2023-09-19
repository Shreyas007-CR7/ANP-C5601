package com.project.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.demo.beans.Customer;
import com.project.demo.dao.CustomerDao;
import com.project.demo.dao.CustomerDaoJdbc;

@WebServlet("/cc")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doPost(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        String action = request.getParameter("action");
	        if(action.equals("save_customer"))
	        {
	            String n = request.getParameter("cname");
	            String e = request.getParameter("email");
	            String p1 = request.getParameter("password");
	            String p2 = request.getParameter("cnf_password");
//	            String dob =request.getParameter("dob");
//	            
//	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
//	            LocalDate date = LocalDate.parse(dob, formatter);
//	           
//	            System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"+date);
//	            try {
//	                Date sdf = new SimpleDateFormat("DD-MM-YYYY").parse(dob);
//	                System.out.println("=========================================="+sdf);
//	            } catch (ParseException ex) {
//	                ex.printStackTrace();
//	            }
//	            try {
//	                Date d = sdf.parse(dob);
//	                sdf.format(d);
//	                
//	                System.out.println("Date= "+sdf.format(dob));
//	            } catch (ParseException ex) {
//	                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
//	            }
	            long c = Long.parseLong(request.getParameter("contact"));
	            Customer cust = new Customer(n, e, p1, p2, c);
	            CustomerDao cd = new CustomerDaoJdbc();
	            cd.saveCustomer(cust);
	            response.sendRedirect("index.jsp");
	        }
	        else if(action.equals("show_customers"))
	        {
	            System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
	            CustomerDao cd = new CustomerDaoJdbc();
	            List<Customer> list = cd.showCustomers();
	            HttpSession ses = request.getSession();
	            ses.setAttribute("customerList", list);
	            //response.sendRedirect("show_customers.jsp");
	           // request.getRequestDispatcher("show_customers.jsp").forward(request, response);
	        }
	        else if(action.equals("update_customer"))
	        {
	            int id = Integer.parseInt(request.getParameter("id"));
	            System.out.println("iddddddddddddddddddddddddddddddddddddddddddd"+id);
	            String n = request.getParameter("cname");
	            String e = request.getParameter("email");
	            String p1 = request.getParameter("password");
	            String p2 = request.getParameter("cnf_password");
	            long c = Long.parseLong(request.getParameter("contact"));
	            Customer customer = new Customer(id, n, e, p1, p2, c);
	            CustomerDao cd = new CustomerDaoJdbc();
	            boolean b=cd.updateCustomer(customer);
	            if(b==true)
	            {
	                response.sendRedirect("index.jsp");
	            }
	        }
	        else if(action.equals("delete"))
	        {
	            System.out.println("helllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
	            System.out.println("id="+request.getParameter("id"));
	            CustomerDao cd = new CustomerDaoJdbc();
	            cd.deleteCustomer(Integer.parseInt(request.getParameter("id")));
	            response.sendRedirect("index.jsp");
	        }
	    }


}
