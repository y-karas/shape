package util;

import java.util.ArrayList;

public class Box extends Shape {
     double boxCapacity;

     ArrayList<Shape> box = new ArrayList<>();

    Box(String colour, double boxCapacity) {
        super(colour);
        this.boxCapacity = boxCapacity;
    }

    public  boolean add(Shape shape){
        if(shape.getFigureVolume() <= boxCapacity){
            box.add(shape);
            boxCapacity-=shape.getFigureVolume();

        }return true;

    }


}
