'use strict';

angular.module('RestDemoApp').controller('UserController',
		[ 'UserService', '$scope', function(UserService, $scope) {
			function getAllUsers() {
				$scope.user = UserService.loadAllUsers();
				//return UserService.loadAllUsers();
			}
		} ]);