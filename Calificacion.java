import java.util.Scanner;

class Calificacion {

    public String obtenerCalificacion(double valor) {
        if (valor < 0 || valor > 10) {
            return "Nota inválida";
        } else if (valor < 5) {
            return "Suspenso";
        } else if (valor < 7) {
            return "Aprobado";
        } else if (valor < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota (0-10): ");
        double nota = sc.nextDouble();

        String calificacion = programa.obtenerCalificacion(nota);
        System.out.println("Calificación: " + calificacion);

        sc.close();
    }
}