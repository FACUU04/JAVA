package com.alura.screenview.principal;

import com.alura.screenview.modelos.DataSerie;
import com.alura.screenview.modelos.DataTemporada;
import com.alura.screenview.modelos.DatosEpisodio;
import com.alura.screenview.service.ConsumoAPI;
import com.alura.screenview.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

        private final String URL_BASE = "https://www.omdbapi.com/?t=";
        private final String API_KEY = "&apikey=40b22570";

        private ConvierteDatos conversor = new ConvierteDatos();

        private ConsumoAPI consumoAPI = new ConsumoAPI();
        private Scanner teclado = new Scanner(System.in);
        public void muestraMenu(){
            System.out.println("Buscar por nombre");
            var nombreSerie = teclado.nextLine();

            //Busqueda personalizada por usuario
            var json = ConsumoAPI.obtenerDatos(URL_BASE +
                    nombreSerie.replace(" ", "+") + API_KEY);

            var datos = conversor.obtenerDatos(json, DataSerie.class);
            System.out.println(datos);

            //Obtener datos de todas las temporadas a traves de URL
            List<DataTemporada> temporadas = new ArrayList<>();
            for (int i = 1; i <= datos.totalTemporadas() ; i++) {
                json= ConsumoAPI.obtenerDatos
                        (URL_BASE + nombreSerie.replace(" ", "+")
                                + "&Season=" +i+ API_KEY);
                var datosTemporada = conversor.obtenerDatos(json, DataTemporada.class);
                temporadas.add(datosTemporada);
            }
           // temporadas.forEach(System.out::println);
            
            
            //Mostrar solo titulos de episodio y temporadas

            //for (int i = 0; i < datos.totalTemporadas() ; i++) {
              //  List<DatosEpisodio> episodioTemporada = temporadas.get(i).episodio();
                //Consigue todos los episodios
               // for (int j = 0; j < episodioTemporada.size(); j++) {
                //    System.out.println(episodioTemporada.get(j).titulo());
                    //Trae el titulo de los episodios
                //}
            //}
//Hace lo mismo que todo el for i
            temporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));
        }

    }

