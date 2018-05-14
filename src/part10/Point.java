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
        //scanner.close();
    }

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

//    public boolean equalsPoints(Point point) {
//        return (this.x == point.x && this.y == point.y);// ? true : false;
////        if (this.x == point.x && this.y == point.y) return true;
////        else return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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

    public boolean collinearPoints(Point point1, Point point2) {
        double x=this.x;
        double y = this.y;
        double x1= point1.x;
        double y1= point1.y;
        double x2= point2.x;
        double y2= point2.y;
        return ((y1-y2)*x+(x2-x1)*y+(x1*y2-x2*y1)==0);
    }

    public Point rotate(double deg){
        System.out.println("Please enter rotation point coordinates");
        Point rotationPoint = new Point();
        double newX=this.x-rotationPoint.x;
        double newY=this.y-rotationPoint.y;
        System.out.println(newX+", "+newY);
        double rad=deg*Math.PI/180;
        // rotate
        newX=newX*Math.cos(rad)-newY*Math.sin(rad);
        newY=newX*Math.sin(rad)+newY*Math.cos(rad);
        System.out.println(newX+", "+newY);
        // move back from (0; 0) to center
        newX=newX+rotationPoint.x;
        newY=newY+rotationPoint.y;
        return new Point(newX,newY);
    }
}
