angular.module('MainApp')
	.controller('LoginCtrl', function($scope, $http, $log, $location, $cookies) {	
		$scope.Login = function(){
			$scope.User={};
			$scope.User={
				aadhaarNumber :$scope.UserAadhaarNumber,
				password : $scope.UserPassword };
		
			var obj = JSON.stringify($scope.User);
			$http.post("http://localhost:8080/e-Tehsil/webapp/User/Login", obj, 
				{headers: { 'Content-Type': 'application/json' } }).
					then(function mySucces(response) {
						$log.log("Successfully logged in!");
						$log.log(response);
						$log.log(response.data);
						if(response.data.status == 1){
							$cookies.put("LoginId", $scope.User.aadhaarNumber);
							window.location="/e-Tehsil/Home.html";
						}
						else{
							$log.log("can't login now! databse problem.");
							alert("Login Failed!." +
									" Either Aadhaar Number/Email-id or Password is wrong.")
							window.location="/e-Tehsil/index.html";
						}
					}, 
					function myError(response) {
						alert("Server can't be loaded. Please check your network connection.")
						$log.log("Ohh no!");
					});
			};
	});
