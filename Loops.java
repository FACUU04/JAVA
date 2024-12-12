import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Que calificacion le darias a Caballo de Guerra?");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("la media de evaluaciones: "+mediaEvaluaciones /3);
    }
}
