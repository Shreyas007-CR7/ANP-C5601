<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ffffff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
        }
        table {
            width: 100%;
        }
        td {
            padding: 10px;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"],
        input[type="reset"] {
            width: 49%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <form method="post" action="cc">
            <input type="hidden" name="action" value="save_customer"/>
            <h2>Registration Page</h2>
            <table border="0">
                <tr>
                    <td align="right">User Name:</td>
                    <td>
                        <input type="text" name="cname" required/>
                    </td>
                </tr>
                <tr>
                    <td align="right">Email Id:</td>
                    <td>
                        <input type="text" name="email" required/>
                    </td>
                </tr>
                <tr>
                    <td align="right">Password:</td>
                    <td>
                        <input type="password" name="password" required/>
                    </td>
                </tr>
                <tr>
                    <td align="right">Confirm Password:</td>
                    <td>
                        <input type="password" name="cnf_password" required/>
                    </td>
                </tr>
                <tr>
                    <td align="right">Contact No:</td>
                    <td>
                        <input type="text" name="contact" required/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save"/>
                        <input type="reset" value="Clear All"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
     <jsp:include page="cc?action=show_customers"/>
     <jsp:include page="show_customers.jsp"/>
</body>
</html>
