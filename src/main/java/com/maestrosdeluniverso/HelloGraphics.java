package com.maestrosdeluniverso;
import acm.graphics.*;
import acm.program.*;

public class HelloGraphics extends GraphicsProgram {
    public void run() {

        GImage fons = new GImage("C:\\fons2.jpg");
        GImage camell1 = new GImage("C:\\2893172.png");
        GImage camell2 = new GImage("C:\\2893172.png");
        GImage camell3 = new GImage("C:\\2893172.png");
        GImage camell4 = new GImage("C:\\2893172.png");
        GImage camell5 = new GImage("C:\\2893172.png");
        GImage camell6 = new GImage("C:\\2893172.png");
        GImage camell7 = new GImage("C:\\2893172.png");
        GImage camell8 = new GImage("C:\\2893172.png");


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
        int posicioX = 10;
        add(fons, 0, 0);
        add(camell1, 0, 10);
        add(camell2, 0, 70);
        add(camell3, 0, 130);
        add(camell4, 0, 190);
        add(camell5, 0, 250);
        add(camell6, 0, 310);
        add(camell7, 0, 370);
        add(camell8, 0, 430);

        while (true) {
            camell1.move(5,0);
            camell2.move(5,0);
            camell3.move(5,0);
            camell4.move(5,0);
            camell5.move(5,0);
            camell6.move(5,0);
            camell7.move(5,0);
            camell8.move(5,0);
            pause(90);
        }
        


        //System.out.println(ample);
        //System.out.println(alt);



    }

}