package com.maestrosdeluniverso;

public class CamellFondista extends Camell {

    public CamellFondista(int posicio, int id, String sprite, int x, int y) {
        super(posicio, id, sprite, x, y);
    }

    /**
     * Desplaçament màxim que pot realitzar el camell.
     */
    public static final int DESPL_MAXIM = 10;

    /**
     * Genera de manera aleatoria un moviment
     * entre 1 i DESPL_MAXIM i modifica la
     * posició.
     * En cas de donar DESPL_MAXIM, avançarà
     * el doble (no canvia la posició de la imatge)
     * 
     * @return el moviment realitzat.
     */
    public int generarMoviment() {
        // Afegim + 1 per que els numeros estiguin entre
        // 1 i 10, i no entre 0 i 9.
        int mov = r.nextInt(DESPL_MAXIM) + 1;
        if (mov >= 5 || mov <= 10) {
            posicio += mov;
            actualitzarPosicioImatge();
            return mov;
        }
        return generarMoviment();
    }
}
