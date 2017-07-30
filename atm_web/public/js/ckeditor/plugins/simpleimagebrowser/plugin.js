
CKEDITOR.dialog.add("simpleimagebrowser-dialog",
    function(){
        return{
            title:"选择图片",minWidth:450,minHeight:260,maxWidth:800,maxHeight:260,
            contents:[
                {
                    id:"tab-step1",
                    label:"浏览图片",
                    elements:[
                        {
                            type:"html",
                            align:"left",
                            id:"titleid",
                            style:"font-size: 20px; font-weight: bold;",
                            html:"浏览图片"
                        },{
                            type:"html",
                            align:"left",
                            id:"msg",style:"",
                            html:'<div id="imageBrowser"></div>'}
                    ]
                },
                {
                    id:"tab-step2",
                    label:"上传图片",
                    elements:[
                        {
                            type:"html",
                            align:"left",
                            id:"framepreviewtitleid",
                            style:"font-size: 20px; font-weight: bold;",
                            html:"<div ng-controller='TopicCtrl' class='fileUpload' style='position: relative; overflow: hidden; display: inline-block; vertical-align: top; margin-bottom: 10px;'><input type='file' style='  position: absolute;top: 0;right: 0;margin: 0;padding: 0;font-size: 20px;cursor: pointer;opacity: 0;' class='upload' onchange='uploadFile(this)' id='uploadBtn' name='imageName'/> " +
                            "<span class='uploadBtn' style='display: inline-block; vertical-align: top; background: #47a447; font-size: 16px; padding: 3px 10px; height: 30px; line-height: 22px;color: #fff; border-radius: 4px; border: 1px solid transparent;'>上传图片</span></div>"
                        },{
                            type:"html",
                            align:"left",
                            id:"descriptionid",
                            style:"position:relative;width:800px;",
                            html: "<img style='width: 450px; min-height: 300px;' class='create_footstep-info_img'><hr>" +
                            "<div style='position: relative; width: 100%; height: 30px; background-color: #ddd;' id='myProgress'><div id='myBar' style='position: absolute; width: 1%; height: 100%; background-color: #4CAF50; text-align: center; line-height: 2;'></div> </div>"
                        }
                    ]
                }
            ]
        }
    }
),CKEDITOR.plugins.add("simpleimagebrowser",
    {
        init:function(a){
            "undefined"==typeof
                CKEDITOR.config.simpleImageBrowserListType
                &&(CKEDITOR.config.simpleImageBrowserListType="thumbnails"),
                a.on("dialogShow",function(a)
                {
                    var b;
                    b = a.data,
                    "simpleimagebrowser-dialog"=== b.getName() && $.get(CKEDITOR.config.simpleImageBrowserURL,
                    function(a){
                        var b;
                        console.log("JSON DATA: " + a);
                        return console.log(a),b = a, a = "",
                            $.each(b, function(b,c){
                                a="thumbnails"===CKEDITOR.config.simpleImageBrowserListType?a+ "<div onclick=\"CKEDITOR.tools.simpleimagebrowserinsertpicture('"+c.url+"');\" " +
                                "style=\"position:relative;width:135px;height: 130px;;display:inline-block;margin:5px;background-image:url('"+c.url+"');background-repeat:no-repeat;background-size:125%;background-position:center center;float:left;\"></div>":"link"}),
                            $("#imageBrowser").html(a)})
                }),a.addCommand("simpleimagebrowser-start",
                new CKEDITOR.dialogCommand("simpleimagebrowser-dialog")),
                CKEDITOR.tools.simpleimagebrowserinsertpicture=function(b){
                    var c,d;console.log(b),
                        a=CKEDITOR.currentInstance,
                        c=CKEDITOR.dialog.getCurrent(),
                        d='<img src="'+b+'" width="100%" data-cke-saved-src="'+b+'" alt="'+b+'"/>',
                        a.config.allowedContent=!0,
                        a.insertHtml(d.trim()),
                        c.hide()},
                a.ui.addButton("Simple Image Browser",{label:"Simple Image Browser ",command:"simpleimagebrowser-start",icon:this.path+"images/icon.png"})}});




var progress = 1;
var progressBar = function(){
    progress += 1;
    if(progress < 99) {
        $('#myBar').width(progress + "%");
        $('#myBar').text(progress + "%");
    } else {
        clearInterval(progressBar);
    }
};

function loginCheck(){
    if(!getCookie('u_id')){
        window.location.href = '#/login';
    }
}

function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

var delPicture = function(url) {

    $.ajax({
        url: "http://localhost:8080" + "/pictures/delete",
        contentType: false,
        data: {'bigImg': url},
        processData: false,
        cache: false,
        type: "POST",
        success: function (res) {
           alert("删除成功");
        },
        error: function(res) {
            // $('#myBar').text('上传失败!');
            alert("删除失败");
        }
    });

};


var uploadFile = function(file) {

    console.log('upload file');
    $('#myBar').width("1%");
    progress = 1;
    setInterval(progressBar, 5);
    var file_data = $(file).prop('files')[0];
    var form_data = new FormData();
    form_data.append('u_id', getCookie('u_id'));
    form_data.append("file", file_data);

    $.ajax({
        url: "http://180.76.152.112" + "/api/uploadPhotos",
        contentType: false,
        data: form_data,
        processData: false,
        cache: false,
        type: "POST",
        success: function (res) {
            $('#myBar').width("100%");
            $('#myBar').text('上传完成!');
            console.log('successfully uploaded, URL: ' + res);
            $(file).parent().css("min-height", '0px');
            $('.create_footstep-info_img').attr('src', res.bigImg);
            // init(CKEDITOR.currentInstance);
            CKEDITOR.config.simpleImageBrowserURL = 'pictures/getPictures?u_id=' + getCookie('u_id');
            CKEDITOR.tools.callFunction(10,this);
            $('.cke_dialog_background_cover').css('display','none');
        },
        error: function(res) {
            $('#myBar').text('上传失败!');
        }
    });
};