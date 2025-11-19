import java.util.Scanner;

public class TermometroHumano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la temperatura en °C: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 0) {
            System.out.println("Muy frío");
        } else if (temperatura <= 10) {
            System.out.println("Frío");
        } else if (temperatura <= 20) {
            System.out.println("Templado");
        } else if (temperatura <= 30) {
            System.out.println("Calorcito");
        } else {
            System.out.println("Calorazo");
        }

        sc.close();
    }
}