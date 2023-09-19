<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete-User Page</title>
</head>
<body>
	<form action="UserController" method="post">
		<input type="hidden" name="method" value="deleteUser">
		<table border="1" bgcolor="pink" align="center" width="30%">
			<tr bgcolor="yellow">
				<td colspan="2" align="center">
					<h2>Delete User</h2>
				</td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Delete User">
				</td>
			</tr>
		</table>

	</form>
</body>
</html>