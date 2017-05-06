angular.module('AdminHomeApp', ['ngRoute', 'ngCookies', 'ngMessages'])
	.config(function($routeProvider){
		$routeProvider
			.when('/Forms', {
				templateUrl : "HtmlFile/Forms/Forms.html",
			})
			.when('/RationCard', {
				templateUrl : "Admin/Html/RationCard.html",
				controller : "RationCardCtrl"
			})
			.when('/BirthCertificate', {
				templateUrl : "Admin/Html/BirthCertificate.html",
				controller : "BirthCertificate"
			})
			.when('/CasteCertificate', {
				templateUrl : "Admin/Html/CasteCertificate.html",
					controller : "CasteCertificate"
			})
			.when('/OldAgePension', {
				templateUrl : "Admin/Html/OldAgePension.html",
				controller : "OldAgePension"
			})
			.when('/DomicileCertificate', {
				templateUrl : "Admin/Html/DomicileCertificate.html",
				controller : "DomicileCertificate"
			})
			.when('/logout', {
				template : " ",
				controller : "LogoutCtrl"
			})
			.when('/About', {
				templateUrl : "HtmlFile/About.html"
			})
			.when('/User', {
				templateUrl : "Admin/Html/Profile.html",
				controller : "Profile"
			})
			.otherwise({
				redirectTo : '/Forms'
			});
		//$locationProvider.html5Mode(true);
	});