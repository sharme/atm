'use strict';

angular.module('myApp.designer', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/designers', {
    templateUrl: 'designer_view/designers.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', [function() {

}]);