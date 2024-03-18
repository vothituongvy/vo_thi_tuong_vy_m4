<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<h1>Chuyển đổi USD sang VNĐ</h1>
<form action="/convert" method="post">
  <label for="usd">Số tiền USD:</label>
  <input type="number" id="usd" name="usd" required>
  <br>
  <label for="rate">Tỉ giá:</label>
  <input type="number" id="rate" name="rate" required>
  <br>
  <br>
  <button type="submit">Chuyển đổi</button>
</form>
<br>
<%--<p>Kết quả: ${vnd}</p>--%>
</body>
</html>

