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
			.otherwise({
				redirectTo : '/Forms'
			});
		//$locationProvider.html5Mode(true);
	});