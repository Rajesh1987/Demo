var customApp = angular.module("myCustomApp",[]);

customApp.controller("HelloCtrl", helloCtrl);

function helloCtrl() {
    this.helloMessage = "I am from the main module";
}
