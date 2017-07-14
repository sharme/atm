/**
 * Created by yao on 7/14/17.
 */

'use strict';

angular.module('myApp.account', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/login', {
            templateUrl: 'account_view/login.html',
            controller: 'View1Ctrl'
        });
    }])

    .controller('View1Ctrl', [function() {
            redirectTo: 'account_view/login';
    }]);
