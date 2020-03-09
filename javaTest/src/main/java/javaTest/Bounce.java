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
    BallRewrite ball1 = new BallRewrite(xPos, 700, gc);
    BallRewrite ball2 = new BallRewrite(xPos, 700, false, .5, 1, true, gc);
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
            clear();
            ball1.draw();
            ball2.draw();
        
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