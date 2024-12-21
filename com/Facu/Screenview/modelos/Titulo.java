package com.Facu.Screenview.modelos;

public class Titulo {
    private String nombre;
    private int FechaLanzamiento;
    private int DuracionMinutos;
    private boolean IncluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

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
}
