package javaTest;

import java.awt.Color;

import ca.quarkphysics.hsa2.GraphicsConsole;

public class gtest{

    public GraphicsConsole gc = new GraphicsConsole(1000, 1000, "Graphics Test");

    public static void main(String[] args) {
        new gtest();
    }

    public gtest(){
        gc.setBackgroundColor(Color.BLACK);
        gc.clear();
        gc.setColor(Color.GREEN);
        gc.drawRect(20, 30, 600, 300);
        gc.setColor(Color.YELLOW);
        gc.drawOval(560, 0, 100, 100);
        gc.drawString("William Meathrel", 650, 330);
    }







}