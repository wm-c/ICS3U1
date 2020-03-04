package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole;

public class ball {
    int xPos;
    int yPos;
    int xVel;
    int yVel;
    int radius;
    int SW;
    int SH;
    GraphicsConsole gc;

    public ball(GraphicsConsole gc, int xPos, int yPos, int radius, int SW, int SH){
        this(gc, xPos, yPos, radius, SW, SH, 2, 2);
    }

    public ball(GraphicsConsole gc, int xPos, int yPos, int radius, int SW, int SH, int xVel, int yVel){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.SH = SH;
        this.SW = SW;
        this.gc = gc;
        this.yVel = yVel;
        this.xVel = xVel;
    }

    public void run(){
        synchronized(gc){
            collision();
            draw();
        }
        
    }

    public void draw(){
        xPos += xVel;
        yPos += yVel;
        gc.fillOval(xPos, yPos, radius, radius);
        
    }


    public void collision(){
        if(xPos >= SW - radius|| xPos == 0){
            xVel *= -1;
           //  xVel *= .01;
            
        }
        if(yPos >= SH - radius * 2|| yPos <= 0){
            yVel *= -1;
            // yVel *= .01;
            
        }        
    }





}