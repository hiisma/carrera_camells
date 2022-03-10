package com.maestrosdeluniverso;

import java.awt.Color;
import java.util.ArrayList;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GLine;

// Defineix la pista de la carrera
public class Pista {
    // Posició de la pantalla on començarà la carrera
    static final int PosicioInicial = 10;
    // Separació entre camells
    static final int separacio = 70;
    // Temps per començar la carrera
    static final int tempsInici = 2000;
    // Temps d'espera entre passades
    static final int tempsPausa = 80;
    // Lloc en el que s'ha de pintar
    private Carrera pantalla = null;
    // Camells que participen en la carrera
    private ArrayList<Camell> camells = null;
    // Lloc en el que està la línia d'arribada de la pista
    private double liniaFinal = 0;
    // Estrella que segueix el que va primer
    private GImage estrella = null;
    // Crear una pista de la mida especificada
    public Pista(final Carrera c, final double mida){
        pantalla = c;
        camells = new ArrayList<Camell>();
        
    }

}