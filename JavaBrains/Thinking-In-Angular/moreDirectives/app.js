
var module = angular.module("moreDirectives",[]);

module.controller("moreDirectivesCtrl", moreDirectivesCtrl);

function moreDirectivesCtrl() {
    this.myList = [
        { "name": "Rajesh", "age":31 },
        { "name": "Nani", "age":25 },
        { "name": "Chinnu", "age":29 },
        { "name": "Guru", "age":18}
    ];
}

