/*Inicio del codigo*/
package Java.Array_recorrido;

public class array_recorrido_1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] a = new int[31];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]);
            System.out.print(" ");
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Duracion: " + ((endTime - startTime) / 1e6) + "ms");
    }
}
/*Fin del codigo*/