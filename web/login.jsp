<%--
  Created by IntelliJ IDEA.
  User: hightlight
  Date: 2020/3/3
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<div id="container">
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <p>用户名：<input type="text" name="account"></p>
        <p>密码：<input type="password" name="password"></p>
        <p><input type="submit" value="登录"></p>
    </form>
    ${msg}
</div>
</body>
</html>
