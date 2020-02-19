package game.drawing;


import javax.swing.JPanel;
import game.shapes.Square;
import game.utils.Attributes;
import game.utils.Position;
import java.awt.Dimension;
import java.awt.Graphics;



public class GamePanel extends JPanel{
    
    
    public Square square; 
    /**
     *
     */
    private static final long serialVersionUID = 7484423975815218353L;

    public GamePanel() {
        square = new Square(new Position(30,30), new Attributes(50, 50));
    }





    @Override
    public Dimension getPreferredSize() {
         return new Dimension(250 ,250);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        square.getAttributes().setHeight(300);
        new DrawSquare(g, square); 
        
    }   
    
    public void repaint(){
        
    }

    
   



}