import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Busqueda");
        String pelicula = teclado.nextLine();
        System.out.println("Fecha de lanzamiento");
        int FechaDeLanzamiento = teclado.nextInt();
        System.out.println("Que calificacion le das?");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(FechaDeLanzamiento);
        System.out.println(nota);
    }
}
