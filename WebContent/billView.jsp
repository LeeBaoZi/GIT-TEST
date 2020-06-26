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
            <span>账单管理页面 >> 信息查看</span>
        </div>
        <c:forEach items="${billlist}" var="bill">
        <div class="providerView">
            <p><strong>账单编号：</strong><span>${bill.bid}</span></p>
            <p><strong>商品名称：</strong><span>${bill.bname}</span></p>
            <p><strong>商品单价：</strong><span>${bill.bprice}</span></p>
            <p><strong>商品数量：</strong><span>${bill.bamount}</span></p>
            <p><strong>总价：</strong><span>${bill.btotal}</span></p>
            <p><strong>供货商：</strong><span>${bill.bprovider}</span></p>
            <p><strong>付款状态：</strong><span>${bill.binfo}</span></p>
            <p><strong>创建日期：</strong><span>${bill.bdate}</span></p>
            <a href="BillServlet">返回</a>
        </div>
        </c:forEach>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>