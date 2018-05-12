package part10;

import java.util.Scanner;

public class Point {
    // Point properties
    public double x;
    public double y;

    // Point methods
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public void printPoint() {
        System.out.println(this.toString());
    }

    public void movePoint(double a, double b) {
        this.x += a;
        this.y += b;
    }

    public void setPoint(double a, double b) {
        this.x = a;
        this.y = b;
    }

    //    public Point() {
//        this.x = 0.0;
//        this.y = 0.0;
//    }
    // Modified default constructor for user input coordinates
    public Point() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter X coordinate of point: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("You enter not a number. Please try again: ");
            scanner.next();
        }
        this.x = scanner.nextDouble();
        System.out.print("Please enter Y coordinate of point: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("You enter not a number. Please try again: ");
            scanner.next();
        }
        this.y = scanner.nextDouble();
        scanner.close();
    }

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    public boolean equalsPoints(Point point) {
        return (this.x == point.x && this.y == point.y);// ? true : false;
//        if (this.x == point.x && this.y == point.y) return true;
//        else return false;
    }

    public void quarterPoint() {
        if (this.x == 0 && this.y == 0) {
            System.out.println("Point is at a zero position.");
        } else {
            if (this.x >= 0) {
                if (this.y > 0) {
                    System.out.println("Point (" + this.x + "; " + this.y + ") is at I quarter.");
                } else {
                    System.out.println("Point (" + this.x + "; " + this.y + ") is at IV quarter.");
                }
            } else {
                if (this.y > 0) {
                    System.out.println("Point (" + this.x + "; " + this.y + ") is at II quarter.");
                } else {
                    System.out.println("Point (" + this.x + "; " + this.y + ") is at III quarter.");
                }
            }
        }
    }

    public boolean symmetryPoints(Point point) {
        return (this.x == -point.x && this.y == -point.y);
    }

    public boolean collinearPoints(Point point1, Point point2){
        return ((this.x-point1.x)/(point2.x- point1.x)==(this.y-point1.y)/(point2.y- point1.y));
    }
}
