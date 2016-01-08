function Projects($scope, $http) {
    $http.get('http://127.0.0.1/projects').
        success(function(data) {
            $scope.projects = data;
        });
}