import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        Scanner teclado = new Scanner(System.in);

        while (nota != -1){
            System.out.println("Que calificacion le darias a Caballo de Guerra?");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        System.out.println("la media de evaluaciones: "+mediaEvaluaciones / totalEvaluaciones);
        }

    }
}
