/**
 * Created by yao on 7/27/17.
 */

'use strict';

var loginController = angular.module('atmController');

var ipAddress = 'http://127.0.0.1:3000';

loginController.controller('LoginController', ['$scope', '$http', '$window', '$cookies', '$kookies', function($scope, $http, $window, $cookies, $kookies){

    
    $scope.switchTab = function(key){
        $('.titleTab').css("border-bottom", "none");
        $(".login_main_title_" + key).css("border-bottom", "solid 2px forestgreen");
        $(".login_form").css("display", "none");
        $(".form_" + key).css("display", "block");
    };

    // SMS Request
    $scope.sendVerifyCode = function() {

        if ($('#register-form-phoneNumber').val().length == 11 && $('#register-form-password').val().length >= 8 && $('#register-form-username').val().length > 4 ) {

            var req = {
                method: 'GET',
                url: ipAddress + "/api/sendCode?to=" + $scope.user.phoneNumber,
                headers: {
                    'Content-Type': 'application/json'
                }
            };
            $http(req).success(function (result) {

                if ("01" == result) {
                    $('.sendScCode').css("pointer-events", "none");
                    $scope.scCount = 60;
                    var scCodeBan = setInterval(function () {
                        $('.sendScCode').text("重新发送(" + $scope.scCount + "s)");
                        $scope.scCount--;

                        if ($scope.scCount == 0) {
                            clearInterval(scCodeBan);
                            $('.sendScCode').text("获取验证码");
                            $('.sendScCode').css("pointer-events", "");
                        }
                    }, 1000);

                } else if ("02" == result) {
                    alert("验证码发送频繁.")
                } else if ("03" == result) {
                    alert("发送异常, 请联系管理员.");
                } else {
                    alert("发送失败. 再试一次");
                }

            }, function (error) {
                console.log(error);
            });
        } else if ($('#register-form-phoneNumber').val().length == 0 || $('#register-form-phoneNumber').val().length != 11) {
            $('.validation_msg').html("请输入正确的手机号码");
        } else if ($('#register-form-password').val().length < 8){
            $('.validation_msg').html("密码长度不能低于8位");
        } else if ($('#register-form-username').val().length < 4){
            $('.validation_msg').html("用户名长度太短");
        }
    };
    
    
    $scope.registerForm = {
        u_phone_num:'',
        scCode: ''
    };
    
    $scope.register_submit = function () {

        console.log($scope.registerForm.u_phone_num + ", " + $scope.registerForm.scCode);
        
    };




    // Form submit for Login.
    $scope.loginForm = {
        u_name: '',
        u_pwd: ''
    };

    $scope.login_submit = function(){

        console.log('coming');

        var req = {
            method: 'POST',
            url: ipAddress + '/users/login',
            headers: {
                'Content-Type': 'application/json'
            },
            data: JSON.stringify($scope.loginForm)
        };

        $http(req).success(function(result){
            if(result.length > 0) {
                console.log(JSON.stringify(result[0]));
                $kookies.set('secret', result[0].secret, {expires: 7, path: '/'});
                $kookies.set('u_id', result[0].u_id, {expires: 7, path: '/'});
                $kookies.set('u_avatar', result[0].u_avatar, {expires: 7, path: '/'});
                $kookies.set('u_name', result[0].u_name, {expires: 7, path: '/'});
                $window.location.href = 'http://localhost:3000/#/events';
            }else {
                $('.validation_msg').html("用户名或者密码不正确, 请重新输入.");
            }
        }, function(error){
            console.log(error);
        });
    };

    






}]);
