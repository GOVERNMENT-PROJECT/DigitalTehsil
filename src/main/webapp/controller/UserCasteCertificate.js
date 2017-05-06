angular.module('AdminHomeApp')
	.controller('CasteCertificate', function ($scope,$http,$log, $cookies) {
		
		$scope.data={};
		$scope.caste;
		$scope.sc=false;
		$scope.st=false;
		$scope.obc=false;
		$scope.general=false;
		 $scope.selectedItemChanged = function(){
			    if($scope.caste=="sc")
			    {
			    	$scope.sc=true;
					$scope.st=false;
					$scope.obc=false;
					$scope.general=false;
			    }
			    if($scope.caste=="st")
		    	{
			    	$scope.sc=false;
					$scope.st=true;
					$scope.obc=false;
					$scope.general=false;
		    	}
			    if($scope.caste=="obc")
		    	{
			    	$scope.sc=false;
					$scope.st=false;
					$scope.obc=true;
					$scope.general=false;
		    	}
			  }
		
	   $scope.apply=function(){
		   
		   	var obj = JSON.stringify($scope.data);
		   	$log.log(obj);
	   		$http.post("http://localhost:8080/e-Tehsil/webapp/Admin/CasteCertificateApproval", obj,
				{ headers: { 'Content-Type': 'application/json' } }).
				   	then(function mySucces(response) {
				      	$log.log("We are Successful");
						$log.log(obj);
						$log.log(response.data);
						$scope.User = response.data;
						window.alert("successfully updated data!");
						window.location="AdminHome.html#/Forms";
					}, 
					function myError(response) {
						$log.log("Ohh no!");
						window.alert("faliure occurs. Please try occurs.");
						window.location="AdminHome.html#/BirthCertificate";
					}); 
	   };
				
});