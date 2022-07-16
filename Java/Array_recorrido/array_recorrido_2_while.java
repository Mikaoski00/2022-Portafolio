/*Inicio del codigo*/
package Java.Array_recorrido;

public class array_recorrido_2_while {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] b = new int[31];
        int j = 0;
        while (j < b.length) {
            b[j] = j;
            j++;
        }
        j = 0;
        while (j < b.length) {
            System.out.print(b[j]);
            System.out.print(" ");
            j++;
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Duracion: " + ((endTime - startTime) / 1e6) + "ms");
    }
}
/*Fin del codigo*/