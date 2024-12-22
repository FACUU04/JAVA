package com.Facu.Screenview.calculos;
import com.Facu.Screenview.modelos.Titulo;

public class CalculadoraTiempo {
    private int tiempoTotal;

    //Getter
    public int getTiempoTotal() {
        return tiempoTotal;}


    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();
    }
}
