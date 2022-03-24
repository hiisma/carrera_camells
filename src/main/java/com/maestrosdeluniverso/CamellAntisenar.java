package com.maestrosdeluniverso;

import acm.graphics.GImage;

public class CamellAntisenar extends Camell {

    public CamellAntisenar(int posicio, int id, GImage sprite, int x, int y) {
        super(posicio, id, sprite, x, y);
    }

    /**
     * Desplaçament màxim que pot realitzar el camell.
     */
    public static final int DESPL_MAXIM = 15;

    /**
     * Genera de manera aleatoria un moviment
     * entre 1 i DESPL_MAXIM i modifica la
     * posició.
     * 
     * En cas de donar un resultat parell, avançarà
     * el valor indicat, en cas de ser senar, avançarà 
     * 2posicións (no canvia la posició de la imatge)
     * 
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 10, i no entre 0 i 9.
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        if (mov % 2 == 0) {
            posicio += mov;
            actualitzarPosicioImatge();
            return mov;
        }
        posicio += 2;
        actualitzarPosicioImatge();
        return mov;
    }
}
