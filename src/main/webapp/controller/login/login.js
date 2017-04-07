angular.module('MainApp')
	.controller('LoginCtrl', function($scope, $http, $log, $location) {	
		$scope.SignIn = function(){
			$scope.User.push({
				mobile : $scope.UserMobile,
				password : $scope.UserPassword });
		
			var obj = JSON.stringify($scope.User2);
			$http.post("uri", obj, 
				{headers: { 'Content-Type': 'application/json' } }).
					then(function mySucces(response) {
						$log.log("We are Successful");
						$log.log(response);
						$log.log(response.data);
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					$scope.myWelcome = response.statusText;
				});
	};
	
	
	
});
