package com.maestrosdeluniverso;

import java.util.ArrayList;

public class Carrera {

    private int Torn;
    private String Guanyador;

    public Carrera() {

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

    // TO DO : cambiar void por clase Camell
    public void Desempat(Camell[] P1) {

        ArrayList<Camell> guanyadors = new ArrayList<>();

        int pMax = 0;

        for (Camell i : P1) {
            if (i.getPosicio() > 500) {

                guanyadors.add(i);

                if (i.getPosicio() > pMax) {

                    pMax = i.getPosicio();
                
                }
            }
        }

        for (Camell i : guanyadors) {
            if (i.getPosicio() != pMax) {
                guanyadors.remove(i);
            }
        }

        // TO DO: descomentar el return
        // return guanyadors[0];
    }
    // array camellos posicion +500 add guanyadors

}
