angular.module('MainApp')
	.controller('SignUpCtrl', function($scope, $http, $log, $location, $cookies, $cookieStore) {
		$scope.SignUp = function(){
			$scope.User={};
			$scope.User={
					aadhaarNumber :$scope.UserAadhaarNumber,
					mobile : $scope.UserMobile,
					emailId : $scope.UserEmailId,
					password : $scope.UserPassword };
		
			$log.log($scope.User);
			var obj = JSON.stringify($scope.User);
			$http.post("http://localhost:8080/e-Tehsil/webapp/User/SignUp", obj, 
				{	headers: { 'Content-Type': 'application/json' } }).
					then(function mySucces(response) {
					    $log.log("We are Successful");
						$log.log(response);
						$log.log(response.data);
						$log.log(response.data.status);
						if(response.data.status == 1){
							$cookies.put("LoginId", $scope.User.aadhaarNumber);
							window.location="/e-Tehsil/Home.html";
						}
						else{
							$log.log("can't register now! databse problem.");
							window.location="/e-Tehsil/index.html";
						}
					}, 
					
					function myError(response) {
						$log.log("Ohh no!");
					}); 
			};
	});
