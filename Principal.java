import com.Facu.Screenview.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Caballo de Guerra");
        miPelicula.setFechaLanzamiento(2012);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

               miPelicula.muestraFichaTecnica();
                              miPelicula.evalua(9);
                              miPelicula.evalua(10);

          System.out.println(miPelicula.getTotalEvaluaciones());
          System.out.println(miPelicula.calculaMedia());





        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Ford vs Ferarri");
        otraPelicula.setFechaLanzamiento(2022);
        otraPelicula.setDuracionMinutos(180);

               otraPelicula.muestraFichaTecnica();

    }
}
