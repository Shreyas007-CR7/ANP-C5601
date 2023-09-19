<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
	<form action="UserController" method="post">
	    <input type="hidden" name="method" value="updateUser">
		<table border="1" bgcolor="pink" align="center" width="35%">
			<tr bgcolor="yellow">
				<td colspan="2" align="center">
					<h2>Update User</h2>
				</td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="${searched_user.name }"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="username"  value="${searched_user.email }"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="${searched_user.password }"></td>
			</tr>			
			<tr>
				<td>Address:</td>
				<td><input type="text" name="city" value="${searched_user.address }"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Update">
				</td>
			</tr><!-- 
			<tr align="right">
			    <td colspan="2"><a href="login.jsp">Login</a></td>
			</tr> -->
		</table>

	</form>
</body>
</html>