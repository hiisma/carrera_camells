package com.maestrosdeluniverso;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Proves extends GraphicsProgram{

    public void run() {
        GRect sq = new GRect(100, 100);
        sq.setFilled(true);
        sq.setColor(Color.BLACK);
        add(sq);
    }
}
