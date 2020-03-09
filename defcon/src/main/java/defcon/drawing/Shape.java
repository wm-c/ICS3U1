package defcon.drawing;

import ca.quarkphysics.hsa2.GraphicsConsole;

public interface Shape{

    public void draw(GraphicsConsole gc);

    public void add(Shape[] shapes);

    public void remove(Shape[] shapes);

    public boolean collided();

}