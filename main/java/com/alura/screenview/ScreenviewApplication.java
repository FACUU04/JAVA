package com.alura.screenview;
import com.alura.screenview.principal.EjemplosStreams;
import com.alura.screenview.principal.Principal;

import com.alura.screenview.modelos.DataSerie;
import com.alura.screenview.modelos.DataTemporada;
import com.alura.screenview.modelos.DatosEpisodio;
import com.alura.screenview.service.ConsumoAPI;
import com.alura.screenview.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenviewApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ScreenviewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//System.out.println("Hola mundo desde Spring!");

		Principal principal = new Principal();
		principal.muestraMenu();




    }


}

