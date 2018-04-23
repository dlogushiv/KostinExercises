package part3;

// Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
// Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        double a = 8.75;
        double b = 11.45;
        if (Math.abs(n - a) <= Math.abs(n - b))
            System.out.println(a + " is closer to " + n + " then " + b);
            //System.out.println(a);
        else
            System.out.println(b + " is closer to " + n + " then " + a);
            //System.out.println(b);
    }
}
