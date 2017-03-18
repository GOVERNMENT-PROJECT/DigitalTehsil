var app = angular.module("BirthCertificate", []);

app.controller("MainCtrl", ["$log","$http","$scope", 
   function($log,$http,$scope)
   {
	$log.log('This is log 1.');

	var obj=
	{
		"Name" :$scope.Name,
		"Date" :$scope.Date,
		"Sex" :$scope.Sex,
		"FathersName" : $scope.FathersName,
		"FatherAadhaarNumber" : $scope.FatherAadhaarNumber,
		"MothersName" : $scope.MothersName,
		"Country" : $scope.Country,
		"State" : $scope.State,
		"District"  : $scope.District,
		"Tehsil" : $scope.Tehsil,
		"PlaceOfBirth" : $scope.PlaceOfBirth
	};
	
	$scope.Submit = function()
	  {		
	    $log.log('This is log 2.');
	    //$log.log(obj);
	    $log.log($scope.name);
	    $log.log('This is log 3.');
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
	    
	   /* $http({
	        url: "http://localhost:8080/e-Tehsil/webapp/register/newborn",
	        method: "POST",
	        headers: { "Content-Type": "application/json" },
	        obj
	    });*/
	    
		$http.post("http://localhost:8080/e-Tehsil/webapp/register/newborn",parameter,{
            headers: {
                'Content-Type': 'application/json'
            }
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
        
        
        /*success(
			function(response)
			{
				  $log.log(response.data);
				  $log.log(response);
				  $log.log('This is log 5.');
		      });
		      */
	  }
	
   }]);
                            