import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalCalificaciones = 0;

        while (nota != -1) {
            System.out.println("Valoracion a la pelicula Caballo de guerra");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalCalificaciones++;

            }
            System.out.println("La media de calificaciones para Caballo de guerra es: " + mediaEvaluaciones / totalCalificaciones);
        }
    }
}



