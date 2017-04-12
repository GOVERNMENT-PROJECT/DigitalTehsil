angular.module('HomeApp')
	.controller('RationCardCtrl', function ($scope,$http,$log) {
		$scope.todos = [];
		 // {aadhaarNo:'123456789123', realationWithHead:"son", done:false},
	     // {aadhaarNo:'321654987321', realationWithHead:"father", done:false }];
	    
		//$scope.todoRelation = 'son';
	  
		$scope.addTodo = function() {
	     if($scope.todoAadhar.length==12 && $scope.todoRelation!=='' ){
	      $scope.todos.push({aadhaarNo:$scope.todoAadhar, realationWithHead:$scope.todoRelation, done:false});
	      $scope.todoAadhar = '';
	      //$scope.todoRelation = 'son';
	    }
	    else
	    {
	      $scope.ErrorMessage ="invalid data! please enter correctly."
	    }
	  };
	
	  $scope.remaining = function() {
	    var count = 0;
	    angular.forEach($scope.todos, function(todo) {
	      count += todo.done ? 0 : 1;
	    });
	    return count;
	  };
	
	  $scope.archive = function() {
	    var oldTodos = $scope.todos;
	    $scope.todos = [];
	    angular.forEach(oldTodos, function(todo) {
	      if (!todo.done) $scope.todos.push(todo);
	    });
	  };
	  
	  $scope.save = function() {
	    var obj = JSON.stringify($scope.todos);
	    $http.post("http://localhost:8080/e-Tehsil/webapp/register/rationcard/"+$cookies.get("LoginId"), obj, 
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
	    };

});