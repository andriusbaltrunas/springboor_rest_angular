/**
 * Created by andriusbaltrunas on 7/13/2018.
 */

    var constant = new function(){
    this.SAVE_URL = "/save";
    this.GET_ALL_URL = "/all";
    this.POST_METHOD = "POST";
}
    var studentApp = angular.module("studentApp", []);

    studentApp.controller("studentController", function($scope, $http){
        $scope.alertType = "";
        $scope.alertMessage = "";
        loadStudents($scope, $http);
        $scope.save = function(){
            var data = {name: $scope.name,
                surname: $scope.surname,
                phone : $scope.phone,
                email : $scope.email};
            $http({
                url :constant.SAVE_URL,
                method: constant.POST_METHOD,
                data: data
            }).then(function(response){
                $scope.alertType = "alert-success";
                $scope.alertMessage = "Student saved successfully";
                loadStudents($scope, $http);
            }, function(response){
                $scope.alertType = "alert-danger";
                $scope.alertMessage = "Student do not saved!!!";
            });
        }
    });

function loadStudents($scope, $http){
    $http.get(constant.GET_ALL_URL).then(function(response){
        $scope.students = response.data;
    });
}
