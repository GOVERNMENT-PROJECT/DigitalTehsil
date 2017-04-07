angular.module('MainApp')
	.controller('LoginCtrl',
 function($scope, $http, $log, $location) {
	/*	
	$scope.SignIn = function(){
		$scope.User2.push({
			mobile : $scope.UserMobile,
			password : $scope.UserPassword});
		
		var obj2 = JSON.stringify($scope.User2);
		
		
	    $http.post("uri", obj2, 
	      {	headers: { 'Content-Type': 'application/json' } }).
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
	
	*/
	$scope.SignUp = function(){
		$scope.User={};
		$scope.User={
			aadhaarNumber :$scope.UserAadhaarNumber,
			mobile : $scope.UserMobile,
			emailId : $scope.UserEmailId,
			password : $scope.UserPassword};
		
		$log.log($scope.User);
		var obj = JSON.stringify($scope.User);
	    $http.post("http://localhost:8080/e-Tehsil/webapp/User/SignUp", obj, 
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
					    $log.log("We are Successful");
							$log.log(response);
							$log.log(response.data);
							$scope.myWelcome = response.data;
							window.location="/e-Tehsil/Main.html";
							$log.log("new page reached");
						}, 
								
						function myError(response) {
						  $log.log("Ohh no!");
						  $scope.myWelcome = response.statusText;
						}); 
	};
	
	
});
