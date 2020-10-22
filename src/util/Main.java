package util;

public class Main {
    public static void main(String[] args) {
       Box box = new Box("red",128);

       Ball ball = new Ball("pink",4.5);

       Piramide piramide = new Piramide("green",24,6.7);

        System.out.println("Ball is pink");
        System.out.println("Piramide is green");
        System.out.println(box.add(ball));
        System.out.println(box.add(piramide));
    }
}
