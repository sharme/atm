'use strict';

var atmController = angular.module('atm');

var ipAddress = 'http://180.76.152.112:8000';

atmController.controller('CompanyController', ['$scope', '$http', function($scope, $http){
    
    console.log("this is index controller.");

    $http({method: 'GET', url: ipAddress + '/atm/getCompanies', params:{start: 0, count: 3, secret: "ed4c4e0b2b525c24"}})
        .success(function(data){
            $scope.companies = data;
            // displayPosition(500,20);
        },function(error){
            $scope.error = error;
        });

}]);



