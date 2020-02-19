package game.shapes;


import game.utils.Attributes;
import game.utils.Position;


public class Square{
    
	private Position position;
    private Attributes attributes;
    private String name;

    public Square(){
        this(new Position(0, 0), new Attributes(25, 25), null);
    }


    public Square(Position position){
        this(position, new Attributes(25, 25), null);
    }

    public Square(Position position, Attributes attributes){
        this(position, attributes, null);
    }


    public Square(Position position, Attributes attributes, String name){
        this.position = position;
        this.attributes = attributes;
        this.name = name;
    }

    public void setPosition(Position position){
        this.position = position;
    }


    public Position getPosition(){
        return this.position;
    }

    public void setAttributes(Attributes attributes){
        this.attributes = attributes;
    }


    public Attributes getAttributes(){
        return this.attributes;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

}