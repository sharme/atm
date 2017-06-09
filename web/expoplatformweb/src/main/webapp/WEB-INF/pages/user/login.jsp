<%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 17/6/2
  Time: 下午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <%@include file="../common.jsp" %>
    <link rel="stylesheet" href="./assets/css/login.css">
    <title>登录阿童木</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<div class="am-g am-g-fixed">
    <div class="am-u-lg-8 am-padding-horizontal-xs">
        <div class="am-slider am-slider-default" data-am-flexslider="{playAfterPaused: 8000}">
            <ul class="am-slides">
                <li><img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" /></li>
                <li><img src="http://s.amazeui.org/media/i/demos/bing-2.jpg" /></li>
                <li><img src="http://s.amazeui.org/media/i/demos/bing-3.jpg" /></li>

            </ul>
        </div>
    </div>
    <div class="am-u-lg-4 am-padding-horizontal-xs">
        <form class="am-form">
            <fieldset>
                <legend>登录</legend>

                <div class="am-form-group">
                    <label for="doc-ipt-email-1">手机号/邮箱</label>
                    <input type="email" class="" id="doc-ipt-email-1" placeholder="输入手机号或电子邮件">
                </div>

                <div class="am-form-group">
                    <label for="doc-ipt-pwd-1">密码</label>
                    <input type="password" class="" id="doc-ipt-pwd-1" placeholder="输入密码">
                </div>


                <p><button type="submit" class="am-btn am-btn-default">登录</button>&nbsp;
                    <button type="submit" class="am-btn am-btn-danger">没有账号？注册一个</button></p>
            </fieldset>
        </form>
    </div>
</div>

<jsp:include page="../news-model.jsp"/>
<jsp:include page="../footer-model.jsp"/>
${message}

<!--在这里编写你的代码-->



</body>
</html>
