import java.util.Scanner;

public class lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Titulo de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Fecha de Lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Calificacion a la pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
