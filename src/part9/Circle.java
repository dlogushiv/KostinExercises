package part9;

import java.util.Scanner;

public class Circle {
    // circle properties
    public double x; // x coordinate
    public double y; // y coordinate
    public double r; // circle radius

    // circle methods
    // Circle properties printing
    public void printCircle() {
        System.out.println("Circle with center in (" + this.x + "; " + this.y + ") and radius " + this.r + ".");
    }

    // Circle center moving
    public void moveCircle(double a, double b) {
        this.x = this.x + a;
        this.y = this.y + b;
    }

    // Circle scaling
    public void scaleCircle(double k) {
        this.r = this.r * k;
    }

    // Circle square
    public double squareCircle() {
        return Math.PI * this.r * this.r;
    }

    // default Circle constructor
    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter X coordinate of circle center: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("You enter not a number. Please try again: ");
            scanner.next();
        }
        this.x = scanner.nextDouble();

        System.out.print("Please enter Y coordinate of circle center: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("You enter not a number. Please try again: ");
            scanner.next();
        }
        this.y = scanner.nextDouble();

        do {
            System.out.print("Please enter radius (positive number) of circle: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("You enter not a number. Please try again: ");
                scanner.next();
            }
            this.r = scanner.nextDouble();
        } while (this.r <= 0);
    }


    // Circle constructor with parameters
    public Circle(double a, double b, double s) {
        this.x = a;
        this.y = b;
        this.r = s;
    }

    // Circles square comparator
    public void equalsCircleSquare(Circle circle) {
        if (this.squareCircle() == circle.squareCircle()) {
            System.out.println("Circles squares are equals!");
        } else {
            System.out.println("Circles squares are not equals!");
        }
    }

    // Circle circumference (length of circle)
    public double lengthCircle() {
        return 2 * Math.PI * this.r;
    }

    // Method which move circle center to random point on [-99;-99] ... [99;99]
    public void moveCircle() {
        this.x = Math.random() * 198 - 99;
        this.y = Math.random() * 198 - 99;
    }

    // Method which calculate distance between circles centers
    public double distCircleCentr(Circle circle){
        double distance;
        double offsetX=Math.abs(this.x-circle.x);
        double offsetY=Math.abs(this.y-circle.y);
        distance=Math.sqrt(offsetX*offsetX+offsetY*offsetY);
        return distance;
    }
}
