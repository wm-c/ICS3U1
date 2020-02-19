package ICS201;

import javax.swing.JFrame;
import java.awt.*;

public class DrawTest extends JFrame{

    public DrawTest(){
        // paint(this);
    }


    @Override
    public void paint(Graphics g){
        g.drawRect(50, 50, 50, 50);
    }



    
    




}