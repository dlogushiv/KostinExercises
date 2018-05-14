package part10;

public class Main {
    public static void main(String[] args) {
//        Point point1 = new Point();
//        Point point2 = new Point(0, 4);
////        System.out.println(point1.distance(point2));
////
////        System.out.println("Point 2 coordinates: " + point2.toString());
////        // equivalent this
////        System.out.println("Point 2 coordinates: " + point2);
//
//        System.out.println("Task 1 testing:");
//        Point point3 = new Point(3, 5);
//        Point point4 = new Point(-9, 4);
//        Point point5 = new Point(-3, -6);
//        Point point6 = new Point(10, -15);
//        point1.quarterPoint();
//        point3.quarterPoint();
//        point4.quarterPoint();
//        point5.quarterPoint();
//        point6.quarterPoint();
//
//        System.out.println("Task 2 testing:");
//        if (point3.symmetryPoints(point5)) {
//            System.out.println("Point (" + point3.x + "; " + point3.y + ") is symmetry to point (" + point5.x + "; " + point5.y + ").");
//        } else {
//            System.out.println("Point (" + point3.x + "; " + point3.y + ") is not symmetry to point (" + point5.x + "; " + point5.y + ").");
//        }
//
//        System.out.println("Task 3 testing:");
//        Point point7 = new Point();
//        point7.printPoint();

        System.out.println("Task 4 testing:");
        Point point8 = new Point(0, 0);
        Point point9 = new Point(0, 5);
        Point point10 = new Point(0, 3);
        if (point10.collinearPoints(point8, point9)) {
            System.out.println("Point (" + point10.x + "; " + point10.y + ") is collinear with line from point (" + point8.x + "; " + point8.y + ") to point (" + point9.x + "; " + point9.y + ").");
        } else {
            System.out.println("Point (" + point10.x + "; " + point10.y + ") is not collinear with line from point (" + point8.x + "; " + point8.y + ") to point (" + point9.x + "; " + point9.y + ").");
        }

        System.out.println("rotation testing:");
        Point point11=new Point();
        point11.printPoint();
        Point point12=point11.rotate(90);
        point12.printPoint();
    }
}
