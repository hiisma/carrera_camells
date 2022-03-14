package com.maestrosdeluniverso;
/**
 * Opcions d'ajuda pel joc.
 */
public final class AjudaPerAlJoc {

    /**
     * Constructor que impedeix que la classe es crei.
     */
    private AjudaPerAlJoc() {

    }

    /**
     * Funció que retorna un valor double aleatòri entre 0 i el valor.
     * @param maxim
     * @return
     */
    public static double obtenirNumero(final int maxim) {
        return (int) (Math.random() * maxim);
    }

}
