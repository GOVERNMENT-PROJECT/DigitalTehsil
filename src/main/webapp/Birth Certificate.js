var app = angular.module("BirthCertificate", []);

app.controller("MainCtrl", ["$log","$http","$scope", 
   function($log,$http,$scope)
   {
	$log.log('This is log 1.');

	var obj=
	{
		Name :$scope.Name,
		Date :$scope.Date,
		Sex :$scope.Sex,
		FathersName : $scope.FathersName,
		FatherAAdhaarNumber : $scope.FatherAAdhaarNumber,
		MothersName : $scope.MothersName,
		Country : $scope.Country,
		State : $scope.State,
		District  : $scope.District,
		Tehsil : $scope.Tehsil,
		PlaceOfBirth : $scope.PlaceOfBirth
	}
	
	$scope.Submit = function()
	  {		
	    $log.log('This is log 2.');
	    $log.log(obj);
		$http.post("http://localhost:8080/e-Tehsil/register/newborn",obj).success(
			function(response)
			{
				  $log.log(response);
				  $scope.product = response;
				  $log.log('This is log 3.');
		      });
	  }
	
   }]);
                            