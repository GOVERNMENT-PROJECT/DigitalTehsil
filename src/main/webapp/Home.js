angular.module('HomeApp', ['ngRoute', 'ngCookies'])
	.config(function($routeProvider){
		$routeProvider
			.when('/Forms', {
				templateUrl : "HtmlFile/Forms/Forms.html",
				controller : "FormsCtrl"
			})
			.when('/RationCard', {
				templateUrl : "HtmlFile/RationCard.html",
				controller : "RationCardCtrl"
			})
			.when('/Result', {
				templateUrl : "HtmlFile/Success.html"
				
			})
			.when('/logout', {
				template : " ",
				controller : "LogoutCtrl"
			})
			.otherwise({
				redirectTo : '/Forms'
			});
		//$locationProvider.html5Mode(true);
	});