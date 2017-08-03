'use strict';

var atmController = angular.module('atmController', []);
var ipAddress = 'http://127.0.0.1:3000';



function pages($http, $scope, records){
    //数据源
    $scope.data = records;
    //分页总数
    $scope.pageSize = 5;
    $scope.pages = Math.ceil($scope.data.length / $scope.pageSize); //分页数
    $scope.newPages = $scope.pages > 5 ? 5 : $scope.pages;
    $scope.pageList = [];
    $scope.selPage = 1;
    //设置表格数据源(分页)
    $scope.setData = function () {
        $scope.items = $scope.data.slice(($scope.pageSize * ($scope.selPage - 1)), ($scope.selPage * $scope.pageSize));//通过当前页数筛选出表格当前显示数据
    };
    $scope.items = $scope.data.slice(0, $scope.pageSize);
    //分页要repeat的数组
    for (var i = 0; i < $scope.newPages; i++) {
        $scope.pageList.push(i + 1);
    }
    //打印当前选中页索引
    $scope.selectPage = function (page) {
        //不能小于1大于最大
        if (page < 1 || page > $scope.pages) return;
        //最多显示分页数5
        if (page > 2) {
        //因为只显示5个页数，大于2页开始分页转换
            var newpageList = [];
            for (var i = (page - 3) ; i < ((page + 2) > $scope.pages ? $scope.pages : (page + 2)) ; i++) {
                newpageList.push(i + 1);
            }
            $scope.pageList = newpageList;
        }
        $scope.selPage = page;
        $scope.setData();
        $scope.isActivePage(page);
        console.log("选择的页：" + page);

        $http({method: 'GET', url: ipAddress + '/events/getEventsByCity', params:{e_city: $scope.city, start: (page-1)* 2, count: 2}})
            .success(function(data){
                $scope.events = data;
                // displayPosition(500,20);
            },function(error){
                $scope.error = error;
            });

    };
    //设置当前选中页样式
    $scope.isActivePage = function (page) {
        return $scope.selPage == page;
    };
    //上一页
    $scope.Previous = function () {
        $scope.selectPage($scope.selPage - 1);
    };
    //下一页
    $scope.Next = function () {
        $scope.selectPage($scope.selPage + 1);
    };

}



atmController.controller('EventController', ['$scope', '$http', '$cookies', '$kookies', '$window', function($scope, $http, $cookies, $kookies, $window){

    $scope.city = '所有';

    if($kookies.get('u_id')) {
        $('.header_title_right').html($kookies.get('u_name'));
        $('.welcome').html('嘿! ' + $kookies.get('u_name'));
        $('.account_entry').css("display", "none");
    }

    $http({method: 'GET', url: ipAddress + '/events/getEvents', params:{start: 0, count: 5}})
        .success(function(data){
            $scope.events = data;
            
        },function(error){
            $scope.error = error;
        });

    $http({method: 'GET', url: ipAddress + '/events/getTotal', params: {e_city: $scope.city}})
        .success(function(data){
            pages($http, $scope, data);
        },function(error){
            $scope.error = error;
        });


    $http({method: 'GET', url: ipAddress + '/newest/getNewest', params:{start: 0, count: 10}})
        .success(function(data){
            $scope.newest = data;
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });
    
    console.log("secret: " + $kookies.get('secret'));
    
    
    
    
    
    
    $scope.filterByCity = function(city, point) {

        $('.event_filter').css('background-color', 'white');
        $('.event_' + point).css('background-color', 'springgreen');
        $scope.city = city;
        $http({method: 'GET', url: ipAddress + '/events/getEventsByCity', params:{e_city: city, start: 0, count: 5}})
            .success(function(data){
                $scope.events = data;
            },function(error){
                $scope.error = error;
            });

        $http({method: 'GET', url: ipAddress + '/events/getTotal', params: {e_city: $scope.city}})
            .success(function(data){
                pages($http, $scope, data);
            },function(error){
                $scope.error = error;
            });

    };




    $scope.pageView = function(e_id) {

        var click = {
            key_id: e_id,
            u_id: $kookies.get('u_id')
        };
        var req = {
            method: 'POST',
            url: ipAddress + '/pageView/add',
            headers: {
                'Content-Type': 'application/json'
            },
            data: JSON.stringify(click)
        };

        $http(req).success(function(result){
            $window.location.href = "#/events/" + e_id;
        }, function(error){
            console.log(error);
        });

        console.log("pageView" + e_id);
    };
    

}]);






