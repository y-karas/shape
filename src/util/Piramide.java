package util;

public class Piramide extends Shape {

    double areaOfBase;
    double height;
    double pVolume = 0;

    Piramide(String colour,  double areaOfBase, double height) {
        super(colour);
        this.areaOfBase = areaOfBase;
        this.height = height;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public double getFigureVolume() {
        pVolume = (areaOfBase*height)/3;
        return pVolume;
    }
}
