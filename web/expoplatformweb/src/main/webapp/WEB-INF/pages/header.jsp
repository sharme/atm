<%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 17/6/9
  Time: 下午12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header class="am-topbar header">

    <div class="am-container-1">

        <div class="left hw-logo">
            <img class="logo" src="./assets/img/atm-logo.jpg"/>
            <%--<img class="word" src="./assets/img/hw-word.png"/>--%>
            阿童木展览信息平台
        </div>
        <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
                data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
                class="am-icon-bars"></span></button>

        <div class="am-collapse am-topbar-collapse am-center" id="doc-topbar-collapse">


            <div class=" am-topbar-left am-form-inline am-topbar-right" role="search">
                <ul class="am-nav am-nav-pills am-topbar-nav hw-menu">
                    <li class="hw-menu-active"><a href="./index">首页</a></li>
                    <li ><a href="./solutions">解决方案</a></li>
                    <li><a href="./product-show">产品展示 </a></li>
                    <li><a href="./customer-case">客户案例</a></li>
                    <li><a href="./service-center">服务中心 </a></li>
                    <li><a href="./news">新闻动态 </a></li>
                    <li><a href="./login">登录/注册</a></li>
                </ul>
            </div>

        </div>


    </div>
</header>
</body>
</html>
