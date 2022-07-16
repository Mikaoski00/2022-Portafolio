package Java.Array_y_numeros_pares;

public class lista_par_for {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] a = new int[31];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int x = 0; x < a.length; x++) {
            if (a[x] % 2 == 0) {
                System.out.print(a[x]);
                System.out.print(" ");
            }
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Duracion: " + ((endTime - startTime) / 1e6) + "ms");
    }
}
