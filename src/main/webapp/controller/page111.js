angular.module("MainApp")
	.controller('page1Ctrl',function($log,$http,$scope) {
		$scope.message = "you got it!";
		$log.log("controller is loaded");
		$scope.search = function(user){
			$log.log("Inside search");
			$http.get("https://api.github.com/users/angular/repos")
				.success(function(response){
					$log.log("success reached home");
					$scope.product = response;
				});
			}
		});