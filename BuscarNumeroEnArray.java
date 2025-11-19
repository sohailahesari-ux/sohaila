public class BuscarNumeroEnArray {
    public static void main(String[] args) {
        
        int[] array = {3, 8, 15, 9, 8, 22, 7};
        int x = 8;

        boolean encontrado = false;

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Encontrado en posición " + i);
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }
}