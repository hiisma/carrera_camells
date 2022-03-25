package com.maestrosdeluniverso;

import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;
import java.awt.Dimension;

import acm.graphics.*;
import acm.program.*;

public class HelloGraphics extends GraphicsProgram {
    /**Funció principal del programa */
    public void run() {
        this.resize(MIDA_FINESTRA); // Posa la mida de la finestra correcta.
        inicialitzarFons();
        inicialitzarCamells();
        iniciCarrera();
    }

    /**
     * Afeigeix el fons de l'aplicació.
     */
    private void inicialitzarFons() {
        fons = new GImage(RUTA_FONS_APP);
        add(fons, 0, -25);
    }

    /**
     * Inicialitza l'arrayList de camells
     * i l'emplena amb tants camells com
     * digui NOMBRE_DE_CAMELLS
     */
    private void inicialitzarCamells() {
        camells = new ArrayList<Camell>(NOMBRE_DE_CAMELLS);

        camells.add(new Camell(0, 1, RUTA_IMATGE_CAMELL, 0, 10 + 0 * 60));
        camells.add(new CamellAntisenar(0, 2, RUTA_IMATGE_CAMELL, 0, 10 + 1 * 60));
        camells.add(new CamellFlipat(0, 3, RUTA_IMATGE_CAMELL, 0, 10 + 2 * 60));
        camells.add(new CamellFondista(0, 4, RUTA_IMATGE_CAMELL, 0, 10 + 3 * 60));
        camells.add(new CamellRapid(0, 5, RUTA_IMATGE_CAMELL, 0, 10 + 4 * 60));
        camells.add(new CamellFlipat(0, 6, RUTA_IMATGE_CAMELL, 0, 10 + 5 * 60));
        camells.add(new Camell(0, 7, RUTA_IMATGE_CAMELL, 0, 10 + 6 * 60));
        camells.add(new CamellRapid(0, 8, RUTA_IMATGE_CAMELL, 0, 10 + 7 * 60));
        
        for (Camell camell : camells) {
            add(camell.getSprite());
        }
    }

    /**
     * S'encarrega d'administrar el moviment de tots els camells.
     */
    private void generarMovimentCamells() {
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
    private boolean algunCamellHaArribat() {
        for (Camell camell : camells) {
            if (camell.getPosicio() >= DISTANCIA_META)
                return true;
        }
        return false;
    }

    /**
     * ES NECESSARI QUE ABANS D'EXECUTAR LA FUNCIÓ
     * ES SÀPIGA QUE COM A MÍNIM HA ARRIBAT UN CAMELL
     * A LA LÍNIA DE META.
     * Busca el camell que ha arribat a la meta
     * i que ha pasat a més distància.
     * @return el camell que ha guanyat.
     */
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
    
    /**
     * Mostra per pantalla un compte enrere de 3 segons.
     */
    public void compteEnrere() {
        GLabel num = new GLabel("3", 630, 100);
        num.setColor(Color.WHITE);
        num.setFont("monospace-30");
        add(num);
        pause(1000);
        num.setLabel("2");
        pause(1000);
        num.setLabel("1");
        pause(1000);
        num.setLocation(580,100);
        num.setLabel("En marxa");
        pause(400);
        remove(num);
    }
    
    /**
     * Mostra per pantalla un text que indica el guanyador.
     * @param id el numero del guanyador.
     */
    private void mostrarTextGuanyador(int id) {
        String text = "Ha guanyat el camell número: " + Integer.toString(id);
        GLabel label = new GLabel(text);
        label.setFont("monospace-30");
        label.setColor(Color.WHITE);
        label.setLocation(500,100);
        add(label);
        pause(1000);
    }
    
    /**
     * Executa la lògica de la carrera.
     */
    private void iniciCarrera() {
        compteEnrere();
        while(true) {
            // Pausa per evitar que el programa vagi massa ràpid.
            pause(TEMPS_ENTRE_FRAMES);

            generarMovimentCamells();
            if (algunCamellHaArribat()) {
                int id = buscaGuanyador().getId();
                mostrarTextGuanyador(id);
                break;
            }
        }
    }

    // CONSTANTS
    private static final String RUTA_FONS_APP = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\fons2.jpg";
    private static final String RUTA_IMATGE_CAMELL = System.getProperty("user.dir")
            + "\\src\\main\\resources\\img\\camell.png";
    private static final int NOMBRE_DE_CAMELLS = 8;     //Els camells que participaran.
    private static final int TEMPS_ENTRE_FRAMES = 100;  //En milisegons.
    private static final int DISTANCIA_META = 1200;     //En pixels.

    private static final Dimension MIDA_FINESTRA = new Dimension(1280,550);
    

    // VARIABLES
    private GImage fons;
    private ArrayList<Camell> camells;
}
