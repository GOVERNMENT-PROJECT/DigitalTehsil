var MainApp = angular.module('MainApp',['ngRoute']);

MainApp.config(['$routeProvider', function($routeProvider) {
	  $routeProvider.when('/login', {
	    templateUrl: 'login.html',
	    controller: 'LoginCtrl'
	  });
	  $routeProvider.when('/main', {
	    templateUrl: 'html/random.html',
	    controller: 'mainCtrl'
	  });
	  $routeProvider.otherwise({ redirectTo: '/login.html' });
	}]);