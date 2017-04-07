angular.module('MainApp', ['ngRoute'])
	.config(function($routeProvider){
		$routeProvider
			.when('/signup', {
				templateUrl : "HtmlFile/signup/signup.html",
				controller : "SignUpCtrl"
			})
			.when('/login', {
				templateUrl : "HtmlFile/login/login.html",
				controller : "LoginCtrl"
			})
			.otherwise({
				redirectTo : '/signup'
			});
		//$locationProvider.html5Mode(true);
	});