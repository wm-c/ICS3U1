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

    public Bullet(int startX, int startY, int targetX, int targetY){
        this.bulletX = 0;
        this.bulletY = 0;
        this.startX = startX;
        this.startY = startY;
        this.targetX = targetX;
        this.targetY = targetY;
        this.rise = targetY - startY;
        this.run = targetX - startX;
        this.slope = rise / run;
        
    }

    public void BulletFlight(){
        
        this.bulletY = (this.slope * bulletX) + startY;
        this.bulletX = startX+= 5;

        
    }





}