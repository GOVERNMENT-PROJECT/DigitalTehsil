angular.module('AdminHomeApp')
	.controller('RationCardCtrl', function ($scope,$http,$log, $cookies) {

	   $http.get("http://localhost:8080/e-Tehsil/webapp/Admin/RationCardRequest", 
	      {	headers: { 'Content-Type': 'application/json' } }).
	      		then(function mySucces(response) {
	      			$log.log("We are Successful");
					$log.log(response);
					$log.log(response.data);
					$scope.User = response.data;	
				}, 
				function myError(response) {
					$log.log("Ohh no!");
				}); 
				
});