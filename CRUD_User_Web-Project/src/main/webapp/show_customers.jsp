<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="white">
        <table border="1" width="60%" bgcolor="white" align="center">                
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Confirm Password</th>
                <th>Contact No</th>
                <th colspan="2">Do Modifications</th>
            <tr>
            <c:forEach items="${customerList}" var="cust" >
                <tr>
                    <td><c:out value="${cust.id}"/></td>
                    <td><c:out value="${cust.customerName}"/></td>
                    <td><c:out value="${cust.email}"/></td>
                    <td><c:out value="${cust.password}"/></td>
                    <td><c:out value="${cust.confirmPassword}"/></td>
                    <td><c:out value="${cust.contactNo}"/></td>
                    <td align="center"><a href="update_customer.jsp?id=${cust.id}">Edit</a></td>
                    <td align="center"><a href="cc?action=delete&id=${cust.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>