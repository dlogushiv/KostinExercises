package part3;

//В три переменные a, b и c записаны три вещественных числа. Создать программу,
// которая будет находить и выводить на экран вещественные корни
// квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
public class Task3 {
    public static void main(String[] args) {
        double a = 2;
        double b = 10;
        double c = 5;
        double D = b * b - 4 * a * c;
        if (D < 0)
            System.out.println("Korney net.");
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
