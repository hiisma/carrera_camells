package com.maestrosdeluniverso;
import acm.graphics.*;
import acm.program.*;

public class HelloGraphics extends GraphicsProgram {
    public void run() {
        GImage fons = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\fons2.jpg");
        GImage camell1 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell2 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell3 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell4 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell5 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell6 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell7 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");
        GImage camell8 = new GImage("E:\\1DAW\\Programacio\\uf4\\carrera_camells\\carrera_camells\\src\\2893172.png");


        fons.setSize(754,470);
        camell1.setSize(50,50);
        camell2.setSize(50,50);
        camell3.setSize(50,50);
        camell4.setSize(50,50);
        camell5.setSize(50,50);
        camell6.setSize(50,50);
        camell7.setSize(50,50);
        camell8.setSize(50,50);
        int ample = (int)camell1.getWidth();
        int alt = (int)camell2.getHeight();
        add(fons, 0, 0);
        add(camell1, 0, camell2.getHeight()*1);
        add(camell2, 0, camell2.getHeight()*2);
        add(camell3, 0, camell2.getHeight()*3);
        add(camell4, 0, camell2.getHeight()*4);
        add(camell5, 0, camell2.getHeight()*5);
        add(camell6, 0, camell2.getHeight()*6);
        add(camell7, 0, camell2.getHeight()*7);
        add(camell8, 0, camell2.getHeight()*8);




        //System.out.println(ample);
        //System.out.println(alt);



    }

}