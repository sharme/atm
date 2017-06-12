/**
 * Created by lzy on 17/6/9.
 */
$(document).ready(function (){

    ///头部激活登录样式
    for (var i=0;i<=5;i++)
    {
        $("#header_"+i).removeClass("hw-menu-active");
    }
    $("#header_6").addClass("hw-menu-active");
});