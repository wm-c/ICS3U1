package game.utils;



public class Position {

    private int x;
    private int y;
    private int rotation;

    public Position(int x, int y){
        this(x, y, 0);
    }

    public Position(int x, int y, int rotation){
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y;
    }

    public void setRotation(int rotation){
        this.rotation = rotation;
    }

    public int getRotation(){
        return this.rotation;
    }





}