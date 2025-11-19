public class ParesEImpares {
    public static void main(String[] args) {
        
        int[] a = {5, 8, 3, 10, 7, 6};

        int pares = 0;
        int impares = 0;

        int i = 0; 
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            i++;
        }

        System.out.println("Pares = " + pares + ", Impares = " + impares);
    }
}