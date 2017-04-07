angular.module('MainApp')
	.factory('UserService', function($resource) {
		return $resource('http://localhost:8080/e-Tehsil/webapp/myresource');
	});