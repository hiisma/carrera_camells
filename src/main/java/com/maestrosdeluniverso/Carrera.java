package com.maestrosdeluniverso;

import acm.graphics.GLabel;

public class Carrera {
    
    private int Torn;
    private String Guanyador;

    /** */
    public Carrera(){

        this.setTorn(0);
        this.setGuanyador("No ha acabat la carrera");

    }

    public String getGuanyador() {
        return Guanyador;
    }
    public void setGuanyador(String guanyador) {
        this.Guanyador = guanyador;
    }


    public int getTorn() {
        return Torn;
    }
    public void setTorn(int torn) {
        this.Torn = torn;
    }    

    //TODO : cambiar void por clase Camell
    public void Desempat(Camell[] P1) {
        
    }
    // array camellos posicion +500 add guanyadors

    public void add(Object imatge) {
    }

}
