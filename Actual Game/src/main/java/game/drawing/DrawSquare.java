package game.drawing;
import java.awt.Graphics;
import game.shapes.*;
import java.awt.Color;

public class DrawSquare{


    public DrawSquare(Graphics g, Square square){
        
        g.setColor(new Color(100, 100, 100));
        g.fillRect(square.getPosition().getX(), square.getPosition().getY(), 
            square.getAttributes().getWidth(), square.getAttributes().getHeight());
    }













    
}