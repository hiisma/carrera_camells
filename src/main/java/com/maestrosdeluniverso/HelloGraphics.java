package com.maestrosdeluniverso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import acm.graphics.*;
import acm.program.*;

public class HelloGraphics extends GraphicsProgram {
    public void run() {
        this.resize(AMPLADA_FINESTRA, ALTURA_FINESTRA); // Posa la mida de la finestra correcta.
        inicialitzarFons();
        inicialitzarCamells();
        iniciCarrera();
    }

    /**
     * Afeigeix el fons de l'aplicació.
     */
    public void inicialitzarFons() {
        fons = new GImage(RUTA_FONS_APP);
        add(fons, 0, -25);
    }

    /**
     * Inicialitza l'arrayList de camells
     * i l'emplena amb tants camells com
     * digui NOMBRE_DE_CAMELLS
     */
    public void inicialitzarCamells() {
        camells = new ArrayList<Camell>(NOMBRE_DE_CAMELLS);

        camells.add(new Camell(0, 0, RUTA_IMATGE_CAMELL, 0, 10 + 0 * 60));
        camells.add(new CamellAntisenar(0, 1, RUTA_IMATGE_CAMELL, 0, 10 + 1 * 60));
        camells.add(new CamellFlipat(0, 2, RUTA_IMATGE_CAMELL, 0, 10 + 2 * 60));
        camells.add(new CamellFondista(0, 3, RUTA_IMATGE_CAMELL, 0, 10 + 3 * 60));
        camells.add(new CamellRapid(0, 4, RUTA_IMATGE_CAMELL, 0, 10 + 4 * 60));
        camells.add(new CamellFlipat(0, 5, RUTA_IMATGE_CAMELL, 0, 10 + 5 * 60));
        camells.add(new Camell(0, 6, RUTA_IMATGE_CAMELL, 0, 10 + 6 * 60));
        camells.add(new CamellRapid(0, 7, RUTA_IMATGE_CAMELL, 0, 10 + 7 * 60));
        
        for (Camell camell : camells) {
            add(camell.getSprite());
        }
    }

    /**
     * S'encarrega d'administrar el moviment de tots els camells.
     */
    public void generarMovimentCamells() {
        for (Camell camell : camells) {
            camell.generarMoviment();
        }
    }

    /**
     * Detecta si algun camell ha arribat al llindar
     * per guanyar la carrera.
     * @return Cert si algun camell està a un a posicó
     * p >= DISTANCIA_META
     */
    public boolean algunCamellHaArribat() {
        for (Camell camell : camells) {
            if (camell.getPosicio() >= DISTANCIA_META)
                return true;
        }
        return false;
    }

    public Camell buscaGuanyador() {
        // Es crea un array de la mida de la quantitat de camells que
        // participan, ja que es el nombre màxim de camells que poden
        // arribar a la meta.
        ArrayList<Camell> guanyadors = new ArrayList<>(NOMBRE_DE_CAMELLS);

        // Guarda els camells que han arribat a la meta.
        for (int i = 0; i < camells.size(); i++) {
            Camell camellActual = camells.get(i);
            if (camellActual.getPosicio() >= DISTANCIA_META) {
                guanyadors.add(camellActual);
            }
        }

        // Ordena els camells que estiguin a la pos
        Collections.sort(guanyadors);
        
        return guanyadors.get(guanyadors.size() - 1);
    }

    public void iniciCarrera() {
        while(true) {
            // Pausa per evitar que el programa vagi massa ràpid.
            pause(TEMPS_ENTRE_FRAMES);

            generarMovimentCamells();
            if (algunCamellHaArribat()) {
                pause(5000);
                int id = buscaGuanyador().getId();
                System.out.println("Ha guanyat el camell num: " + id);
                break;
            }
        }
    }

    // CONSTANTS
    private static final String RUTA_FONS_APP = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\fons2.jpg";
    private static final String RUTA_IMATGE_CAMELL = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\camell.png";
    private static final int NOMBRE_DE_CAMELLS = 8;
    private static final int AMPLADA_FINESTRA = 1280;
    private static final int ALTURA_FINESTRA = 550;
    private static final int TEMPS_ENTRE_FRAMES = 100;  //En milisegons.
    private static final int DISTANCIA_META = 1200;
    

    // VARIABLES
    private GImage fons;
    private ArrayList<Camell> camells;
}
