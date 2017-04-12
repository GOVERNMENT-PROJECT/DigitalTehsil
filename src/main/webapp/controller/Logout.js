angular.module('HomeApp')
	.controller('LogoutCtrl', function($scope, $cookies) {
		$cookies.remove("LoginId");
		window.location="/e-Tehsil/index.html#/signup";
	});