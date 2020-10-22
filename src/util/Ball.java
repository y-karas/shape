package util;

public class Ball extends  Shape {
    double radius;
    double sVolume = 0;
    Ball(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public double getFigureVolume() {
        sVolume = (4* Math.PI *Math.pow(radius,3))/3;
        return sVolume;
    }
}
