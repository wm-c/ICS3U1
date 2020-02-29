package javaTest;

public class Player{

    public int x; 
    public int y;
    private double xVel = 0;
    private double yVel = 10;
    private int jumpCount = 10;
    public boolean jumpState = false;
    private final double xAccel = 1;
    private final double yAccel = -1;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
        
    }

    public void MoveRight(){
        xVel += xAccel;
    }

    public void MoveLeft(){
        xVel -= xAccel;
    }

    public boolean Jump(){
        if(jumpCount >= -10){
            y += jumpCount * -1;
            jumpCount--;
            return true;
        }else{
            jumpCount = 10;
            return false;
        }
        
    }

    public void Movement(){
        x += xVel;
        xVel += xVel * -.1;
       if(jumpState){
        jumpState = Jump();
       }
        if(xVel >= -.5 && xVel <= .5){
            xVel = 0;
        }       
    }








    
}