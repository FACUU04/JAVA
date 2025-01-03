package com.Facu.Screenview.modelos;

import com.Facu.Screenview.excepciones.ERRORconversionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    //@SerializedName("Title")
    private String nombre;
    //@SerializedName("year")
    private int FechaLanzamiento;
    private int DuracionMinutos;
    private boolean IncluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    //Constructor que establece nombre y fecha obligatorio
    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        FechaLanzamiento = fechaLanzamiento;
    }

//Constructor de titulo para recibir un TituloOmdb
    public Titulo(TituloOMDB miTituloOMDB) {
        this.nombre = miTituloOMDB.title();
        this.FechaLanzamiento = Integer.valueOf(miTituloOMDB.year());

        //Creando propias excepciones y tratandolas
        if (miTituloOMDB.runtime().contains("N/A")){
            throw new ERRORconversionException("No pude convertir la duracion porque contiene N/A");
        }
        this.DuracionMinutos = Integer.valueOf(miTituloOMDB.runtime().substring(0,3).replace(" ", ""));
    }

    //Setter y Getter
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public void setFechaLanzamiento(int fechaLanzamiento) {
        FechaLanzamiento = fechaLanzamiento;}
    public void setDuracionMinutos(int duracionMinutos) {
        DuracionMinutos = duracionMinutos;}
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        IncluidoEnElPlan = incluidoEnElPlan;}


    public String getNombre() {
        return nombre;}
    public int getFechaLanzamiento() {
        return FechaLanzamiento;}
    public int getDuracionMinutos() {
        return DuracionMinutos;}
    public boolean isIncluidoEnElPlan() {
        return IncluidoEnElPlan;}


    //Continua el codigo
    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }




    public void muestraFichaTecnica(){
        System.out.println("La pelicula es: " +nombre);
        System.out.println("Lanzada en: " +FechaLanzamiento);
        System.out.println("Con una duracion de: " +getDuracionMinutos());

    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }

    //Metodo para comparar titulos y ordenarlos alfabeticamente
    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ",FechaLanzamiento=" + FechaLanzamiento +
                ", Duracion: " + getDuracionMinutos()+")"
                 ;
    }
}
