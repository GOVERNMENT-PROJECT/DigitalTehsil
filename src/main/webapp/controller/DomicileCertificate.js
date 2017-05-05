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
					window.location="/e-Tehsil/HtmlFile/Success.html";
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					$scope.myWelcome = response.statusText;
				}); 
	    };

});