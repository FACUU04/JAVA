public class Desiciones {
    public static void main(String[] args) {

        int FechaLanzamiento = 2012;
        boolean IncluidoEnElPlan = true;
        double Calificacion = 8.3;
        String plan = "plus";

        if (FechaLanzamiento >2018){
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas que marcaron tendencia");
        }

        if(IncluidoEnElPlan || plan.equals("plus")){
            System.out.println("Disfrute la pelicula");
        } else {
            System.out.println("Pelicula NO DISPONIBLE en plan actual");
        }

    }
}
