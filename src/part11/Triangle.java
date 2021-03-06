package part11;

import part10.Point;

public class Triangle {
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        if (!vertexC.collinearPoints(vertexA, vertexB)) {
            this.vertexC = vertexC;
        } else {
            do {
                System.out.println("Vertex C is collinear to line AB. Change vertex C coordinates.");
                vertexC = new Point();
            } while (vertexC.collinearPoints(vertexA, vertexB));
            this.vertexC = vertexC;
        }
    }

    public void setVertexA(Point vertexA) {
        while (vertexA.collinearPoints(this.vertexB, this.vertexC)) {
            System.out.println("Vertex A is collinear to line BC. Change vertex A coordinates.");
            vertexA = new Point();
        }
        this.vertexA = vertexA;
    }

    public void setVertexB(Point vertexB) {
        while (vertexB.collinearPoints(this.vertexA, this.vertexC)) {
            System.out.println("Vertex B is collinear to line AC. Change vertex B coordinates.");
            vertexB = new Point();
        }
        this.vertexB = vertexB;
    }

    public void setVertexC(Point vertexC) {
        while (vertexC.collinearPoints(this.vertexA, this.vertexB)) {
            System.out.println("Vertex C is collinear to line AB. Change vertex C coordinates.");
            vertexC = new Point();
        }
        this.vertexC = vertexC;
    }

    @Override
    public String toString() {
        return "Triangle{" + vertexA + ',' + vertexB + ',' + vertexC + '}';
    }

    public void printTriangle() {
        System.out.println(this.toString());
    }

    public double perimTriangle() {
        return this.vertexA.distance(this.vertexB) +
                this.vertexB.distance(this.vertexC) +
                this.vertexC.distance(this.vertexA);
    }

    public double squareTriangle() {
        // The area of the triangle according to Heron's formula S=sqrt( p*(p-a)*(p-b)*(p-c) ), p=perim/2
        double p = this.perimTriangle() / 2;
        return Math.sqrt(p *
                (p - this.vertexA.distance(this.vertexB)) *
                (p - this.vertexB.distance(this.vertexC)) *
                (p - this.vertexC.distance(this.vertexA)));
    }

    public Triangle rotateTriangle(double deg) {
        // https://ru.wikipedia.org/wiki/Барицентр
        Point center = new Point((this.vertexA.x + this.vertexB.x + this.vertexC.x) / 3, (this.vertexA.y + this.vertexB.y + this.vertexC.y) / 3);
//        System.out.print("A center of triangle: ");
//        center.printPoint();
        Point newA = this.vertexA.rotatePoint(center, deg);
        Point newB = this.vertexB.rotatePoint(center, deg);
        Point newC = this.vertexC.rotatePoint(center, deg);

        return new Triangle(newA, newB, newC);
    }
}
