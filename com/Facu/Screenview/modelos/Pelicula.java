package com.Facu.Screenview.modelos;

import com.Facu.Screenview.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

   private String director;


    //Constructor que llama a titulo
    public Pelicula(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    //Getter y Setter
      public String getDirector() {
          return director;}
      public void setDirector(String director) {
          this.director = director;}


    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() /2);
    }

    @Override
    public String toString() {
        return "Pelicula " + this.getNombre() + " ("+ this.getFechaLanzamiento()+")";
    }
}
