package part11;

import part10.Point;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(), new Point(), new Point());
        triangle1.printTriangle();
        System.out.println("Perimeter of triangle: " + triangle1.perimTriangle());
        System.out.println("Square of triangle: " + triangle1.squareTriangle());
        triangle1.setVertexA(new Point());
        System.out.println(triangle1);

    }
}
