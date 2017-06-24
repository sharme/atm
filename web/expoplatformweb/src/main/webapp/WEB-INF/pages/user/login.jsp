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
    <link href="./css/dlstyle.css" rel="stylesheet" type="text/css">
    <!--登录自定义UI-->
    <link href="./css/mlogin.css" rel="stylesheet" type="text/css">
    <title>登录阿童木</title>
</head>
<body>
<div class="login-boxtitle">
    <a href="home/demo.html"><img alt="" src="./images/logobig.png" /></a>
</div>

<div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="./images/big.jpg" /></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active"><a href="">账号密码登录</a></li>
                    <li><a href="">手机动态登录</a></li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form method="post">

                            <div class="user-name">
                                <label for="user"><i class="am-icon-user"></i></label>
                                <input type="text" name="" id="user" placeholder="邮箱/手机/用户名">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="password" placeholder="请输入密码">
                            </div>
                            <br/>
                            <div class="forget-right">
                                <a href="#"> 忘记密码？</a>
                            </div>


                        </form>


                        <div class="am-cf">
                            <input type="submit" name="" value="登录" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>
                        <hr>



                    </div>

                    <div class="am-tab-panel">
                        <form method="post">
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" name="" id="phone" placeholder="手机号">
                            </div>
                            <div class="verification">
                                <label for="code"><i class="am-icon-code-fork"></i></label>
                                <input type="tel" name="" id="code" placeholder="请输入验证码">
                                <a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">
                                    <span id="dyMobileButton">获取</span></a>
                            </div>
                            <%--<div class="user-pass">--%>
                                <%--<label for="password"><i class="am-icon-lock"></i></label>--%>
                                <%--<input type="password" name="" id="password" placeholder="设置密码">--%>
                            <%--</div>--%>
                            <%--<div class="user-pass">--%>
                                <%--<label for="passwordRepeat"><i class="am-icon-lock"></i></label>--%>
                                <%--<input type="password" name="" id="passwordRepeat" placeholder="确认密码">--%>
                            <%--</div>--%>
                        </form>
                        <div class="am-cf">
                            <input type="submit" name="" value="登录" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>



                        <hr>
                    </div>

                    <script>
                        $(function() {
                            $('#doc-my-tabs').tabs();
                        })
                    </script>

                </div>
                <div id="thirdreglogin">
                    <div style="float: left" >
                        <p>使用第三方账户登录</p>
                        <button type="button" id="weixinlogin" class="am-btn am-btn-success">微信</button>
                    </div>

                    <div style="float: right">
                        <a href="./register"> 没有账号？注册</a>
                    </div>

                </div>
            </div>

        </div>
    </div>

    <div class="footer ">
        <div class="footer-hd ">
            <p>
                <a href="# ">阿童木</a>
                <b>|</b>
                <a href="# ">商城首页</a>
                <b>|</b>
                <a href="# ">支付宝</a>
                <b>|</b>
                <a href="# ">物流</a>
            </p>
        </div>
        <div class="footer-bd ">
            <p>
                <a href="# ">关于阿童木</a>
                <a href="# ">合作伙伴</a>
                <a href="# ">联系我们</a>
                <a href="# ">网站地图</a>
                <em>© 2017-2025 atm.com 版权所有</em>
            </p>
        </div>
    </div>
</body>


</body>
</html>
