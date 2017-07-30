'use strict';

// Declare app level module which depends on views, and components
var atm = angular.module('atm', [
  'ngRoute',
  'angularCSS'  
]).value("THROTTLE_MILLISECONDS", 3000);



atm.config(function($routeProvider, $cssProvider) {
  
  angular.extend($cssProvider.defaults, {
    breakpoints: {
      mobile: '(max-width: 550px)',
      desktop: '(min-width: 600px)'
    }
  });


  $routeProvider.
  when('/companies', {
    templateUrl: 'public/views/company/companies.html',
    controller: 'CompanyController',
    css: [
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      },
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/events', {
    templateUrl: 'public/views/event/events.html',
    controller: 'CompanyController',
    css: [
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      },
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/exhibitors', {
    templateUrl: 'public/views/exhibitor/exhibitors.html',
    controller: 'CompanyController',
    css: [
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      },
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/designers', {
    templateUrl: 'public/views/designer/designers.html',
    controller: 'CompanyController',
    css: [
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      },
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/personal', {
    templateUrl: 'public/views/personal/personal.html',
    controller: 'CompanyController',
    css: [
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      },
      {
        href: 'public/css/company/company.css',
        breakpoint: 'desktop'
      }
    ]
  });
  
});
