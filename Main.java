public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! This is my first code in JAVA");

        System.out.println("Welcome to a ScreenVIEW!");
        System.out.println("Pelicula: Caballo de Guerra");

        int FechaLanzamiento = 2012;
        boolean IncluidoEnElPlan = true;
        double Calificacion = 8.3;

        double media = (8.7 + 9.0 + 6.8) / 3;
        System.out.println(media);

        String sinopsis = """
                "Caballo de Guerra" sigue la historia de un joven y su caballo
                 durante la Primera Guerra Mundial, mostrando su amistad y los desafíos 
                 que enfrentan en el conflicto.
                 Lanzada en:
                """ + FechaLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}
