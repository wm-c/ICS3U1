package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole;

public class ball {
    int xPos;
    int yPos;
    int xVel = 2;
    int yVel = 2;
    int radius;
    int SW;
    int SH;
    GraphicsConsole gc;

    public ball(GraphicsConsole gc, int xPos, int yPos, int radius, int SW, int SH){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.SH = SH;
        this.SW = SW;
        this.gc = gc;
    }

    public void run(){
        synchronized(gc){
            collision();
            draw();
        }
        
    }

    public void draw(){
        gc.clearRect(xPos, yPos, radius, radius);
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