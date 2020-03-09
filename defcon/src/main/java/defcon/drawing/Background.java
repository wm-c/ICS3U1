package defcon.drawing;

import ca.quarkphysics.hsa2.GraphicsConsole;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Background implements Shape {

    private Image bg;
    
    public Background(Image bg){
        try {
            this.bg = ImageIO.read(new File("C:\\Users\\William\\Documents\\Code\\ICS3U1\\defcon\\src\\main\\java\\defcon\\resources\\Background.jpg"));
            this.bg = this.bg.getScaledInstance(700, 500, 1);
        } catch (Exception e) {
            System.out.println("I dislike Expections in background caused by faulty Images");
            System.out.println(e);
        }
        
    }


    @Override
    public void draw(GraphicsConsole gc) {
        gc.drawImage(bg, 0, 0);

    }

    @Override
    public boolean collided() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void add(Shape[] shapes) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Shape[] shapes) {
        // TODO Auto-generated method stub

    }







    
}