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
            阿童木
        </div>
        <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
                data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
                class="am-icon-bars"></span></button>

        <div class="am-collapse am-topbar-collapse am-center" id="doc-topbar-collapse">


            <div class=" am-topbar-left am-form-inline am-topbar-right" role="search">
                <ul class="am-nav am-nav-pills am-topbar-nav hw-menu">
                    <li class="hw-menu-active" id="header_0"><a href="./index">首页</a></li>
                    <li  id="header_1"><a href="./solutions">展览/设计公司</a></li>
                    <li id="header_2"><a href="./product-show">设计师 </a></li>
                    <li id="header_3"><a href="./customer-case">展会活动</a></li>
                    <li id="header_4"><a href="./news">最新动态 </a></li>
                    <li id="header_5"><a href="./service-center">服务中心 </a></li>
                    <li id="header_6"><a href="./login">登录/注册</a></li>
                </ul>
            </div>

        </div>


    </div>
</header>
</body>
</html>
