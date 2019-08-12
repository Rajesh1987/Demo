var module = angular.module("nestedControllers", [] );

module.controller("Ctrl1", Ctrl1);
module.controller("Ctrl2", Ctrl2);

function Ctrl1() {
    // var this = $scope -- assumes angular this does by default
    this.testProp = "from controller 1";
}

function Ctrl2() {
    this.testProp = "from controller 2";
}
