'use strict';

angular.module('RestDemoApp').factory('UserService',
		[ '$http', '$q', 'urls', function($http, $q, urls) {
			function loadAllUsers() {
				console.log('Fetching all users');
				var deferred = $q.defer();
				$http.get(urls.USER_SERVICE_API + "/home" + "/Abhinav").then(function(response) {
					console.log('Fetched successfully all users');
					deferred.resolve(response);
				}, function(errResponse) {
					console.error('Error while loading users');
					deferred.reject(errResponse);
				});
				return deferred.promise;
			}

		} ]);