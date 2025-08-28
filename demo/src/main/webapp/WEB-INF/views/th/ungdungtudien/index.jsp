<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2025
  Time: 9:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/ungdungtudien/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
</form>
</body>
</html>
