angular.module('AdminHomeApp', ['ngRoute', 'ngCookies'])
	.config(function($routeProvider){
		$routeProvider
			.when('/Forms', {
				templateUrl : "HtmlFile/Forms/Forms.html",
				//controller : "FormsCtrl"
			})
			.when('/RationCard', {
				templateUrl : "Admin/Html/RationCard.html",
				controller : "RationCardCtrl"
			})
			.when('/BirthCertificate', {
				templateUrl : "HtmlFile/BirthCertificate.html"
				
			})
			.when('/DeathCertificate', {
				templateUrl : "HtmlFile/DeathCertificate.html"
				
			})
			.when('/CasteCertificate', {
				templateUrl : "HtmlFile/CasteCertificate.html"
				
			})
			.when('/DomicileCertificate', {
				templateUrl : "HtmlFile/DomicileCertificate.html"
				
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