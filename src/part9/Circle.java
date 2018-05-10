package part9;

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
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
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
    public double lengthCircle(){
        return 2*Math.PI*this.r;
    }
}
