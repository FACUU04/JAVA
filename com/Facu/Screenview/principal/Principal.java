package com.Facu.Screenview.principal;

import com.Facu.Screenview.calculos.CalculadoraTiempo;
import com.Facu.Screenview.calculos.Recomendadaciones;
import com.Facu.Screenview.modelos.Episodio;
import com.Facu.Screenview.modelos.Pelicula;
import com.Facu.Screenview.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Creacion objeto pelicula y se le añade caracteristicas
        Pelicula miPelicula = new Pelicula("Caballo de Guerra", 2012);

        miPelicula.setFechaLanzamiento(2012);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

               miPelicula.muestraFichaTecnica();
                              miPelicula.evalua(9);
                              miPelicula.evalua(10);

          System.out.println(miPelicula.getTotalEvaluaciones());
          System.out.println(miPelicula.calculaMedia());



        Pelicula otraPelicula = new Pelicula("Ford vs Ferarri", 2022);

        otraPelicula.setFechaLanzamiento(2022);
        otraPelicula.setDuracionMinutos(180);

               otraPelicula.muestraFichaTecnica();


               var Pelicula = new Pelicula("Al filo del mañana", 2014);
               Pelicula.setDuracionMinutos(150);
               Pelicula.setFechaLanzamiento(2014);


               //Trabajando con listas
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
          listaPeliculas.add(miPelicula);
          listaPeliculas.add(otraPelicula);
          listaPeliculas.add(Pelicula);

        System.out.println("Tamaño de lista " +listaPeliculas.size());
        System.out.println("La primera pelicula es "+listaPeliculas.get(0).getNombre());
        System.out.println(listaPeliculas);

        System.out.println("toString de la pelicula" + listaPeliculas.get(0).toString());




//Creacion objeto serie y se le añade caracteristicas
        Serie BestGames = new Serie("BestGames", 2024);


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
