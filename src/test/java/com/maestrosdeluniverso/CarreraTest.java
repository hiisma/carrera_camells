package com.maestrosdeluniverso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CarreraTest {
    @Test
    public void getTornADona0Inici(){
        Carrera ARNAU = new Carrera();
        assertEquals(0, ARNAU.getTorn());
    }

    @Test
    public void getTornBIncrementa1(){
        Carrera ARNAU = new Carrera();
        ARNAU.setTorn(1);
        assertEquals(1, ARNAU.getTorn());
    }


    @Test
    public void desempate(){
        Camell A = new Camell(510,1);
        Camell B = new Camell(502,2);
        Camell C = new Camell(480,3);

        Carrera map = new Carrera();

        ArrayList<Camell> Camells = new ArrayList<Camell>();

        Camells.add(A);
        Camells.add(B);
        Camells.add(C);

        ArrayList<Camell> esperat = new ArrayList<Camell>();
        esperat.add(A);
        
        assertArrayEquals(esperat.toArray(), map.Desempat(Camells).toArray());

    }

    @Test
    public void desempatePuntosIguales(){
        Camell A = new Camell(510,1);
        Camell B = new Camell(510,2);
        Camell C = new Camell(480,3);

        Carrera map = new Carrera();

        ArrayList<Camell> Camells = new ArrayList<Camell>();

        Camells.add(A);
        Camells.add(B);
        Camells.add(C);

        ArrayList<Camell> esperat = new ArrayList<Camell>();
        esperat.add(A);
        esperat.add(B);
        
        assertArrayEquals(esperat.toArray(), map.Desempat(Camells).toArray());

    }
}
