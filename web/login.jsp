<%--
  Created by IntelliJ IDEA.
  User: hightlight
  Date: 2020/3/3
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.css">
</head>
<style type="text/css">
    #body1 {
        /*#10AEB5*/
        background-color: #21A4FE;
    }
</style>
<body id="body1">
<div id="container">
    <div style="height: 200px;"></div>
    <form action="${pageContext.request.contextPath}/user/login" method="post" class="form-horizontal">
        <div class="form-group">
            <label for="account" class="control-label col-md-2">用户名:</label>
            <div class="col-md-4">
                <input type="text" name="account" class="form-control" id="account">
            </div>
        </div>

        <div class="form-group">
            <label for="password" class="control-label col-md-2">密码:</label>
            <div class="col-md-4">
                <input type="password" name="password" class="form-control" id="password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-4 col-md-offset-3">
                <input type="submit" value="登录" class="btn btn-default">
            </div>
        </div>
    </form>
    <c:if test="${not empty msg}">
        <div class="col-md-3 col-md-offset-2">
            <div class="alert alert-warning alert-dismissible">
                <button type="button" class="close" data-dismiss="alert">
                    <span>&times;</span>
                </button>
                <strong> ${msg}!</strong>
            </div>
        </div>
    </c:if>
</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
