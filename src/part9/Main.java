package part9;


public class Main {
    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        circle1.printCircle();
//        circle1.x = 3;
//        circle1.r = 12.3;
//        circle1.printCircle();
//
//        Circle circle2 = new Circle();
//        circle2.r = 3.14;
//        circle2.scaleCircle(1.66);
//        circle2.printCircle();
//
//        Circle circle3 = new Circle();
//        circle3.printCircle();
//
//        Circle circle4 = new Circle(5, 8, 5.6);
//        circle4.printCircle();
//        System.out.println("Square of circle with radius " + circle4.r + " is " + circle4.squareCircle());
//        circle4.equalsCircleSquare(circle2);
//        System.out.println("Circumference of circle with radius " + circle3.r + " = " + circle3.lengthCircle());
//
//        System.out.println("Task 2 testing:");
//        circle3.printCircle();
//        circle3.moveCircle();
//        circle3.printCircle();
//
//        System.out.println("Task 3 testing:");
//        Circle circle5=new Circle();
//        circle5.printCircle();

        System.out.println("Task 4 testing:");
        Circle circle6 = new Circle(0, 0, 3);
        Circle circle7 = new Circle(3, 4, 3);
        System.out.println(circle6.distCircleCentr(circle7));

        System.out.println("Task 5 testing:");
        Circle circle8 = new Circle(0, 0, 3);
        Circle circle9 = new Circle(0, 6, 2);
        if (circle8.tangentCircles(circle9)) {
            System.out.println("The circles are tangent.");
        } else {
            System.out.println("The circles are not tangent.");
        }

    }
}
