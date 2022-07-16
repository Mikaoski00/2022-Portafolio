/*Inicio del codigo*/
//Declarando el array
let b = new Array();
//Declarando e inicializando variable "j" que ayuda a recorrer todas las posiciones del array
let j = 0;
//Rellenando la Array
while (j < 31) {
  b[j] = j;
  j++;
}
//Reinicio de la variable "j" en 0
j = 0;
//Recorre el array e imprime solo las posiciones que tenga numeros pares
while (j < 31) {
  if (b[j] % 2 === 0) {
    console.log(b[j]);
  }
  j++;
}
/*Fin del codigo*/