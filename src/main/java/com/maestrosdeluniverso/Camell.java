package com.maestrosdeluniverso;

import acm.program.*;
import java.util.Random;

import acm.graphics.GImage;

/**
 * Classe camell que permet manejar
 * el moviment.
 */
public class Camell extends GraphicsProgram{
    protected GImage sprite;
    protected int posicio;
    protected int id;
    protected Random r;

    // Constants.
    /**
     * Desplaçament màxim que pot realitzar el camell.
     */
    public static final int DESPL_MAXIM = 15;

    public static final int WIDE_SPRITE = 50; 
    public static final int HEIGHT_SPRITE = 50;

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
     * Constructor amb identifiació,
     * posició i imatge.
     * També genera la llavor de Random.
     * @param posicio
     * @param id
     * @param sprite
     */
    Camell(int posicio, int id, String sprite, int x, int y) {
        this.posicio = posicio;
        this.id = id;
        this.sprite = new GImage(sprite);
        this.sprite.setSize(WIDE_SPRITE, HEIGHT_SPRITE);
        this.sprite.setLocation(x, y);
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
     * posició. (no canvia la posició de la imatge)
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 15, abans era entre 0 i 14. 
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        posicio+=mov;
        actualitzarPosicioImatge();
        return mov;
    }

    /**
     * Actualitza la posició de la imatge.
     */
    protected void actualitzarPosicioImatge() {
        sprite.setLocation(posicio, sprite.getY());
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

    public int getPosicio() {
        return posicio;
    }

    /**
     * Retorna l'objecte GImage que 
     * conté l'imatge del camell.
     * @return
     */
    public GImage getSprite() {
        return sprite;
    }
}
