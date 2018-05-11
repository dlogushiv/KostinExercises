package part10;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(0, 4);
        System.out.println(point1.distance(point2));

        System.out.println("Point 2 coordinates: " + point2.toString());
        // equivalent this
        System.out.println("Point 2 coordinates: " + point2);

    }
}
