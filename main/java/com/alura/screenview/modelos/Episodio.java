package com.alura.screenview.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.alura.screenview.principal.Principal;

public class Episodio {
    private Integer temporada;
    private Integer numeroEpisodio;
    private String titulo;
    private Double evaluacion;
   private LocalDate fechaLanzamiento;


   //Constructor
    public Episodio(Integer numeroTemporada, DatosEpisodio d) {
        this.temporada = numeroTemporada;
        this.numeroEpisodio = d.numeroEpisodio();
        this.titulo = d.titulo();
        try {
            this.evaluacion = Double.valueOf(d.evaluacion());
        } catch (NumberFormatException e){
            this.evaluacion = 0.0;
        }

        try {
            this.fechaLanzamiento = LocalDate.parse(d.fechaLanzamiento());
        } catch (DateTimeParseException e){
            this.fechaLanzamiento = null;
        }

    }


    //Getters y Setters
       public Integer getTemporada() {
        return temporada;}
       public void setTemporada(Integer temporada) {
        this.temporada = temporada;}
       public Integer getNumeroEpisodio() {
        return numeroEpisodio;}
       public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;}
       public String getTitulo() {
        return titulo;}
       public void setTitulo(String titulo) {
        this.titulo = titulo;}
       public Double getEvaluacion() {
        return evaluacion;}
       public void setEvaluacion(Double evaluacion) {
        this.evaluacion = evaluacion;}
       public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;}
       public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;}



    @Override
    public String toString() {
        return
                "temporada: " + temporada +
                ", numeroEpisodio: " + numeroEpisodio +
                ", titulo: '" + titulo + '\'' +
                ", evaluacion: " + evaluacion +
                ", fechaLanzamiento: " + fechaLanzamiento;
    }
}



