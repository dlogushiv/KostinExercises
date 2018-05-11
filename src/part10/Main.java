package part10;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(0, 4);
//        System.out.println(point1.distance(point2));
//
//        System.out.println("Point 2 coordinates: " + point2.toString());
//        // equivalent this
//        System.out.println("Point 2 coordinates: " + point2);

        System.out.println("Task 1 testing:");
        Point point3 = new Point(3, 5);
        Point point4 = new Point(-9, 4);
        Point point5 = new Point(-8, -1);
        Point point6 = new Point(3, -2);
        point1.quarterPoint();
        point3.quarterPoint();
        point4.quarterPoint();
        point5.quarterPoint();
        point6.quarterPoint();
    }
}
