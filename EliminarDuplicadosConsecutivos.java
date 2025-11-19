public class EliminarDuplicadosConsecutivos {
    public static void main(String[] args) {
        
        int[] a = {1, 1, 2, 2, 2, 3};

        imprimirSinDuplicadosConsecutivos(a);
    }

    public static void imprimirSinDuplicadosConsecutivos(int[] a) {
        if (a.length == 0) {
            return; 
        }

        
        System.out.print(a[0]);

        
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                System.out.print(" " + a[i]);
            }
        }
    }
}