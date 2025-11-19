import java.util.Scanner;

public class ParejasAscendentesDescentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
       
        do {
            System.out.print("Introduce el tamaño del array (n ≥ 2): ");
            n = sc.nextInt();
        } while (n < 2);

        int[] a = new int[n];

      
        System.out.println("Introduce " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        int ascendentes = contarAscendentes(a);
        int descendentes = contarDescendentes(a);

        
        System.out.println("Ascendentes = " + ascendentes);
        System.out.println("Descendentes = " + descendentes);

        sc.close();
    }

    public static int contarAscendentes(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarDescendentes(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                contador++;
            }
        }
        return contador;
    }
}