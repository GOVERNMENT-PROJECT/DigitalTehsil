angular.module('HomeApp')
	.controller('OldAgeCertificate', function ($scope,$http,$log, $cookies) {
		$scope.user={};
	  $scope.apply = function() {
		  var obj = JSON.stringify($scope.user);
	    $http.get("http://localhost:8080/e-Tehsil/webapp/register/domicilecertificate/"+$cookies.get("LoginId"), obj,
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
					$log.log("We are Successful");
					$log.log(response);
					$log.log(response.data);
					$scope.myWelcome = response.data;
					alert("Successfully applied for old age pension certificate.");
					window.location="/e-Tehsil/Home.html#/Forms";
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					alert("something went wrong. Re-apply for old age pension certificate. ");
					$scope.myWelcome = response.statusText;
					window.location="/e-Tehsil/Home.html#/OldAgePension";
				}); 
	    };

});