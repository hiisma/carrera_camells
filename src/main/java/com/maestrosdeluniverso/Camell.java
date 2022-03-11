package com.maestrosdeluniverso;

import java.util.Random;

/**
 * Classe camell que permet manejar
 * el moviment.
 */
public class Camell {
    protected int posicio;
    protected int id;
    private Random r;

    // Constants.
    /**
     * Desplaçament màxim que pot realitzar el camell.
     */
    public static final int DESPL_MAXIM = 15;

    // Constructors
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
     * s'inicialitza a 0.
     * També genera la llavor de Random.
     * @param id Identificació del camell.
     */
    Camell(int id) {
        posicio = 0;
        this.id = id;
    }
    /**
     * Genera de manera aleatoria un moviment
     * entre 1 i DESPL_MAXIM i modifica la
     * posició.
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 15, abans era entre 0 i 14. 
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        posicio+=mov;
        return mov;
    }

    /**
     * Genera la possibilitat de 
     * moviment (50%).
     * @return
     */
    public boolean potMoures() {
        return (r.nextInt(2) == 1)?true:false;
    }

    // Getters
    /**
     * Retorna l'identificador del camell.
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna la posició del camell.
     * @return
     */
    public int getPosicio() {
        return posicio;
    }
}
