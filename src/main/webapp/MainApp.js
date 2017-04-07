angular.module('MainApp', ['ngRoute'])
	.config(function($routeProvider){
		$routeProvider
			.when('/page1', {
				templateUrl : "HtmlFile/page1.html",
				controller : "page1Ctrl",
			})
			.when('/page2', {
				templateUrl : "HtmlFile/page2.html",
				controller : 'p2'
			})
			.otherwise({
				redirectTo : '/'
			});
	});