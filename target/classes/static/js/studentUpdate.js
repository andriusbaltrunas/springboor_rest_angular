/**
 * Created by andriusbaltrunas on 7/13/2018.
 */

var app = angular.module("studentUpdateApp", []);

app.controller("studentUpdateController",function($scope, $http){
    $scope.alertType = "";
    $scope.alertMessage = "";

    $scope.update = function(){
        var data = {id : $("#id").val(),
            name: $("#name").val(),
            surname: $("#surname").val(),
            phone : $("#phone").val(),
            email : $("#email").val()};
        $http({
            url :"/update",
            method: "PUT",
            data: data
        }).then(function(response){
            $scope.alertType = "alert-success";
            $scope.alertMessage = "Student update successfully";
        }, function(response){
            $scope.alertType = "alert-danger";
            $scope.alertMessage = "Student do not updated!!!";
        });
    }
});