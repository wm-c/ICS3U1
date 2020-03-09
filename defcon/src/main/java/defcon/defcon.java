package defcon;

import ca.quarkphysics.hsa2.GraphicsConsole;
import defcon.drawing.Background;
import defcon.drawing.DrawCity;

public class defcon{

    GraphicsConsole gc;
    private final int screenWidth = 700;
    private final int screenHeight = 500;
    public DrawCity london = new DrawCity(155, 125, true, 10000, "London");

    public static void main(String[] args) {
       new defcon();
    }

    public defcon(){
        init();
        while(true){
            new Background(null).draw(gc);
            draw();
        }
        
    }

    private void init(){
        gc = new GraphicsConsole(screenWidth, screenHeight, "DEFCON");
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.addMouseMotionListener(gc);
    }

    public void draw(){
        synchronized(gc){
            london.draw(gc); 
            System.out.println(gc.getMouseX());    
        }   
    }

    

    

    



}