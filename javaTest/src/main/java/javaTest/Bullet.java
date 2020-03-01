package javaTest;

public class Bullet{

    double startX;
    double startY;
    double targetX;
    double targetY;
    double slope;
    double run;
    double rise;
    double bulletX;
    double bulletY;
    int flightTime;
    int bulletXSpeed;

    public Bullet(int startX, int startY, int targetX, int targetY){
        this.bulletX = startX;
        this.bulletY = startY;
        this.startY = startY;
        this.rise = targetY - startY;
        this.run = targetX - startX;
        this.slope = rise / run;
        
        if(slope < -10){
            this.slope = -10;
        }
        if(slope > 10){
            this.slope = 10;
        }
        if(targetX > startX){
            bulletXSpeed = 5;
        }
        if(targetX < startX){
            bulletXSpeed = -5;
        }
        this.flightTime = 0;
        
        
        
    }



    public void BulletFlight(){
        this.bulletX += this.bulletXSpeed;
        this.bulletY += this.slope * bulletXSpeed;
        
    }




}