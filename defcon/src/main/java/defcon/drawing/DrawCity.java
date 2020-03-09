package defcon.drawing;

import ca.quarkphysics.hsa2.GraphicsConsole;
import defcon.City;

public class DrawCity extends City implements Shape {

    public DrawCity(int cityX, int cityY, boolean exists, int population, String city_Name) {
        super(cityX, cityY, exists, population, city_Name, 10, 10);
    }

    public DrawCity(int cityX, int cityY, boolean exists, int population, String city_Name, int width, int height) {
        super(cityX, cityY, exists, population, city_Name, width, height);
    }

    @Override
    public void draw(GraphicsConsole gc) {
        gc.drawRect(cityX, cityY, height, width);
        gc.drawString(city_Name, cityX, cityY + height + 10);

    }

    @Override
    public void add(Shape[] shapes) {
        // TODO add stuff

    }

    @Override
    public void remove(Shape[] shapes) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean collided() {
        // TODO Auto-generated method stub
        return false;
    }

}