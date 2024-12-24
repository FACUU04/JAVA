package com.Facu.Screenview.principal;

import com.Facu.Screenview.modelos.Pelicula;
import com.Facu.Screenview.modelos.Serie;
import com.Facu.Screenview.modelos.Titulo;

import java.util.*;

public class PrincipalconListas {
    public static void main(String[] args) {

        //Diversos titulos
        Pelicula miPelicula = new Pelicula("Caballo de Guerra", 2012);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Ford vs Ferarri", 2022);
        otraPelicula.evalua(10);
        var Pelicula = new Pelicula("Al filo del mañana", 2014);
        Pelicula.evalua(8);
        Serie BestGames = new Serie("BestGames", 2024);
        BestGames.evalua(10);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(Pelicula);
        lista.add(BestGames);

        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Pelicula pelicula){

                System.out.println(pelicula.getClasificacion());
            } else {
                System.out.println("ERROR en la clasificacion");
            }

        }


        List<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Matt Damon ");
        listaArtistas.add("Will Smith");
        listaArtistas.add("Antonio Banderas");
        System.out.println("Lista de artistas no ordenada");

        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada" +listaArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados "+lista);

//Comparator para ordenar por fechas
        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fechas: "+lista);
    }
}
