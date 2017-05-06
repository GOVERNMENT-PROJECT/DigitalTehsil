angular.module('AdminHomeApp')
	.controller('Profile', function ($scope,$http,$log, $cookies) {
    $scope.data={};
    $scope.view=false;
	   $scope.show=function(){
		   $cookies.put("aadhaarNumber", $scope.data.UserAadhaarNumber);
	   		$http.get("http://localhost:8080/e-Tehsil/webapp/User/Profile/"+$cookies.get("aadhaarNumber"),
				{ headers: { 'Content-Type': 'application/json' } }).
				   	then(function mySucces(response) {
				      	$log.log("We are Successful");
						//$log.log(obj);
						$log.log(response.data);
						$scope.User = response.data;
						//window.location="/e-Tehsil/Home.html/User";
						$scope.view=true;
					}, 
					function myError(response) {
						$log.log("Ohh no!");
						window.alert("faliure occurs");
						window.location="AdminHome.html#/Forms";
					}); 
	   }; 
				
});