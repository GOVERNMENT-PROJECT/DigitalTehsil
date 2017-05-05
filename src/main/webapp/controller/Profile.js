angular.module('HomeApp')
	.controller('Profile', function ($scope,$http,$log, $cookies) {
	  $scope.User={};
	    $http.get("http://localhost:8080/e-Tehsil/webapp/User/Profile/"+$cookies.get("LoginId"), 
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
					    $log.log("We are Successful");
						$log.log(response);
						$log.log(response.data);
						$scope.User = response.data;
					}, 	
					function myError(response) {
						$log.log("Ohh no!");
						alert("something went wrong.");
						$scope.myWelcome = response.statusText;
						window.location="/e-Tehsil/Home.html#/Forms";
					}); 
});