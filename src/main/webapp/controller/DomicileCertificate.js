angular.module('HomeApp')
	.controller('DomicileCertificate', function ($scope,$http,$log, $cookies) {
		
	  $scope.apply = function() {
	    $http.get("http://localhost:8080/e-Tehsil/webapp/apply/domicilecertificate/"+$cookies.get("LoginId"), 
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
					$log.log("We are Successful");
					$log.log(response);
					$log.log(response.data);
					$scope.myWelcome = response.data;
					alert("Successfully applied for domicile certificate.");
					window.location="/e-Tehsil/Home.html#/Forms";
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					alert("something went wrong. Re-apply for ration card ");
					$scope.myWelcome = response.statusText;
					window.location="/e-Tehsil/Home.html#/DomicileCertificate";
				}); 
	    };

});