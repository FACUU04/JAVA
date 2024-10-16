public class desiciones
{
    public static void main(String[] args) {
               int fechaDeLanzamiento = 2012;
               boolean incluidoEnElPlan = false;
               double notaDeLaPelicula = 8.7;
               String tipoPlan = "plus";

               if(fechaDeLanzamiento > 2020){
                   System.out.println("Peliculas modernas");
               } else {
                   System.out.println("Peliculas retro");
               }

               if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("No esta incluido en el plan");
        }
    }
}
