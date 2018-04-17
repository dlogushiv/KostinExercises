package part2;

// вычислить и вывести площадь и периметр пр.уг. треугольника, зная дл. катетов
public class Task2 {
    public static void main(String[] args) {
        double a = 5.4;
        double b = 2.1;

        System.out.println("Square = " + square(a, b));
        System.out.println("Perimetr = " + perim(a, b));
    }

    private static double perim(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return a + b + c;
    }

    private static double square(double a, double b) {
        return (a * b) / 2;
    }
}
