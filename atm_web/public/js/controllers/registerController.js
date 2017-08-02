/**
 * Created by yao on 7/27/17.
 */

'use strict';

var registerController = angular.module('atmController');

var ipAddress = 'http://127.0.0.1:3000';

registerController.controller('registerController', ['$scope', '$http', '$window', function($scope, $http, $window){

    $scope.switchTab = function(key){

        $('.titleTab').css("border-bottom", "none");
        $(".login_main_title_" + key).css("border-bottom", "solid 2px forestgreen");
        $(".login_form").css("display", "none");
        $(".form_" + key).css("display", "block");


    };


    // SMS requesting
    $scope.sendVerifyCode = function() {

        $('.validation_msg').html("");

        if ($('#register-form-phoneNumber').val().length == 11 && $('#register-form-password').val().length >= 8) {

            console.log($scope.phoneForm.u_phone_num + " , " + $scope.phoneForm.u_pwd + " , " + $scope.scCode);

            var req = {
                method: 'GET',
                url: ipAddress + "/api/sendCode?to=" + $scope.phoneForm.u_phone_num,
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
        }
    };
    




    // Register an account with Phone Number
    $scope.phoneForm = {
        u_phone_num: '',
        scCode: '',
        u_pwd: ''
    };

    $scope.submit = function(){
        if($('#register-form-phoneNumber').val().length != 11){
            $('.validation_msg').html("请输入正确的手机号");
            return;
        }

        if($('#register-form-password').val().length < 8) {
            $('.validation_msg').html("密码长度不能低于8位");
            return;
        }

        if($scope.scCode) {
            $('.validation_msg').html("验证码不能为空");
            return;
        }

        var req = {
            method: 'GET',
            url: ipAddress + "/api/checkCode?to=" + $scope.phoneForm.u_phone_num + "&scCode=" + $scope.phoneForm.scCode,
            headers: {
                'Content-Type': 'application/json'
            }
        };

        var postData = $scope.phoneForm;
        $http(req).success(function (result) {
            if (result === "00") {
                $('.validation_msg').html("请输入正确验证码");
            } else if(result === '03'){
                $('.validation_msg').html("验证码失效.");
            }else {

                var req = {
                    method: 'POST',
                    url: ipAddress + '/users/create',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    data: JSON.stringify(postData)
                };

                $http(req).success(function (result) {
                    console.log(JSON.stringify(result));
                    if(result.errno == '1062') {
                        $('.validation_msg').html("该手机号已经被注册.");
                    } else if(result.errno){
                        $('.validation_msg').html("注册失败, 请联系管理员.");
                    } else {
                        $('.validation_msg').html("注册成功, 进行登录.");
                        $window.location.href = 'http://localhost:3000/views/account/login.html';
                    }

                }, function (error) {
                    console.log(error);
                });
            }
        }, function (error) {
            console.log(error);
        });
    };



}]);
