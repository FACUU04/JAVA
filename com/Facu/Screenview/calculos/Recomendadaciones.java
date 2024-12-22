package com.Facu.Screenview.calculos;

public class Recomendadaciones {

    public void Filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Lo mas popular");
        } else if (clasificacion.getClasificacion() == 3) {
            System.out.println("Bien evaluado");
        } else {
            System.out.println("Para ver mas tarde");
        }
    }
}
