
var module = angular.module("myClock",[]);
module.controller("myClockCtrl", fetchTime);

function fetchTime($scope) {
    var currentDate = new Date();
    $scope.currentTime = currentDate.toTimeString();
    $scope.userName = " ";

    $scope.updateTime = function() {
        var currentDate = new Date();
        $scope.currentTime = currentDate.toTimeString();
    }
}

