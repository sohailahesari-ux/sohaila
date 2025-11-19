public class BuscarParejasConsecutivas {
    public static void main(String[] args) {
        
        int[] a = {1, 1, 2, 2, 2, 3};

        
        int parejas = contarParejasConsecutivas(a);

       
        System.out.println("Parejas consecutivas = " + parejas);
    }

    public static int contarParejasConsecutivas(int[] a) {
        
        if (a.length < 2) {
            return 0;
        }

        int contador = 0;

        // Recorrer el array una sola vez
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                contador++;
            }
        }

        return contador;
    }
}