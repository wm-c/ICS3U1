package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole;

public class BallRewrite{

    public int ballX;
    public double ballY;
    public GraphicsConsole gc;
    public double flightTime = 30;
    public boolean gravity;
    public double gravityPower;
    public int xSpeed;
    
    public BallRewrite(int ballX, int ballY, GraphicsConsole gc){
        this(ballX, ballY, true, 1, 1, false, gc);
    }

    public BallRewrite(int ballX, int ballY, Boolean left, GraphicsConsole gc){
        this(ballX, ballY, true, 1, 1, left, gc);
    }


    public BallRewrite(int ballX, int ballY, boolean gravity, double gravityPower, int xSpeed, Boolean left, GraphicsConsole gc){
        this.ballX = ballX;
        this.ballY = ballY;
        this.gc = gc;
        this.xSpeed = xSpeed;
        if(left){
            this.xSpeed *= -1;
        }
        this.gravityPower = 1 / gravityPower;

        if(gravity){
            this.gravityPower *= -1;
        }
    }

    public void draw(){
        
        gravity();
        ballX += xSpeed;
        OffScreen();
        gc.fillOval(this.ballX, (int) (this.ballY), 10, 10);
    }

    private void gravity(){
        if(flightTime >= -30){
            ballY += flightTime * gravityPower;
            flightTime--;
        }else{
            flightTime = 30;
        }
    }

    private void OffScreen(){
        if(ballX > 1000){
            ballX = 0;
        }
        if(ballX < 0){
            ballX = 1000;
        }
    }

}