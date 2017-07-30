'use strict';

var atmController = angular.module('atm');

var ipAddress = 'http://127.0.0.1:3000';

atmController.controller('EventController', ['$scope', '$http', '$cookies', function($scope, $http, $cookies){

    $http({method: 'GET', url: ipAddress + '/events/getEvents', params:{start: 0, count: 5}})
        .success(function(data){
            $scope.events = data;
            // displayPosition(500,20);
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
    // $cookies.put('secret', 'test secret');
    console.log("secret: " + $cookies.get('secret'));
    
    
    

}]);


atmController.controller('ProfileController', ['$scope', '$http', function($scope, $http){

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



}]);


atmController.controller('ProfileHController', ['$scope', '$http', function($scope, $http){
    

}]);


atmController.controller('ProfileIController', ['$scope', '$http', function($scope, $http){


}]);


atmController.controller('ProfileMsgController', ['$scope', '$http', function($scope, $http){


}]);


atmController.controller('ProfileFeedbackController', ['$scope', '$http', function($scope, $http){


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
            console.log(data);
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



