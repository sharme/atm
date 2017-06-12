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
        <!--登录注册tab-->
        <div class="am-tabs" data-am-tabs>
            <ul class="am-tabs-nav am-nav am-nav-tabs">
                <li class="am-active"><a href="#tab1">登录</a></li>
                <li><a href="#tab2">注册</a></li>
            </ul>
            <div class="am-tabs-bd">
                <!--登录tab-->
                <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                    <form class="am-form">
                        <fieldset>
                            <%--<legend>登录</legend>--%>

                            <div class="am-form-group">
                                <label for="doc-ipt-email-1">手机号/邮箱</label>
                                <input type="email" class="" id="doc-ipt-email-1" placeholder="输入手机号或电子邮件">
                            </div>

                            <div class="am-form-group">
                                <label for="doc-ipt-pwd-1">密码</label>
                                <input type="password" class="" id="doc-ipt-pwd-1" placeholder="输入密码">
                            </div>


                            <p><button type="submit" class="am-btn am-btn-default" style="width: 120px;">登录</button></p>
                        </fieldset>
                    </form>
                </div>
                <!--注册tab-->
                <div class="am-tab-panel am-fade" id="tab2">
                    <form class="am-form">
                        <fieldset>
                            <%--<legend>登录</legend>--%>

                            <div class="am-form-group">
                                <label for="doc-ipt-email-1">手机号</label>
                                <input type="email" class="" id="doc-ipt-mobile-1" placeholder="输入手机号">
                            </div>

                            <div class="am-form-group">
                                <label for="doc-ipt-pwd-1">验证码</label>
                                <input type="number" class="" id="doc-ipt-code-1" placeholder="验证码">
                            </div>

                            <div class="am-form-group">
                                <label for="doc-ipt-pwd-2">密码</label>
                                <input type="password" class="" id="doc-ipt-pwd-2" placeholder="输入密码">
                            </div>
                            <div class="am-form-group">
                                <label for="doc-ipt-pwd-2">你是</label>
                                &nbsp;<select class="" data-am-selected="{btnWidth: '40%', btnSize: 'sm', btnStyle: 'secondary'}" id="doc-ipt-role-1">
                                    <option value="1">设计师</option>
                                    <option value="2">展览/设计公司</option>
                                    <option value="3">主办方</option>
                                    <option value="4">普通</option>
                                </select>
                            </div>

                                <label class="am-checkbox">
                                    <div class="am-form-group">
                                        <input type="checkbox" checked="checked" value="" data-am-ucheck checked>
                                        阅读并接受《阿童木用户协议》
                                    </div>
                                </label>

                            <p><button type="submit" class="am-btn am-btn-default" style="width: 120px;">注册</button></p>
                            <p>&nbsp;<br/><br/><br/></p>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../news-model.jsp"/>
<jsp:include page="../footer-model.jsp"/>
${message}

<!--在这里编写你的代码-->

<script src="./assets/js/login.js"></script>

</body>
</html>
