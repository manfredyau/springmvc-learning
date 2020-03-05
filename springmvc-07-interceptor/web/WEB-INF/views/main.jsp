<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/4
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<h1>首頁</h1>
<span>${username}</span>
<p>
    <a href="${pageContext.request.contextPath}/login/logout">登出</a>
</p>
</body>
</html>
