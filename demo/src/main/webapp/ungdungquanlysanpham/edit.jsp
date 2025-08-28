<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2025
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/ungdungquanlysanpham/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${product.name}"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="price" value="${product.price}"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" id="description" value="${product.description}"></td>
            </tr>
            <tr>
                <td>Manufacturer:</td>
                <td><input type="text" name="manufacturer" id="manufacturer" value="${product.manufacturer}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
