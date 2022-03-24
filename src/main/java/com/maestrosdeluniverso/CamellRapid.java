package com.maestrosdeluniverso;

import acm.graphics.GImage;

public class CamellRapid extends Camell {

    public CamellRapid(int posicio, int id, GImage sprite, int x, int y) {
        super(posicio, id, sprite, x, y);
    }

    /**
     * Desplaçament màxim que pot realitzar el camell.
     */
    public static final int DESPL_MAXIM = 15;

    /**
     * Genera de manera aleatoria un moviment
     * entre 1 i DESPL_MAXIM i modifica la
     * posició. (no canvia la posició de la imatge)
     * 
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 15, abans era entre 0 i 14.
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        if (mov != DESPL_MAXIM) {
            posicio += mov;
            actualitzarPosicioImatge();
            return mov;
        } else {
            posicio += mov*2;
            actualitzarPosicioImatge();
            return mov;
        }
    }
}
