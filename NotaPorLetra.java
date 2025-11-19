import java.util.Scanner;

public class NotaPorLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra de nota (A, B, C, D, F): ");
        String letra = sc.nextLine();

        
        letra = letra.toUpperCase();

        switch (letra) {
            case "A":
                System.out.println("Sobresaliente");
                break;
            case "B":
                System.out.println("Notable");
                break;
            case "C":
                System.out.println("Bien");
                break;
            case "D":
                System.out.println("Suficiente");
                break;
            case "F":
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Letra inválida");
        }

        sc.close();
    }
}