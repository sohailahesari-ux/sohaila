public class MoverCerosAlFinal {
    public static void main(String[] args) {
        
        int[] a = {0, 1, 0, 3, 12};

        moverCeros(a);

        
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void moverCeros(int[] a) {
        int index = 0; 

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        
        while (index < a.length) {
            a[index] = 0;
            index++;
        }
    }
}