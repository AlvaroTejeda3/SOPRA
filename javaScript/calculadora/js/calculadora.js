function Calculadora(){
    this._display = 0;
}

Calculadora.prototype.sumar = function(valor){
    this._display += valor
}
Calculadora.prototype.restar = function(valor){
    this._display -= valor
}
Calculadora.prototype.multiplicar = function(valor){
    this._display *= valor
}
Calculadora.prototype.dividir = function(valor){
    this._display /= valor
}
Calculadora.prototype.reset = function(valor){
    this._display=0
}

