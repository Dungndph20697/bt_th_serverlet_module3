<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2025
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product</h1>
<div>
    <form action="/ungdungquanlysanpham/product?action=search" method="post">
        <input type="text" name="SearchName" id="SearchName" placeholder="Enter product name">
        <input type="submit" value="Search">
    </form>
</div>
<p>
    <a href="/ungdungquanlysanpham/product?action=create">Create new product</a>
</p>
<a href="/ungdungquanlysanpham/product"><button>Reset</button></a>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="products">
        <tr>
            <td><a href="/ungdungquanlysanpham/product?action=detail&id=${products.getId()}">${products.getName()}</a>
            </td>
            <td>${products.getPrice()}</td>
            <td>${products.getDescription()}</td>
            <td>${products.getManufacturer()}</td>
            <td><a href="/ungdungquanlysanpham/product?action=edit&id=${products.getId()}">edit</a></td>
            <td><a href="/ungdungquanlysanpham/product?action=delete&id=${products.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
