package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole; 
import javaTest.Player;


public class SimpWars{

    GraphicsConsole gc = new GraphicsConsole(2000, 400, "SIMP WARS");
    Player player = new Player(50, 350);
    Bullet bullet;
    int mouseX;
    int mouseY;
    boolean draw = false;
    Wall wall = new Wall(gc, 100, 350,30,30);
    public static void main(String[] args) {
        
        new SimpWars();
    }

    public SimpWars(){
        
        Init(); 
        
        System.out.println(CollisionIndex.getInstance().getWall(0).x);
        while(true){
            input();
            mouseX = gc.getMouseX();
            mouseY = gc.getMouseY();
            gc.sleep(2);
            draw();
        }
    }

    public void draw() {
        synchronized(gc){
            gc.clear();

            // if(gc.getMouseClick() == 1){
            //     draw = true;
            //     bullet = new Bullet(player.x, player.y, mouseX, mouseY);
            // }
            // if(draw){
            //     bullet.BulletFlight();
            //     gc.fillOval((int) (bullet.bulletX), (int) (bullet.bulletY), 10, 10);
            // }
            player.Movement();
            Collision();
            wall.Draw();
            gc.fillRect(player.x, player.y, 50, 50);
            
        }
    }

    public void input(){
        if(gc.isKeyDown(68)){
            player.MoveRight();
        }
        if(gc.isKeyDown(65)){
            player.MoveLeft();
        }   
        if(gc.isKeyDown(32)){
            player.jumpState = true;
        }
        

    }

    public void Init(){
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.enableMouseMotion();
        gc.enableMouse();

    }

    public void Collision(){
        
    }








}