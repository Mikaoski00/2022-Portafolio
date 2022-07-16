package Java.Array_y_numeros_pares;

public class lista_par_while {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] b = new int[31];
        int j = 0;
        while (j < 31) {
            b[j] = j;
            j++;
        }
        j = 0;
        while (j < 31) {
            if (b[j] % 2 == 0) {
                System.out.print(b[j]);
                System.out.print(" ");
            }
            j++;
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Duracion: " + ((endTime - startTime) / 1e6) + "ms");
    }
}
