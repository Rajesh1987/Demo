var module = angular.module("ngExampleModule", [] );
module.controller("ngExampleCtrl", ngExampleCtrl);

function ngExampleCtrl($scope) {
    $scope.textBoxChange = function() {
        console.log("input text changed");
    }

}