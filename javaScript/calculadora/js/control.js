var calculadora = new Calculadora()
var ultimaOperacion = ""
function agregaADisplay(numero){
    var txtDisplay = document.getElementById("display");
    txtDisplay.value += numero ; // 0 + 7 -> 07
}
function sumar(){
    ultimaOperacion = "+"
    var txtDisplay = document.getElementById("display");
    calculadora.sumar(new Number(txtDisplay.value))
    txtDisplay.value = ""
}
function restar(){
    ultimaOperacion = "-"
    var txtDisplay = document.getElementById("display");
    calculadora.restar(new Number(txtDisplay.value))
    txtDisplay.value = ""
}
function multiplicar(){
    ultimaOperacion = "*"
    var txtDisplay = document.getElementById("display");
    calculadora.multiplicar = 

}

function mostrar(){
    var txtDisplay = document.getElementById("display");
    if(ultimaOperacion == "+"){
        calculadora.sumar(new Number(txtDisplay.value))
    }
    txtDisplay.value = calculadora._display
}
