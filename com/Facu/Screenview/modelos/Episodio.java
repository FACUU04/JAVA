package com.Facu.Screenview.modelos;

import com.Facu.Screenview.calculos.Clasificacion;

public class Episodio implements Clasificacion {

     private int numero;
     private String nombre;
     private Serie serie;
     private int vistas;

//Getters y Setters
       public int getNumero() {
        return numero;}
       public void setNumero(int numero) {
        this.numero = numero;}
       public String getNombre() {
        return nombre;}
       public void setNombre(String nombre) {
        this.nombre = nombre;}
       public Serie getSerie() {
        return serie;}
       public void setSerie(Serie serie) {
        this.serie = serie;}
       public int getVistas() {
        return vistas;}

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    @Override
    public int getClasificacion() {
        if (vistas > 1000){
            return 4;
        }else {
            return 2;
        }
    }
}
