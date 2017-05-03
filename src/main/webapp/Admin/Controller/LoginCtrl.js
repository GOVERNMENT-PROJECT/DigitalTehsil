angular.module('AdminApp')
	.controller('LoginCtrl', function($scope, $http, $log, $location, $cookies) {	
		$scope.Login = function(){
			$scope.Admin={};
			$scope.Admin={
				emailId :$scope.EmailId,
				password : $scope.Password };
		
			var obj = JSON.stringify($scope.Admin);
			$scope.$on('LOAD',function(){$scope.loading=true});
			$http.post("http://localhost:8080/e-Tehsil/webapp/Admin/Login", obj, 
				{headers: { 'Content-Type': 'application/json' } }).
					then(function mySucces(response) {
						$log.log("Successfully logged in!");
						$log.log(response);
						$log.log(response.data);
						if(response.data.status == 1){
							$cookies.put("LoginId", $scope.Admin.emailId);
							window.location="e-Tehsil/AdminHome.html";
							$scope.$on('UNLOAD',function(){$scope.loading=false});
						}
						else{
							$log.log("can't login now! databse problem.");
							window.location="e-Tehsil/Admin.html";
						}
					}, 
					function myError(response) {
						$log.log("Ohh no!");
					});
			};
	});
