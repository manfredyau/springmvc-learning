<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/4
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="jQuery/jquery-3.4.1.js"></script>
    <script>
        function blurForUsername() {
            $.post({
                url: "${pageContext.request.contextPath}/ajax/test5",
                data: {"username": $("#username").val()},
                success: function (data) {
                    if (data === "Good") {
                        $("#usernameVerify").css("color", "green");
                    } else {
                        $("#usernameVerify").css("color", "red");
                    }
                    document.getElementById("usernameVerify").innerHTML = data;
                }
            })
        }

        function blurForPassword() {
            $.post({
                url: "${pageContext.request.contextPath}/ajax/test5",
                data: {
                    "username": $("#username").val(),
                    "password": $("#password").val()
                },
                success: function (data) {
                    if (data === "Good") {
                        $("#passwordVerify").css("color", "green");
                    } else {
                        $("#passwordVerify").css("color", "red");
                    }
                    $("#passwordVerify").html(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
    <label for="username">用户名</label>
    <input id="username" type="text" onblur="blurForUsername()">
    <span id="usernameVerify"></span>
</p>
<p>
    <label for="password">密碼</label>
    <input id="password" type="text" onblur="blurForPassword()">
    <span id="passwordVerify"></span>
</p>
</body>
</html>
