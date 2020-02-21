package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole;

public class Bounce {

    public static void main(String[] args) {
        new Bounce();
    }

    GraphicsConsole gc = new GraphicsConsole();
    int xPos = 100;
    int yPos = 100;
    int radius = 50;
    int xVel = 10;
    int yVel = 10;


    public Bounce(){
        Init();
        while(true){
            draw();
            collision();
        }
    }

    public void Init(){
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setTitle("Cringe");

    }

    

    public void draw(){
        synchronized(gc){
            gc.fillOval(xPos, yPos, radius, radius);
        }
    }

    public collision(){
    }





}