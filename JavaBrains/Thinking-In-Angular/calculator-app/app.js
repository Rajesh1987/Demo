var module = angular.module("ngCalculatorModule", [] );

module.controller("calculatorCtrl", calculatorCtrl);

    function calculatorCtrl() {
        this.outputValue = 0;
        this.buttonClicked = function(buttonClicked) {
            this.operatorSelected = buttonClicked;
    }

    this.performCalculation = function() {
            var number1 = parseFloat(this.input1);
            var number2 = parseFloat(this.input2);

            if(this.operatorSelected === '+') {
                this.outputValue = number1 + number2;
            }
            else if(this.operatorSelected === '-') {
                this.outputValue = number1 - number2;
            }
            else if(this.operatorSelected === '*') {
                this.outputValue = number1 * number2;
            }
            else if(this.operatorSelected === '/') {
                this.outputValue = number1 / number2;
            }
    }
}
