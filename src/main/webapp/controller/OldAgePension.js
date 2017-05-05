angular.module('HomeApp')
	.controller('OldAgeCertificate', function ($scope,$http,$log, $cookies) {
		$scope.user={};
	  $scope.apply = function() {
		  var obj = JSON.stringify($scope.user);
	    $http.post("http://localhost:8080/e-Tehsil/webapp/apply/oldpensionform/"+$cookies.get("LoginId"), obj,
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