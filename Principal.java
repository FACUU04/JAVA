import com.Facu.Screenview.calculos.CalculadoraTiempo;
import com.Facu.Screenview.calculos.Recomendadaciones;
import com.Facu.Screenview.modelos.Episodio;
import com.Facu.Screenview.modelos.Pelicula;
import com.Facu.Screenview.modelos.Serie;

import java.security.spec.ECPoint;

public class Principal {
    public static void main(String[] args) {

        //Creacion objeto pelicula y se le añade caracteristicas
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

//Creacion objeto serie y se le añade caracteristicas
        Serie BestGames = new Serie();
        BestGames.setNombre("BestGames");
        BestGames.setFechaLanzamiento(2024);
        BestGames.setTemporadas(1);
        BestGames.setEpisodiosTemporada(2);
        BestGames.setMinutosEpisodio(34);

        System.out.println("Serie: "+BestGames.getNombre());
        System.out.println("Duracion total: "+BestGames.getDuracionMinutos());

//Metodo para calcular tiempo total de lo seleccionado
        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(BestGames);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());


        //Metodo para recomendar
        Recomendadaciones recomendadaciones = new Recomendadaciones();
        recomendadaciones.Filtra(miPelicula);
        recomendadaciones.Filtra(otraPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("1000 personas pelean por 5Millones");
        episodio.setSerie(BestGames);
        episodio.setVistas(1326000);

        recomendadaciones.Filtra(episodio);


    }
}
