import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        
        do {
            System.out.print("Introduce un número entero (n ≥ 1): ");
            n = sc.nextInt();
        } while (n < 1);

        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1");
            } else {
                int c = a + b;
                System.out.print(c);
                a = b;
                b = c;
            }
            if (i < n) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}