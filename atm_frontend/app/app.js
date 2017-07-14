'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'myApp.view1',
  'myApp.view2',
  'myApp.company',
  'myApp.designer',
  'myApp.personal' ,
  'myApp.account'  
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {

  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/index'});
}]);
