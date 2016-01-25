//function Projects($scope, $http) {
//    alert('test');
//    $http.get('http://localhost:8080/projects/serious').
//        success(function(data) {
//            $scope.project = data;
//        });
//}

//function Projects($scope, $resource){
//  var Project = $resource('projects/serious');
//  var prj = Project.get(function() {
//      prj.$save();
//  });
//}

angular.module('testlair', [])
    .controller('Projects', function($scope, $http) {
            alert('test');
            $http.get('/projects/serious').
                success(function(data) {
                    $scope.project = data;
                });
    });