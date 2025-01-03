package com.Facu.Screenview.principal;

import com.Facu.Screenview.excepciones.ERRORconversionException;
import com.Facu.Screenview.modelos.Titulo;
import com.Facu.Screenview.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();


        Gson gson =  new GsonBuilder()
                .setPrettyPrinting() //con esto se ve mas lindo
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        while (true){
            System.out.println("Buscar: ");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            //Conexion con servidor
            String direccion = "http://www.omdbapi.com/?t="+
                    busqueda.replace(" ", "+") +"&apikey=40b22570";
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                //Convertir json a clase
                String json = response.body();
                System.out.println(json);


                TituloOMDB miTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                System.out.println("Titulo: "+miTituloOMDB);




                Titulo miTitulo = new Titulo(miTituloOMDB);
                System.out.println("Titulo ya convertido"+miTitulo);


                titulos.add(miTitulo);
                //Creacion de archivos y almacenamiento de datos
               // FileWriter escritura = new FileWriter("peliculas.txt");
                //escritura.write(miTitulo.toString()); //como es objeto hay que usar toString para almacenarlo
                //escritura.close(); //cerrando comunicacion de archivo
//Continua el codigo
//Manejando errores
            } catch (NumberFormatException e){
                System.out.println("Ocurrio un error inesperado: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("ERROR en la URI, verifique la direccion");
            } catch (ERRORconversionException e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titulos);
        //creacion de archivo y trato de datos
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo la ejecucion del programa");

    }
}
