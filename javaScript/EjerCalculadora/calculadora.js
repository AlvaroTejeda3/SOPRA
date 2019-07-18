function Calculadora(){
    this._display = 0;

}

Calculadora.prototype.sumar = function(valor){
    this._display += valor
}
Calculadora.prototype.restar = function(valor){
    this._display -= valor
}
Calculadora.prototype.getDispaly = function(){
    return this._display
}
Calculadora.prototype.reset = function(){
    this._display = 0
}
Calculadora.prototype.operar = function(operador,valor){
    this._display = eval(this._display +" "+ operador+" "+ valor)
}

var calc = new Calculadora()
calc.sumar(3)
console.log(calc.getDispaly())
calc.operar("-",2)
console.log(calc.getDispaly())