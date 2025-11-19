public class MaxCreciente {

    public static int maxCreciente(int[] a) {
        if (a.length == 0) {
            return 0; 
        }

        int maxRacha = 1;      
        int rachaActual = 1;   

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
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

    
    public static void main(String[] args) {
        System.out.println(maxCreciente(new int[]{1,2,3,1,2}));      // 3
        System.out.println(maxCreciente(new int[]{5}));               // 1
        System.out.println(maxCreciente(new int[]{3,3,3}));           // 1
        System.out.println(maxCreciente(new int[]{1,2,2,3}));         // 2
        System.out.println(maxCreciente(new int[]{9,8,7}));           // 1
        System.out.println(maxCreciente(new int[]{1,3,5,4,6,7,8}));   // 4
    }
}