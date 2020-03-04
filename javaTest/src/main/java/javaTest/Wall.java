package javaTest;

import ca.quarkphysics.hsa2.GraphicsConsole;



public class Wall{

    private GraphicsConsole gc;
    public int x;
    public int y;
    public int width;
    public int height;
    public static int wallCount = 0;
    public String name;

    public Wall(GraphicsConsole gc, int x, int y, int width, int height){
        wallCount++;
        this.name = "Wall " + wallCount + " ";
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        CollisionIndex.getInstance().AddTo(this);
        
    }

    public void Create(){
        
        System.out.println(CollisionIndex.getInstance().toString());
        Draw();

    }

    public void Draw(){
        gc.drawRect(x, y, width, height);
    }





}