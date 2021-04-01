<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/3/26
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <style>
        form {
            text-align: center;
        }

    </style>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" name="username"><br>
        密码:<input type="password" name="password"><br>
        爱好:
        programmer<input type="checkbox" name="hobbys" value="程序">
        basketball<input type="checkbox" name="hobbys"value="篮球">
        computer game<input type="checkbox" name="hobbys" value="电脑游戏">
        beautiful girl<input type="checkbox" name="hobbys" value="女孩">
        <input type="submit">
    </form>


</body>
</html>
