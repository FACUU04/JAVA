import java.util.Random;
import java.util.Scanner;

public class juegoAdivinanzas {

    public static void main(String[] args) {


        int numeroSecreto = new Random().nextInt(100);
        int intentos = 1;

        Scanner teclado = new Scanner(System.in);
             System.out.println("Juguemos a adivinar el numero, ingresa un numero entre 0 y 100");
             int numeroUsuario = teclado.nextInt();

        while (numeroSecreto != numeroUsuario){
            System.out.println("Ash, ese no es, intenta otra vez");
            numeroUsuario = teclado.nextInt();
            intentos++;

            if (intentos == 5){
                System.out.println("Alcanzaste el maximo de intentos GAME OVER :(");
                break;
            }




        }
    }
}

public class JuegoDeAdivinacion {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(100); // genera un número aleatorio entre 0 y 100
        int intentos = 0;

        while (intentos < 5) {
            System.out.print("Introduzca un número entre 0 e 100: ");
            int numeroDelUsuario = lector.nextInt();
            intentos++;

            if (numeroDelUsuario == numeroGenerado) {
                System.out.println("Felicidades, adivinaste el número en " + intentos + " intentos!");
                break; // interrumpe el loop while
            } else if (numeroDelUsuario < numeroGenerado) {
                System.out.println("El número que escribiste es menor al número generado.");
            } else {
                System.out.println("El número que escribiste es mayor al número generado.");
            }
        }

        if (intentos == 5) {
            System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroGenerado);
        }
    }
}