package part11;

import part10.Point;

public class Triangle {
    public Point vertexA;
    public Point vertexB;
    public Point vertexC;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    @Override
    public String toString() {
        return "Triangle{" + vertexA + vertexB + vertexC + '}';
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
}
