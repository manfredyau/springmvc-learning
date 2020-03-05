<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/3
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View For test4</title>
    <script src="${pageContext.request.contextPath}/jQuery/jquery-3.4.1.js">
    </script>
    <script>
        $(function pre() {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/ajax/test4", function (data) {
                    // console.log(data);
                    let html = "";

                    for (let i = 0; i < data.length; i++) {
                        html += "<tr>" +
                            "<td>" + data[i].id + "</td>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "</tr>"
                    }

                    $("#content").html(html);
                })
            });
        })

    </script>
</head>
<body>
<input id="btn" type="button" value="Fetching Data">
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年齡</th>
    </tr>
    </thead>
    <tbody id="content">

    </tbody>
</table>
</body>
</html>
