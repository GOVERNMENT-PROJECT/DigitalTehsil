angular.module('HomeApp')
	.controller('FormsCtrl', function($scope, $cookies) {
		$cookies.put("name", "ashish prasad ranjan");
		$scope.id = "ashish";
		$scope.id = $cookies.get("LoginId");
	});
