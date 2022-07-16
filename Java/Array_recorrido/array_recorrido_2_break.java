/*Inicio del codigo*/
package Java.Array_recorrido;

public class array_recorrido_2_break {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] c = new int[31];
        int k = 0;
        while (true) {
            c[k] = k;
            k++;
            if (k == c.length) {
                k = 0;
                break;
            }
        }
        while (true) {
            System.out.print(c[k]);
            System.out.print(" ");
            k++;
            if (k == c.length) {
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Duracion: " + ((endTime - startTime) / 1e6) + "ms");
    }
}
/*Fin del codigo*/