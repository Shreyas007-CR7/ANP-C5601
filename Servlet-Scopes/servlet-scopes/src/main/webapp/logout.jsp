<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>user name is: <%= session.getAttribute("user_name") %></h2>
<h2>Password is: <%= session.getAttribute("password") %></h2>
<%   
   System.out.println("Username = "+session.getAttribute("user_name")); 
   System.out.println("Password = "+session.getAttribute("password"));
   session.invalidate();
   //System.out.println("Password = "+session.getAttribute("password"));
%>
<%   
   response.sendRedirect("login.jsp");
%>
</body>
</html>