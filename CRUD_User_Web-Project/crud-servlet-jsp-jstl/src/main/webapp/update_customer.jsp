<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Customer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            border-collapse: collapse;
            width: 40%;
            margin: 0 auto;
            background-color: white;
            border: 1px solid #ccc;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
        }
        th {
            background-color: #007BFF;
            color: white;
        }
        h2 {
            text-align: center;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form method="post" action="cc">
        <input type="hidden" name="action" value="update_customer"/>
        <c:forEach items="${customerList}" var="customer">
            <c:if test="${customer.id == param.id}">
                <input type="hidden" name="id" value="${customer.id}" />
                <table border="0">
                    <tr>
                        <td colspan="2" align="center">
                            <h2>Update Customer</h2>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">User Name:</td>
                        <td>
                            <input type="text" name="cname" value="${customer.customerName}" />
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Email Id:</td>
                        <td>
                            <input type="text" name="email" value="${customer.email}" />
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Password:</td>
                        <td>
                            <input type="password" name="password" value="${customer.password}" />
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Confirm Password:</td>
                        <td>
                            <input type="password" name="cnf_password" value="${customer.confirmPassword}" />
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Contact No:</td>
                        <td>
                            <input type="text" name="contact" value="${customer.contactNo}" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Update" />
                        </td>
                    </tr>
                </table>
            </c:if>
        </c:forEach>
    </form>
</body>
</html>
