package com.maestrosdeluniverso;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.*;
import acm.program.*;
import java.util.random.*;

public class HelloGraphics extends GraphicsProgram {
    public void runTemp() {
        GImage camellImatge = new GImage(System.getProperty("user.dir") + "\\src\\main\\resources\\img\\camell.png");

        ArrayList<Camell> camells = new ArrayList<Camell>(8);

        // for (int i = 0; i < camells.size(); i++) {
        //     camells.add(new Camell(0, i, camellImatge, 0, 10 + i * 60));
        // }

        Carrera Mapa = new Carrera();

        fons.setSize(754, 470);

        ArrayList<Camell> arrayGuanyadors = new ArrayList<Camell>();
        while (true) {
            Mapa.setTorn(Mapa.getTorn() + 1);
            for (Camell i : camells) {
                i.generarMoviment();

                if (i.getPosicio() >= 700) {
                    arrayGuanyadors.add(i);
                }

            }

            if (arrayGuanyadors.size() == 1) {
                Mapa.setGuanyador(arrayGuanyadors.get(0).getId());
            } else if (arrayGuanyadors.size() >= 2) {
                // Mapa.Desempat(arrayGuanyadors);
            }

            pause(90);
        }

        // System.out.println(ample);
        // System.out.println(alt);
        /*
         * for (GImage i : totCamell) {
         * i.setSize(50, 50);
         * }
         */

        // int ample = (int)camell1.getWidth();
        // int alt = (int)camell2.getHeight();
    }

    public void run() {
        inicialitzarFons();
        inicialitzarCamells();
    }

    public void inicialitzarFons() {
        fons = new GImage(RUTA_FONS_APP);
        add(fons, 0, 0);
    }

    public void inicialitzarCamells() {
        imatge_camell = new GImage(RUTA_IMATGE_CAMELL);
        camells = new ArrayList<Camell>(NOMBRE_DE_CAMELLS);

        for (int i = 0; i < NOMBRE_DE_CAMELLS; i++) {
            Camell camell = new Camell(0, i, RUTA_IMATGE_CAMELL, 0, 10 + i * 60);
            camells.add(camell);
            add(camells.get(i).getSprite());
        }
    }

    // CONSTANTS
    private static final String RUTA_FONS_APP = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\fons2.jpg";
    private static final String RUTA_IMATGE_CAMELL = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\camell.png";
    private static final int NOMBRE_DE_CAMELLS = 8;

    // VARIABLES
    private GImage fons;
    private GImage imatge_camell;

    private ArrayList<Camell> camells;

}
