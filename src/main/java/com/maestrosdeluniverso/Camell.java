package com.maestrosdeluniverso;

import java.util.Random;

/**
 * Classe camell que,
 */
public class Camell {
    private int posicio;
    private int id;
    private Random r;

    /**
     * Constructor per defecte
     * de la classe camell.
     * Inicialitza la posició a 0,
     * l'id a 0, i genera la llavor
     * per la variable r (Random).
     */
    Camell() {
        posicio = 0;
        id = 0;
        r = new Random();
    }

    /**
     * Constructor amb identificació
     * i posició.
     * També genera la llavor de Random.
     * @param posicio posició on es trobarà
     * el camell
     * @param id identificador del camell.
     */
    Camell(int posicio, int id) {
        this.posicio = posicio;
        this.id = id;
        r = new Random();
    }

    /**
     * Constructor amb identifiació, la posició
     * s'inicialitza 
     * Tamb
     * @param id
     */
    Camell(int id) {
        posicio = 0;
        this.id = id;
    }
}
