angular.module('HomeApp')
	.controller('LogoutCtrl', function($log, $cookies) {
		$log.log("logout controller is called")
		$cookies.remove("LoginId");
		window.location="/e-Tehsil/index.html#/signup";

	});