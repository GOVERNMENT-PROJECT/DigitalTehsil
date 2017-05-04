angular.module('AdminHomeApp')
	.controller('BirthCertificate', function ($scope,$http,$log, $cookies) {

	   $http.get("http://localhost:8080/e-Tehsil/webapp/Admin/BirthCertificateRequest", 
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
	   
	   $scope.Save=function(){
		   	var obj = JSON.stringify($scope.User);
	   		$http.post("http://localhost:8080/e-Tehsil/webapp/Admin/BirthCertificateApproval", obj,
				{ headers: { 'Content-Type': 'application/json' } }).
				   	then(function mySucces(response) {
				      	$log.log("We are Successful");
						$log.log(obj);
						$log.log(response.data);
						$scope.User = response.data;
						window.alert("success reached!");
						window.location="AdminHome.html#/Forms";
					}, 
					function myError(response) {
						$log.log("Ohh no!");
						window.alert("faliure occurs");
						window.location="AdminHome.html#/BirthCertificate";
					}); 
	   };
				
});