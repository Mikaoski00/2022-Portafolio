package Java.Array_y_numeros_pares;

public class lista_par_while_break {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] c = new int[31];
        int k = 0;
        while (true) {
            c[k] = k;
            k++;
            if (k == c.length) {
                break;
            }
        }
        k = 0;
        while (true) {
            if (c[k] % 2 == 0) {
                System.out.print(c[k]);
                System.out.print(" ");
            }
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
