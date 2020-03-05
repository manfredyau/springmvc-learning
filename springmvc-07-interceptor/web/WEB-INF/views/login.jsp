<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/4
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登陸頁面</h1>
<form action="${pageContext.request.contextPath}/login/verify" method="post">
    用戶名<input id="username" name="username" type="text">
    密碼<input id="password" name="password" type="text">
    <input type="submit" value="登入">
</form>
</body>
</html>
