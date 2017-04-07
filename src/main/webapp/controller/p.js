angular.module("MainApp")
	.controller('p2',function($scope, $http, $log) {
		$scope.user = "ashish";
		 $http.get('http://localhost:8080/e-Tehsil/webapp/myresource')
			.success(function(response){
				$log.log("success is my home");
				$scope.user = response;
			});
	});