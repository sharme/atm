<%--
  Created by IntelliJ IDEA.
  User: zhiyuli
  Date: 2017/6/24
  Time: 下午4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展览活动</title>
    <jsp:include page="common.jsp"/>

    <link href="./basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="./css/hmstyle.css">
    <link href="./css/seastyle.css" rel="stylesheet" type="text/css" />
    <link href="./css/mexhiactivity.css" rel="stylesheet" type="text/css" />
    <%--<link rel="stylesheet" href="./assets/css/style.css">--%>
</head>
<body>
<!---头部搜索 个人信息-->
<jsp:include page="./home-top.jsp"></jsp:include>

<!---功能菜单-->
<jsp:include page="./home-category.jsp"></jsp:include>

<div class="am-g am-g-fixed content-bottom">
    <div class="am-u-sm-12 am-u-md-12">
        <div class="theme-popover">
            <div class="searchAbout">
                <span class="font-pale">我的位置：</span>
                <a title="阿童木" href="#">阿童木 ></a>
                <a title="展览活动" href="#">展览活动</a>

            </div>
            <ul class="select">
                <p class="title font-normal">
                    <span class="fl">展览活动</span>
                    <span class="total fl">搜索到<strong class="num">997</strong>件相关活动</span>
                </p>
                <div class="clear"></div>
                <li class="select-result">
                    <dl>
                        <dt>已选</dt>
                        <dd class="select-no"></dd>
                        <p class="eliminateCriteria">清除</p>
                    </dl>
                </li>
                <div class="clear"></div>
                <li class="select-list">
                    <dl id="select1">
                        <dt class="am-badge am-round">所在城市</dt>

                        <div class="dd-conent">
                            <dd class="select-all selected"><a href="#">不限</a></dd>
                            <dd><a href="#">上海</a></dd>
                            <dd><a href="#">北京</a></dd>
                            <dd><a href="#">广州</a></dd>
                            <dd><a href="#">深圳</a></dd>
                            <dd><a href="#">杭州</a></dd>
                            <dd><a href="#">成都</a></dd>
                            <dd><a href="#">武汉</a></dd>
                            <dd><a href="#">长沙</a></dd>
                            <dd><a href="#">南京</a></dd>
                        </div>

                    </dl>
                </li>
                <li class="select-list">
                    <dl id="select2">
                        <dt class="am-badge am-round">行业类型</dt>
                        <div class="dd-conent">
                            <dd class="select-all selected"><a href="#">不限</a></dd>
                            <dd><a href="#">建材、石材、照明、暖通</a></dd>
                            <dd><a href="#">家具、家电、家居</a></dd>
                            <dd><a href="#">珠宝、首饰、美容、眼镜</a></dd>
                            <dd><a href="#">酒店、餐饮、旅游</a></dd>
                            <dd><a href="#">办公、礼品、消费品、玩具</a></dd>
                            <dd><a href="#">食品、饮料、烟酒</a></dd>
                            <dd><a href="#">汽配、摩配、自行车</a></dd>
                            <dd><a href="#">化工、环保、能源、橡塑</a></dd>
                            <dd><a href="#">体育、户外、影视、娱乐</a></dd>

                        </div>
                    </dl>
                </li>
                <%--<li class="select-list">--%>
                    <%--<dl id="select3">--%>
                        <%--<dt class="am-badge am-round">选购热点</dt>--%>
                        <%--<div class="dd-conent">--%>
                            <%--<dd class="select-all selected"><a href="#">全部</a></dd>--%>
                            <%--<dd><a href="#">手剥松子</a></dd>--%>
                            <%--<dd><a href="#">薄壳松子</a></dd>--%>
                            <%--<dd><a href="#">进口零食</a></dd>--%>
                            <%--<dd><a href="#">有机零食</a></dd>--%>
                        <%--</div>--%>
                    <%--</dl>--%>
                <%--</li>--%>

            </ul>
            <div class="clear"></div>
        </div>
    </div>

    <br/>

    <div class="am-u-sm-12 am-u-md-12 detail-top" style="touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
        <!--左边列表-->
        <div class="am-u-sm-8">
            <div class="am-u-sm-12 am-u-md-12 detail-top">
                <div class="am-u-sm-3">
                    <img src="./assets/img/app1.png" style="width: 200px;height: 150px">
                </div>
                <div class="am-u-sm-9">
                    <div class="am-u-sm-12 am-u-md-12">
                        <div class="am-u-sm-9">
                            <p>最新的上海站家博会</p><br/>
                            <p>最新的上海站家博会</p><br/>
                            <p>时间:2017-09-10 09:30       推荐度:五颗星</p>
                        </div>
                        <div class="am-u-sm-3">
                            <button type="button" id="weixinlogin" class="am-btn am-btn-success">微信</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="am-u-sm-12 am-u-md-12 detail-top">
                <div class="am-u-sm-3">
                    <img src="./assets/img/app1.png" style="width: 200px;height: 150px">
                </div>
                <div class="am-u-sm-9">
                    <div class="am-u-sm-12 am-u-md-12">
                        <div class="am-u-sm-9">
                            <p>最新的上海站家博会</p><br/>
                            <p>最新的上海站家博会</p><br/>
                            <p>时间:2017-09-10 09:30       推荐度:五颗星</p>
                        </div>
                        <div class="am-u-sm-3">
                            <button type="button" id="weixinlogin" class="am-btn am-btn-success">微信</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="am-u-sm-12 am-u-md-12 detail-top">
                <div class="am-u-sm-3">
                    <img src="./assets/img/app1.png" style="width: 200px;height: 150px">
                </div>
                <div class="am-u-sm-9">
                    <div class="am-u-sm-12 am-u-md-12">
                        <div class="am-u-sm-9">
                            <p>最新的上海站家博会</p><br/>
                            <p>最新的上海站家博会</p><br/>
                            <p>时间:2017-09-10 09:30       推荐度:五颗星</p>
                        </div>
                        <div class="am-u-sm-3">
                            <button type="button" id="weixinlogin" class="am-btn am-btn-success">微信</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="am-u-sm-12 am-u-md-12 detail-top">

                <div class="am-u-sm-3">
                    <img src="./assets/img/app1.png" style="width: 200px;height: 150px">
                </div>
                <div class="am-u-sm-9">
                    <div class="am-u-sm-12 am-u-md-12">
                        <div class="am-u-sm-9">
                            <p>最新的上海站家博会</p><br/>
                            <p>最新的上海站家博会</p><br/>
                            <p>时间:2017-09-10 09:30       推荐度:五颗星</p>
                        </div>
                        <div class="am-u-sm-3">
                            <button type="button" id="weixinlogin" class="am-btn am-btn-success">微信</button>
                        </div>
                    </div>
                </div>


            </div>
        </div>
        <!--右边边列表-->
        <div class="am-u-sm-4">
            <div style="width: 300px;height: 200px;background-color: #0b6fa2">

            </div>
        </div>


    </div>

        <ul class="am-pagination am-pagination-centered">
            <li class="am-disabled"><a href="#">&laquo;</a></li>
            <li class="am-active"><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">&raquo;</a></li>
        </ul>

</div>



</body>
</html>
