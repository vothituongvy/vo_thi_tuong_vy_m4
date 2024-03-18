<%--
  Created by IntelliJ IDEA.
  User: TUONG VY
  Date: 15/03/2024
  Time: 9:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Từ điển đơn giản</title>
</head>
<body>
<form action="/search" method="post">
    <input type="text" name="word" placeholder="Nhập từ cần tra cứu">
    <input type="submit" value="Tra cứu">
</form>

<p>
    ${meaning}
</p>

<p style="color: red">
    ${message}
</p>
</body>
</html>
