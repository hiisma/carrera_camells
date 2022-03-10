package com.maestrosdeluniverso;

import java.util.ArrayList;

public class Carrera {

    private int Torn;
    private int Guanyador;

    public Carrera() {

        this.Torn = 0;
        this.Guanyador = 0;

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

    // TODO : cambiar void por clase Camell
    public void Desempat(Camell[] camells) {

        ArrayList<Camell> guanyadors = new ArrayList<>();

        int pMax = 0;

        for (Camell i : camells) {
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

        this.setGuanyador(guanyadors.get(0).getId());

        // TODO: descomentar el return
        // return guanyadors.get(0);
    }

}
