'use strict';

angular.module('myApp.company', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/companies', {
    templateUrl: 'company_view/companies.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', [function() {

}]);