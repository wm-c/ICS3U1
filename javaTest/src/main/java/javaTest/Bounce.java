package javaTest;



import ca.quarkphysics.hsa2.GraphicsConsole;

public class Bounce {

    public static void main(String[] args){
        new Bounce();
    }

    int SW = 1000;
    int SH = 800;
    GraphicsConsole gc = new GraphicsConsole(SW, SH);
    int xPos = 100;
    int yPos = 100;
    int radius = 50;
    int xVel = 1;
    int yVel = 1;
    ball ball1 = new ball(gc, xPos, yPos, radius, SW, SH);
    ball ball2 = new ball(gc, xPos + 21, yPos + 21, radius, SW, SH);
    
    public Bounce(){
        Init();
        while(true){
            gc.sleep(2);
            draw();
        }
    }

    public void Init(){
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setTitle("Cringe");

    }

    

    public void draw(){
        synchronized(gc){
            ball2.run();
            ball1.run();
        
        }
        
    }

    public void collision(){
        if(xPos == 1000 - radius){
            xVel = -2;
        }

        if(xPos == 0){
            xVel = 2;
        }

        if(yPos == 0){
            yVel = 2;
        }

        if(yPos == 500 - radius){
            yVel = -2;
        }
    }

    public void clear(){
        gc.clear();
    }





}