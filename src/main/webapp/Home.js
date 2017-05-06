angular.module('HomeApp', ['ngRoute', 'ngCookies', 'ngMessages'])
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
			.when('/BirthCertificate', {
				templateUrl : "HtmlFile/BirthCertificate.html",
				controller : "BirthCertificate"
				
			})
			.when('/DeathCertificate', {
				templateUrl : "HtmlFile/DeathCertificate.html"
				
			})
			.when('/CasteCertificate', {
				templateUrl : "HtmlFile/CasteCertificate.html",
				controller : "CasteCertificate"
			})
			.when('/DomicileCertificate', {
				templateUrl : "HtmlFile/DomicileCertificate.html",
				controller : "DomicileCertificate"
				
			})
			.when('/OldAgePension', {
				templateUrl : "HtmlFile/OldAgePension.html",
				controller : "OldAgeCertificate"
			})
			.when('/User', {
				templateUrl : "HtmlFile/Profile.html",
				controller : "Profile"
			})
			.when('/About', {
				templateUrl : "HtmlFile/About.html",
				controller : "FormsCtrl"
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