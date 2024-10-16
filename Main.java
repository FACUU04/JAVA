public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenid@ a ScreenViews");
        System.out.println("Pelicula: Caballo de Guerra");


        int fechaDeLanzamiento = 2011;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 9.1;

        double media = (8.5 + 6.0 + 9.3) / 3;
        System.out.println(media);

        String sinopsis = """
                Caballo de Guerra (2011) es una película dirigida por Steven Spielberg que sigue la historia de un joven llamado Albert y su fiel caballo, 
                Joey, durante la Primera Guerra Mundial. Tras ser separados, Joey atraviesa diferentes dueños y situaciones en el frente de batalla,
                mostrando la brutalidad de la guerra y el impacto en humanos y animales. A lo largo de su travesía, la lealtad y valentía de Joey unen a diferentes personas, 
                mientras Albert sigue esperando su reencuentro. La película destaca el vínculo entre el ser humano y los animales en medio del conflicto.
                Lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);


        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }
}