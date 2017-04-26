var app = angular.module('RestDemoApp', [ 'ui.router' ]);

app.constant('urls', {
	BASE : 'http://localhost:8080',
	USER_SERVICE_API : 'http://localhost:8080/api/v1'
});

app.config([
		'$stateProvider',
		'$urlRouterProvider',
		function($stateProvider, $urlRouterProvider) {

			$stateProvider.state('home', {
				url : '/home',
				templateUrl : 'userlist.html'
				controller : 'UserController',
				resolve : {
					users : function($q, UserService) {
						console.log('Load all users');
						var deferred = $q.defer();
						UserService.loadAllUsers().then(deferred.resolve,
								deferred.resolve);
						return deferred.promise;
					}
				}
			});
			$urlRouterProvider.otherwise('/');
		} ]);