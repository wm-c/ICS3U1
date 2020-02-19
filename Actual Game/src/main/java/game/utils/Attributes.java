package game.utils;

import java.awt.Color;

public class Attributes{

    private Color color;
    private int width;
    private int height;

    public Attributes(int width, int height){
        this(width, height, Color.WHITE);
    }

    public Attributes(int width, int height, Color color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }




}