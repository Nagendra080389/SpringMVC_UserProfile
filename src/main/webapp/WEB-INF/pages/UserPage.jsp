<%--
  Created by IntelliJ IDEA.
  User: Nagendra
  Date: 01-03-2017
  Time: PM 07:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>

<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
    <title>User Profile</title>
</head>
<body>
<table>
    <tr>
        <th>User Name</th>
        <th>Phone Number</th>
    </tr>

    <tr>
    <td>${user.name}</td>
    <td>${user.phoneNumber}</td>
    </tr>
</table>
</body>
</html>
