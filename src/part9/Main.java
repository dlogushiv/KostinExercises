package part9;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.printCircle();
        circle1.x = 3;
        circle1.r = 12.3;
        circle1.printCircle();

        Circle circle2 = new Circle();
        circle2.r = 3.14;
        circle2.scaleCircle(1.66);
        circle2.printCircle();

        Circle circle3 = new Circle();
        circle3.printCircle();

        Circle circle4 = new Circle(5, 8, 5.6);
        circle4.printCircle();
        System.out.println("Square of circle with radius " + circle4.r + " is " + circle4.squareCircle());
        circle4.equalsCircleSquare(circle2);
        System.out.println("Circumference of circle with radius " + circle3.r + " = " + circle3.lengthCircle());
    }
}
