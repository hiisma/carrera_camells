package com.maestrosdeluniverso;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.*;
import acm.program.*;
import java.util.random.*;

public class HelloGraphics extends GraphicsProgram {
    public void run() {

        GImage fons = new GImage("C:\\fons2.jpg");
        add(fons, 0, 0);
        GImage camellImatge = new GImage("C:\\2893172.png");

        ArrayList<Camell> camells = new ArrayList<Camell>(8);

        for (int i = 0; i < camells.size(); i++) {
            camells.add(new Camell(0, i, camellImatge, 0, 10 + i * 60));
        }

        Carrera Mapa = new Carrera();

        fons.setSize(754, 470);

        ArrayList<Camell> Array700 = new ArrayList<Camell>();
        while (true) {
            Mapa.setTorn(Mapa.getTorn()+1);
            for (Camell i : camells) {
                i.generarMoviment();

                if (i.getX() >= 700) {
                    Array700.add(i);
                }

                if (Array700.size() == 1) {
                    Mapa.setGuanyador(Array700.get(0).getId());
                } else if (Array700.size() >= 2) {
                    Mapa.Desempat(Array700);
                }

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

}