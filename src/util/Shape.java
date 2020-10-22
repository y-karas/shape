package util;

public abstract class Shape {
    String colour;
    double volume;


    Shape(String colour){
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }

    public double getFigureVolume() { return volume;}
}
