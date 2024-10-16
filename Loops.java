import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvalucaiones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Valoracion a la pelicula Caballo de guerra");
                    nota = teclado.nextDouble();
                    mediaEvalucaiones = mediaEvalucaiones + nota;
            
        }
        System.out.println("La media de calificaciones para Caballo de guerra es: "+ mediaEvalucaiones / 3);
    }
}
