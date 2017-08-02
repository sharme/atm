'use strict';

// Declare app level module which depends on views, and components
var atm = angular.module('atm', [
  'ngRoute',
  'atmController',
  'angularCSS',
  'ngCookies',
  'ngKookies'  
]).value("THROTTLE_MILLISECONDS", 3000);



atm.config(function($routeProvider, $cssProvider) {
  
  angular.extend($cssProvider.defaults, {
    breakpoints: {
      mobile: '(max-width: 550px)',
      desktop: '(min-width: 600px)'
    }
  });


  $routeProvider.
  when('/events', {
    templateUrl: 'views/event/events.html',
    controller: 'EventController',
    css: [
      {
        href: 'css/event/event.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/event/event.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/events/:e_id', {
    templateUrl: 'views/event/event_detail.html',
    controller: 'EventDController',
    css: [
      {
        href: 'css/event/event_d.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/event/event_d.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/promotions', {
    templateUrl: 'views/promotion/promotions.html',
    // controller: 'EventController',
    css: [
      {
        href: 'css/promotion/promotion.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/promotion/promotion.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/index', {
    templateUrl: 'views/home/home.html',
    // controller: 'EventController',
    css: [
      {
        href: 'css/home/home.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/home/home.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/profile', {
    templateUrl: 'views/profile/profile.html',
    controller: 'ProfileController',
    css: [
      {
        href: 'css/profile/p_default.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/profile/p_default.css',
        breakpoint: 'desktop'
      }
    ]
  }).
  when('/login', {
    templateUrl: 'views/account/login.html',
    controller: 'ProfileController',
    css: [
      {
        href: 'css/profile/p_default.css',
        breakpoint: 'desktop'
      },
      {
        href: 'css/profile/p_default.css',
        breakpoint: 'desktop'
      }
    ]
  });
  
});
