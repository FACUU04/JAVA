package com.alura.screenview.principal;

import com.alura.screenview.modelos.DataSerie;
import com.alura.screenview.modelos.DataTemporada;
import com.alura.screenview.modelos.DatosEpisodio;
import com.alura.screenview.modelos.Episodio;
import com.alura.screenview.service.ConsumoAPI;
import com.alura.screenview.service.ConvierteDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

    }

    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=40b22570";

    private ConvierteDatos conversor = new ConvierteDatos();

    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        System.out.println("Buscar por nombre");
        var nombreSerie = teclado.nextLine();

        //Busqueda personalizada por usuario
        var json = ConsumoAPI.obtenerDatos(URL_BASE +
                nombreSerie.replace(" ", "+") + API_KEY);

        var datos = conversor.obtenerDatos(json, DataSerie.class);
        System.out.println(datos);

        //Obtener datos de todas las temporadas a traves de URL
        List<DataTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totalTemporadas(); i++) {
            json = ConsumoAPI.obtenerDatos
                    (URL_BASE + nombreSerie.replace(" ", "+")
                            + "&Season=" + i + API_KEY);
            var datosTemporada = conversor.obtenerDatos(json, DataTemporada.class);
            temporadas.add(datosTemporada);
        }
        // temporadas.forEach(System.out::println);


        //Mostrar solo titulos de episodio y temporadas

        // for (int i = 0; i < datos.totalTemporadas(); i++) {
        //   List<DatosEpisodio> episodioTemporada = temporadas.get(i).episodio();
        //Consigue todos los episodios
        // for (int j = 0; j < episodioTemporada.size(); j++) {
        //   System.out.println(episodioTemporada.get(j).titulo());
        //Trae el titulo de los episodios


//Hace lo mismo que todo el for i
        temporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));


        //Creacion de lista con los datos de episodios
        List<DatosEpisodio> datosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodio().stream())
                .collect(Collectors.toList());
        //Filtrando los mejores episodios por temporada
        System.out.println("Top 5 MEJORES EPISODIOS");
        datosEpisodios.stream()
                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
                .limit(5)
                .forEach(System.out::println);


        //Convirtiendo Datos a lista tipo episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodio().stream()
                        .map(d -> new Episodio(t.numeroTemporada(), d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);

        //Busqueda de episodios por fecha
        System.out.println("Buscar por fecha");
        var fecha = teclado.nextInt();
        teclado.nextLine();

        LocalDate fechaBusqueda = LocalDate.of(fecha, 1, 1);

        //Adaptando formato de fecha
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Continua el codigo para la busqueda por fecha
        episodios.stream()
                .filter(e -> e.getFechaLanzamiento() != null && e.getFechaLanzamiento().isAfter(fechaBusqueda))
                .forEach(e -> System.out.println(
                        "Temporada: " +e.getTemporada() +
                                "Episodio: " +e.getNumeroEpisodio() +
                                   "Titulo: " +e.getTitulo() +
                                       "Fecha: "+e.getFechaLanzamiento().format(dateTimeFormatter)
                ));
    }

}


