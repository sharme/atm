'use strict';

angular.module('myApp.personal', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/personal', {
    templateUrl: 'personal_view/personal.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', [function() {

}]);