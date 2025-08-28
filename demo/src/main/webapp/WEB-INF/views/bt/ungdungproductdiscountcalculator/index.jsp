<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2025
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ungdungproductdiscountcalculator/discount" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="description" placeholder="description" value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="price" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discount" placeholder="discount" value="0"/><br/>
    <input type="submit" id="submit" value="Calculate Discount"/>
</form>
</body>
</html>
