/**
 * Created by andriusbaltrunas on 7/13/2018.
 */

    var studentApp = angular.module("studentApp", []);

    studentApp.controller("studentController", function($scope, $http){
        $scope.alertType = "";
        $scope.alertMessage = "";
        $http.get("/all").then(function(response){
            $scope.students = response.data;
        });

        $scope.save = function(){
            var data = {name: $scope.name,
                surname: $scope.surname,
                phone : $scope.phone,
                email : $scope.email};
            $http({
                url :"/save",
                method: "POST",
                data: data
            }).then(function(response){
                $scope.alertType = "alert-success";
                $scope.alertMessage = "Student saved successfully";
            }, function(response){
                $scope.alertType = "alert-danger";
                $scope.alertMessage = "Student do not saved!!!";
            });
        }
    });
