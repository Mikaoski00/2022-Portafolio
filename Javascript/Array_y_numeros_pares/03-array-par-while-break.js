/*Inicio del codigo*/
//Declarando el array
let c = new Array();
//Declarando e inicializando variable "k" que ayuda a recorrer todas las posiciones del array
let k = 0;
//Rellenando la Array
while (true) {
  c[k] = k;
  k++;
  //Si la variable "k" es igual o llega a 31, se rompe el ciclo "while" y reinicia la variable "k" a 0
  if (k == 31) {
    k = 0;
    break;
  }
}
//Recorriendo la array
while (true) {
  //Si en una posición de una array almacena un numero par, este lo imprime
  if (c[k] % 2 == 0) {
    console.log(c[k]);
  }
  //Luego se incrementa el valor de la variable "k"
  k++;
  //Si el valor de la variable "k" tiene el valor 31, se rompe el ciclo "while"
  if (k == 31) {
    break;
  }
}
/*Fin del codigo*/