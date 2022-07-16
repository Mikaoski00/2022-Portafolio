/*Inicio del codigo*/
//Declarando la array
let a = new Array();
//Rellenando el array
for (let i = 0; i < 31; i++) {
  a[i] = i;
}
// console.log(a);
//Recorriendo el array en busca de numeros pares y los imprime por consola
for (let x = 0; x < 31; x++) {
  if (a[x] % 2 === 0) {
    console.log(a[x]);
  }
}
/*Fin del codigo*/