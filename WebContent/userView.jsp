<%@ page language="java" import="java.util.ArrayList,java.util.List,com.market.entity.User"
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>

    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> <%=session.getAttribute("name") %></span> , 欢迎你！</p>
        <a href="login.jsp">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="BillServlet">账单管理</a></li>
                <li><a href="ProviderServlet">供应商管理</a></li>
                <li><a href="UserServlet">用户管理</a></li>
                <li><a href="password.jsp">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户信息查看页面</span>
        </div>
        <c:forEach items="${userlist}" var="user">
        <div class="providerView">
            <p><strong>用户编号：</strong><span>${user.cid}</span></p>
            <p><strong>用户名称：</strong><span>${user.name}</span></p>
            <p><strong>用户性别：</strong><span>${user.csex}</span></p>
            <p><strong>用户电话：</strong><span>${user.cphone}</span></p>
            <p><strong>用户地址：</strong><span>${user.cadress}</span></p>
            <p><strong>用户类别：</strong><span>${user.cposition}</span></p>
            <a href="UserServlet">返回</a>
        </div>
        </c:forEach>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>