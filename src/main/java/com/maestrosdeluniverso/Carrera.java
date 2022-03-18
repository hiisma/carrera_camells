package com.maestrosdeluniverso;

import acm.graphics.GLabel;

public class Carrera {
    
    private int Torn;
    private int Guanyador;

    /** */
    public Carrera(){

        this.setTorn(0);
        this.setGuanyador(999);

    }

    public int getGuanyador() {
        return Guanyador;
    }
    public void setGuanyador(int guanyador) {
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
