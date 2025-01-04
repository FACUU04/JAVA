package com.alura.screenview;

import com.alura.screenview.modelos.DataSerie;
import com.alura.screenview.service.ConsumoAPI;
import com.alura.screenview.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenviewApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenviewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//System.out.println("Hola mundo desde Spring!");

		var ConsumoAPI = new ConsumoAPI();
		var json = ConsumoAPI.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&apikey=40b22570");
		System.out.println(json);

		//Indicamos que queremos solo datos de serie, ya que "ConvierteDatos" es generico
		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DataSerie.class);
		System.out.println("Los datos de la serie son: "+datos);

}

}

