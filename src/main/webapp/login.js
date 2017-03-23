
MainApp.controller('LoginCtrl',["$scope", "$http", "$log", 
  function ($scope,$http,$log) {
	
	$scope.User=[];
	
	$scope.SignIn = function(){
		$scope.User.push({
			mobile : $scope.UserMobile,
			password : $scope.UserPassword});
		
		var obj = JSON.stringify(User);
	    $http.post("uri", obj, 
	      {	headers: { 'Content-Type': 'application/json' } }).
	          then(function mySucces(response) {
	        	  $log.log("We are Successful");
				  $log.log(response);
				  $log.log(response.data);
				  $scope.myWelcome = response.data;
				}, 
				function myError(response) {
					$log.log("Ohh no!");
					$scope.myWelcome = response.statusText;
				});
	    $scope.User=[];
	};
}]);
