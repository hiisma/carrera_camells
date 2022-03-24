package com.maestrosdeluniverso;

public class CamellFlipat extends Camell {

    private boolean avanca;

    public CamellFlipat(int posicio, int id, String sprite, int x, int y) {
        super(posicio, id, sprite, x, y);
        this.avanca=true;
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
     * En cada torn, avançarà endevant o anredera 
     * (no canvia la posició de la imatge)
     * 
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 10, i no entre 0 i 9.
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        if (avanca) {
            posicio += mov;
            actualitzarPosicioImatge();
            return mov;
        } else {
            posicio -= mov/2;
            actualitzarPosicioImatge();
            return mov;
        }
    }
}
