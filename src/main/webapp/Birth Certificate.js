var app = angular.module("BirthCertificate", []);

app.controller("MainCtrl", ["$log","$http","$scope", 
   function($log,$http,$scope)
   {
	
	$log.log('This is log 1.');
	
	$scope.Submit = function()
	  {	
	    $log.log('This is log 2.');
	    
	    var parameter = JSON.stringify({
			"name" :$scope.name,
			"date" :$scope.date,
			"sex" :$scope.sex,
			"fathersName" : $scope.fathersName,
			"fatherAadhaarNumber" : $scope.fatherAadhaarNumber,
			"mothersName" : $scope.mothersName,
			"country" : $scope.country,
			"state" : $scope.state,
			"district"  : $scope.district,
			"tehsil" : $scope.tehsil,
			"placeOfBirth" : $scope.placeOfBirth
		});
	    
	    $log.log('This is log 4.');
	    $log.log(parameter);
	   
		$http.post("http://localhost:8080/e-Tehsil/webapp/register/newborn", parameter,
					{
            			headers: { 'Content-Type': 'application/json' }
					}).then(function mySucces(response) 
							{
								$log.log("We are Successful");
								$log.log(response);
								$log.log(response.data);
								$scope.myWelcome = response.data;
							}, 
							
							function myError(response) 
							{
								$log.log("Ohh no!");
								$scope.myWelcome = response.statusText;
							});
	  	}
	
   }]);
                            