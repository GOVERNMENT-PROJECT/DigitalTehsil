angular.module('HomeApp')
	.controller('HomeCtrl', function($scope, $cookies) {
		$cookies.put("name", "ashish prasad ranjan");
		$scope.id = "ashish";
		$scope.id = $cookies.get("name");
	});
