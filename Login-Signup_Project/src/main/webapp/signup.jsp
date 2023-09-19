<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<form action="UserController" method="post">
	    <input type="hidden" name="method" value="createUser">
		<table border="1" bgcolor="pink" align="center" width="50%">
			<tr bgcolor="yellow">
				<td colspan="2" align="center">
					<h2>Registration Form</h2>
				</td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>			
			<tr>
				<td>Address:</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Register">
				</td>
			</tr>
			<tr align="right">
			    <td colspan="2"><a href="login.jsp">Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>