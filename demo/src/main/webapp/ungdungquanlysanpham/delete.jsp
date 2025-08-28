<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2025
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/ungdungquanlysanpham/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${product.name}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${product.price}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${product.description}</td>
            </tr>
            <tr>
                <td>Manufacturer:</td>
                <td>${product.manufacturer}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/ungdungquanlysanpham/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
