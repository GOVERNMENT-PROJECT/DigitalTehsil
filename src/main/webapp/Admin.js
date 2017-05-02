angular.module('AdminApp', ['ngRoute', 'ngCookies'])
	.config(function($routeProvider){
		$routeProvider
			.when('/login', {
				templateUrl : "Admin/Html/login.html",
				controller : "LoginCtrl"
			})
			.otherwise({
				redirectTo : '/login'
			});
		//$locationProvider.html5Mode(true);
	});