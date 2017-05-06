angular.module('HomeApp')
	.controller('CasteCertificate', function ($scope,$http,$log, $cookies) {
		
		$scope.data={};
		$scope.caste="sc";
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
	   		$http.post("http://localhost:8080/e-Tehsil/webapp/apply/castecertificate/"+$cookies.get("LoginId"), obj,
				{ headers: { 'Content-Type': 'application/json' } }).
				   	then(function mySucces(response) {
				      	$log.log("We are Successful");
						$log.log(obj);
						$log.log(response.data);
						$scope.User = response.data;
						window.alert("successfully applied for caste certificate!");
						window.location="/e-Tehsil/Home.html#/Forms";
					}, 
					function myError(response) {
						$log.log("Ohh no!");
						window.alert("faliure occurs. Please try occurs.");
						window.location="/e-Tehsil/Home.html#/CasteCertificate";
					}); 
	   };
				
});