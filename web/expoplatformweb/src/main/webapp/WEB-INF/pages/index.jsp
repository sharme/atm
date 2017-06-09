<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>

    <title>首页</title>

    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <!-- Set render engine for 360 browser -->
    <meta name="renderer" content="webkit">

    <!-- No Baidu Siteapp-->
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="icon" type="image/png" href="./assets/i/favicon.png">

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="./assets/i/app-icon72x72@2x.png">

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="apple-touch-icon-precomposed" href="./assets/i/app-icon72x72@2x.png">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="./assets/i/app-icon72x72@2x.png">
    <meta name="msapplication-TileColor" content="#0e90d2">

    <link rel="stylesheet" href="./assets/css/amazeui.min.css">
    <link rel="stylesheet" href="./assets/css/amazeui.css">
    <link rel="stylesheet" href="./assets/css/app.css">
    <link rel="stylesheet" href="./assets/css/style.css">

</head>







<body>

<jsp:include page="header.jsp"/>
<div class="rollpic">
    <div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{}' >
        <ul class="am-slides">
            <li><img src="./assets/img/hw_bg1.png"/></li>
            <li><img src="./assets/img/hw_bg.png"/></li>
            <li><img src="./assets/img/hw_bg3.png"/></li>
        </ul>
    </div>
</div>
<div class="am-container-1">
    <div class="solutions part-all">
        <div class="part-title">
            <a href="../solutions.jsp">
                <i class="am-icon-lightbulb-o part-title-i"></i>
                <span class="part-title-span">解决方案</span>
                <p>Solutions</p>
            </a>
        </div>
        <ul class="am-g part-content solutions-content">
            <li class="am-u-sm-6 am-u-md-3 am-u-lg-3">
                <i class="am-icon-safari solution-circle"></i>
                <span class="solutions-title">网站、移动网站</span>
                <p class="solutions-way">微信公众号开发移动网站微信公众号开发</p>
            </li>
            <li class="am-u-sm-6 am-u-md-3 am-u-lg-3">
                <i class="am-icon-magic solution-circle"></i>
                <span class="solutions-title">网站、移动网站</span>
                <p class="solutions-way">移动网站微信公众号开发移动网站微信公众号开发,解决方案</p>
            </li>
            <li class="am-u-sm-6 am-u-md-3 am-u-lg-3">
                <i class="am-icon-phone solution-circle"></i>
                <span class="solutions-title">网站、移动网站</span>
                <p class="solutions-way">移动网站微信公众号开发移动网站微信公众号开发</p>
            </li>
            <li class="am-u-sm-6 am-u-md-3 am-u-lg-3">
                <i class="am-icon-hacker-news solution-circle"></i>
                <span class="solutions-title">网站、移动网站</span>
                <p class="solutions-way">网站、移动网站微信公众号开发移动网站微信公众号开发,解决方案</p>
            </li>

        </ul>

    </div>
</div>
<jsp:include page="customer-home-case.jsp"></jsp:include>
<jsp:include page="news-model.jsp"></jsp:include>
<!--<div class="three-reason">
			<div class="part-title three-reason-title">
			<span class="part-title-span w-white">选择恒望的三大理由</span>
			<p class="w-white">Why Choose Hengwang</p>

		</div>
			<ul class="am-g part-content three-reason-content">
			  <li class="am-u-sm-4 am-u-md-4 am-u-lg-4">
			  	<div class="three-reason-img1 "></div>
			  	<p class="reason-title w-white">规模优势<br/>Scale advantage</p>
			  </li>
			  <li class="am-u-sm-4 am-u-md-4 am-u-lg-4">
			  	<div class="three-reason-img2 "></div>
			  	<p class="reason-title w-white ">领先技术<br/>Leading technology</p>
			  </li>
			  <li class="am-u-sm-4 am-u-md-4 am-u-lg-4">
			  	<div class="three-reason-img3 "></div>
			  	<p class="reason-title w-white">整合能力<br/>Integration capability</p>
			  </li>
		</ul>
		</div>-->
<div class="part-all gray-li">
    <div class="customer  am-container-1">
        <div class="part-title">
            <i class="am-icon-users part-title-i"></i>
            <span class="part-title-span">服务客户</span>
            <p>Serve Customers</p>
        </div>

        <div class="am-slider am-slider-default am-slider-carousel part-all" data-am-flexslider="{itemWidth:150, itemMargin: 5, slideshow: false}" style="  background-color: #f0eeed; box-shadow:none;">
            <ul class="am-slides">
                <li><img src="./assets/img/ptn4.png"/></li>
                <li><img src="./assets/img/ptn5.png"/></li>
                <li><img src="./assets/img/ptn6.png"/></li>
                <li><img src="./assets/img/ptn7.png"/></li>
                <li><img src="./assets/img/ptn8.png"/></li>
                <li><img src="./assets/img/ptn4.png"/></li>
                <li><img src="./assets/img/ptn5.png"/></li>
                <li><img src="./assets/img/ptn6.png"/></li>
                <li><img src="./assets/img/ptn7.png"/></li>
                <li><img src="./assets/img/ptn8.png"/></li>
            </ul>
        </div>
        <!--<ul class="customer-content">
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn4.png"/></div></li>
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn5.png"/></div></li>
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn6.png"/></div></li>
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn7.png"/></div></li>
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn8.png"/></div></li>
            <li class="am-u-sm-6 am-u-md-4 am-u-lg-2"><div><img src="img/ptn4.png"/></div></li>
            <div class="clear"></div>
        </ul>-->
    </div>
</div>
<footer class="footer ">

    <ul>

        <li class="am-u-lg-4 am-u-md-4 am-u-sm-12 part-5-li2">
            <div class="part-5-title">联系我们</div>
            <div class="part-5-words2">
                <span>地址:武汉市洪山区街道口鹏程国际B座2511</span>
                <span>电话:18238765101</span>
                <span>传真:(123) 456-7890</span>
                <span>邮箱:support@vectorlab.com</span>
                <span><i class="am-icon-phone"></i><em >027-82671661</em></span>
            </div>
        </li>
        <li class="am-u-lg-4 am-u-md-4 am-u-sm-12 ">
            <div class="part-5-title">相关链接</div>
            <div class="part-5-words2">
                <ul class="part-5-words2-ul">
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../solutions.jsp">解决方案</a></li>
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../product-show.jsp">产品展示</a></li>
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../customer-case.jsp">客户案例</a></li>
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../service-center.jsp">服务中心</a></li>
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../about-us.jsp">关于我们</a></li>
                    <li class="am-u-lg-4 am-u-md-6 am-u-sm-4"><a href="../recruit.jsp">招贤纳士</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
        </li>
        <div class="clear"></div>
    </ul>

</footer>


<!--[if (gte IE 9)|!(IE)]><!-->
<%--<script src="../assets/js/jquery.min.js"></script>--%>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="./assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="./assets/js/amazeui.min.js"></script>
<script src="./assets/js/amazeui.ie8polyfill.js"></script>
<script src="./assets/js/amazeui.ie8polyfill.min.js"></script>
<script src="./assets/js/amazeui.widgets.helper.js"></script>
<script src="./assets/js/amazeui.widgets.helper.min.js"></script>

</body>
</html>
