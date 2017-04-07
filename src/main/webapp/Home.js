angular.module('HomeApp', ['ngRoute', 'ngCookies'])
	.config(function($routeProvider){
		$routeProvider
			.when('/Home', {
				templateUrl : "HtmlFile/Home1.html",
				controller : "HomeCtrl"
			})
			.otherwise({
				redirectTo : '/Home'
			});
		//$locationProvider.html5Mode(true);
	});