package javaTest;

import java.util.ArrayList;

public class CollisionIndex {
    public static CollisionIndex collisionIndex_Instance = null;
    public ArrayList<Wall> Collisions = new ArrayList<Wall>();

    private CollisionIndex(){

    }

    public static CollisionIndex getInstance(){
        if(collisionIndex_Instance == null){
            collisionIndex_Instance = new CollisionIndex();

            return collisionIndex_Instance;
        }

        return collisionIndex_Instance;
    }

    public Wall getWall(int index){
        return Collisions.get(index);
    }

    public void AddTo(Wall wall){
        Collisions.add(wall);
    }

    @Override
    public String toString(){
        StringBuilder toString = new StringBuilder();
        for (Wall wall : Collisions) {
            toString.append(wall.name);
        }
        return toString.toString();
    }












}