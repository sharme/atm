<%--
  Created by IntelliJ IDEA.
  User: zhiyuli
  Date: 2017/6/24
  Time: 下午2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../common.jsp" %>
    <link href="./css/dlstyle.css" rel="stylesheet" type="text/css">
    <!--登录自定义UI-->
    <link href="./css/mlogin.css" rel="stylesheet" type="text/css">
    <link href="./css/mregister.css" rel="stylesheet" type="text/css">
    <title>账号注册</title>
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
                    <li ><a href="">手机号注册</a></li>
                    <%--<li><a href="">邮箱注册</a></li>--%>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
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

                            <div class="user-pass">
                            <label for="password"><i class="am-icon-lock"></i></label>
                            <input type="password" name="" id="password" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                            <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                            <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                            </div>

                            我是&nbsp;<select data-am-selected="{btnWidth: '40%', btnSize: 'sm', btnStyle: 'secondary',dropUp: 1}">
                                <option value="a">参展商</option>
                                <option value="b">设计师</option>
                                <option value="o">展台搭建公司</option>
                                <option value="m">工人</option>
                                <option value="m">展台设计公司</option>
                                <option value="m">游客</option>
                            </select>

                        </form>


                        <div class="am-cf">
                            <input type="submit" name="" value="同意阿童木用户协议并注册" class="am-btn am-btn-danger am-btn-sm am-fl">
                        </div>
                        <hr>



                    </div>

                    <!---这段暂时不开放  可用作邮箱注册--->
                    <div class="am-tab-panel">
                        <form method="post">
                            <%--<div class="user-phone">--%>
                                <%--<label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>--%>
                                <%--<input type="tel" name="" id="phone" placeholder="手机号">--%>
                            <%--</div>--%>
                            <%--<div class="verification">--%>
                                <%--<label for="code"><i class="am-icon-code-fork"></i></label>--%>
                                <%--<input type="tel" name="" id="code" placeholder="请输入验证码">--%>
                                <%--<a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">--%>
                                    <%--<span id="dyMobileButton">获取</span></a>--%>
                            <%--</div>--%>
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
                        <a href="#">阿童木用户协议</a>
                    </div>

                    <div style="float: right">
                        <a href="./login"> 已有账号？登录</a>
                    </div>

                </div>
            </div>

        </div>
    </div>

<jsp:include page="../footer-model.jsp"></jsp:include>
</body>
</html>