atmController.controller('ProfileController', ['$scope', '$http', '$kookies', function($scope, $http, $kookies){

    $scope.selection = function(val){
        $scope.selectValue = val;
    };

    $http({method: 'GET', url: ipAddress + '/users/getUserById', params:{u_id: 1}})
        .success(function(data){
            $scope.user = data[0];
        },function(error){
            $scope.error = error;
        });


    $http({method: 'GET', url: ipAddress + '/newest/getNewest', params:{start: 0, count: 10}})
        .success(function(data){
            $scope.newest = data;
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });

    $http({method: 'GET', url: ipAddress + '/notifications/getNotifications', params:{u_id: $kookies.get('u_id')}})
        .success(function(data){
            $scope.notifications = data;
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });



    // Form submit.
    $scope.feedback = {
        u_id: $kookies.get('u_id'),
        f_msg: ''
    };

    $scope.feedback_submit = function(){

        var req = {
            method: 'POST',
            url: ipAddress + '/feedback/add',
            headers: {
                'Content-Type': 'application/json'
            },
            data: JSON.stringify($scope.feedback)
        };

        $http(req).success(function(result){
            if(result.length > 0) {
                alert('反馈成功');
            }else {
                alert('反馈失败');
            }
        }, function(error){
            console.log(error);
        });
    };



}]);


atmController.controller('ProfileHController', ['$scope', '$http', function($scope, $http){
    

}]);


atmController.controller('ProfileIController', ['$scope', '$http', function($scope, $http){


}]);


atmController.controller('ProfileMsgController', ['$scope', '$http', '$kookies', function($scope, $http, $kookies){

    $http({method: 'GET', url: ipAddress + '/notifications/getNotifications', params:{u_id: $kookies.get('u_id')}})
        .success(function(data){
            $scope.notifications = data;
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });

}]);


atmController.controller('ProfileFdController', ['$scope', '$http', '$kookies', function($scope, $http, $kookies){

    // Form submit.
    $scope.feedback = {
        u_id: $kookies.get('u_id'),
        f_msg: ''
    };

    $scope.submit = function(){

        var req = {
            method: 'POST',
            url: ipAddress + '/feedback/add',
            headers: {
                'Content-Type': 'application/json'
            },
            data: JSON.stringify($scope.feedback)
        };

        $http(req).success(function(result){
            if(result.length > 0) {
                alert('反馈成功');
            }else {
                alert('反馈失败');
            }
        }, function(error){
            console.log(error);
        });
    };
    
}]);


atmController.controller('EventDController', ['$scope', '$http', '$routeParams', '$sce', function($scope, $http, $routeParams, $sce){

    $http({method: 'GET', url: ipAddress + '/events/getEventByEId', params:{e_id:$routeParams.e_id }})
        .success(function(data){
            $scope.event = data[0];
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });


    $http({method: 'GET', url: ipAddress + '/comments/getComments', params:{s_id: $routeParams.e_id, c_type: 1}})
        .success(function(data){
            // console.log(data);
            $scope.comments = data;
            $scope.commentNum = data.length;
        },function(error){
            $scope.error = error;
        });

    $scope.renderHtml = function(value) {
        return $sce.trustAsHtml(value);
    };



    $scope.submit = function(){

        var replayData = {
            s_id: $scope.event.e_id,
            u_id: 1,
            c_type: 1, // c_type = 1  event comments
            c_comment: CKEDITOR.instances.editor1.getData()
        };

        var req = {
            method: 'POST',
            url: ipAddress + '/comments/add',
            headers: {
                'Content-Type': 'application/json'
            },
            data: JSON.stringify(replayData)
        };

        console.log("Event comments replied : " + JSON.stringify(replayData));

        $http(req).success(function(result){
            $http({method: 'GET', url: ipAddress + '/comments/getComments', params:{s_id: $routeParams.e_id, c_type: 1}})
                .success(function(data){
                    console.log(data);
                    CKEDITOR.instances.editor1.setData('');
                    $scope.comments = data;
                    $scope.commentNum = data.length;
                },function(error){
                    $scope.error = error;
                });
        }, function(error){
            console.log(error);
        });
    };






}]);



