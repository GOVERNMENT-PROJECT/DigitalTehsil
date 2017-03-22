var showApp = angular.module('showApp',['ngMessages']);

showApp.controller('TodoCtrl',["$scope","$http","$log",
  
  function ($scope,$http,$log) {
  $scope.todos = [
    {aadharNumber:'123456789123', relation:"son", done:false},
    {aadharNumber:'321654987321', relation:"father", done:false}];
    $scope.todoRelation = 'son';
  
  $scope.addTodo = function() {
    if($scope.todoAadhar.length==12 && $scope.todoRelation!=='' ){
      $scope.todos.push({aadharNumber:$scope.todoAadhar, relation:$scope.todoRelation, done:false});
      $scope.todoAadhar = '';
      $scope.todoRelation = 'son';
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
    var obj = JSON.stringify(todos);
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
    };

}]);