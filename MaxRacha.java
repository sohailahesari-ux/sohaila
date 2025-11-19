public class MaxRacha {
    public static void main(String[] args) {
        
        int[] a = {2, 2, 2, 1, 1, 3};

        
        int max = maxRacha(a);

        
        System.out.println("MaxRacha = " + max);
    }

    public static int maxRacha(int[] a) {
        if (a.length == 0) {
            return 0; 
        }

        int maxRacha = 1;    
        int rachaActual = 1; 

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                rachaActual++;
            } else {
                rachaActual = 1; 
            }

            if (rachaActual > maxRacha) {
                maxRacha = rachaActual;
            }
        }

        return maxRacha;
    }
}