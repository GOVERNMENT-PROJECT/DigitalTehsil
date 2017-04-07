angular.module('MainApp')
	.controller('SignUpCtrl',
 function($scope, $http, $log, $location) {
	$scope.SignUp = function(){
		$scope.User={};
		$scope.User={
			aadhaarNumber :$scope.UserAadhaarNumber,
			mobile : $scope.UserMobile,
			emailId : $scope.UserEmailId,
			password : $scope.UserPassword };
		
		$log.log($scope.User);
		var obj = JSON.stringify($scope.User);
	    $http.post("http://localhost:8080/e-Tehsil/webapp/User/SignUp", obj, 
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
	        	  $log.log("We are Successful");
	        	  $log.log(response);
	        	  $log.log(response.data);
	        	  $scope.myWelcome = response.data;
	        	  $location.path("/xyz" );
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					$scope.myWelcome = response.statusText;
				}); 
	};
	
	
});
