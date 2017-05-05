angular.module('HomeApp')
	.controller('BirthCertificate', function ($scope,$http,$log, $cookies) {
		$scope.user={};
	  $scope.apply = function() {
		  var obj = JSON.stringify($scope.user);
	    $http.post("http://localhost:8080/e-Tehsil/webapp/apply/newborn/"+$cookies.get("LoginId"), obj,
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
					$log.log("We are Successful");
					$log.log(obj);
					$log.log(response);
					$log.log(response.data);
					$scope.myWelcome = response.data;
					alert("Successfully applied for birth certificate.");
					window.location="/e-Tehsil/Home.html#/Forms";
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					alert("something went wrong. Re-apply for birth certificate. ");
					$scope.myWelcome = response.statusText;
					window.location="/e-Tehsil/Home.html#/BirthCertificate";
				}); 
	    };

});