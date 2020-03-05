<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/3
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jQuery/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        function work() {
            $.post({
                url:"${pageContext.request.contextPath}/ajax/test2",
                data:{"name":$("#username").val()},
                success: function (data, status) {
                    alert(data);
                    console.log("data: " + data);
                    console.log("status: " + status);
                }
            })
        }
    </script>
</head>
<body>
用戶名：<input type="text" id="username" onblur="work()">
</body>
</html>
