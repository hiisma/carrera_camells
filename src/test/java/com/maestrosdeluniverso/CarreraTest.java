package com.maestrosdeluniverso;

import static org.junit.Assert.*;

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

        Camell[] Camells = new Camell[3];

        Camells[0]=A;
        Camells[1]=B;
        Camells[2]=C;

        assertEquals(1, map.Desempat(Camells).getId());

    }
}
