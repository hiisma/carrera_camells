package com.maestrosdeluniverso;

import java.util.ArrayList;

/**
 * Clase carrera per manejar el curs de la cursa
 * 
 * @author Arnau
 */
public class Carrera {

    private int Torn;
    private int Guanyador;

    /**
     * Constructor clase Carrera
     */
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
    /**
     * Mètode per solucionar el problema de que hi hagin 2 o mès guanyadors de la
     * cursa
     * 
     * @param camells Array d'objectes "Camell" guanyadors al torn final
     */
    public ArrayList<Camell> Desempat(ArrayList<Camell> camells) {

        ArrayList<Camell> guanyadors = new ArrayList<Camell>();// Emmagatzemar els guanyadors de la cursa per anar
                                                               // descartant amb els "filtres"
        ArrayList<Camell> copia = new ArrayList<Camell>();// Emmagatzemar els guanyadors de la cursa per anar descartant
                                                          // amb els "filtres"

        int pMax = 0;// Emmagatzemar el valor mes alt dels participants

        // si la puntuació supera els 500pts, l'afegeix a `guanyadors`
        // si la puntuació es major a `pMax`, l'emmagatzema en aquesta variable
        for (Camell i : camells) {
            if (i.getPosicio() > 500) {

                guanyadors.add(i);
                copia.add(i);

                if (i.getPosicio() > pMax) {

                    pMax = i.getPosicio();

                }
            }
        }

        // si la puntuació es diferent de la emmagatzemada a `pMax`, l'elimina de
        // `guanyadors`
        for (Camell i : copia) {
            if (i.getPosicio() != pMax) {
                guanyadors.remove(i);
            }
        }

        return guanyadors;


    }

}
