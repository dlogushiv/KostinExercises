package part1;

// деление натуральных чисел с вычислением целого значения и остатка от деления
public class Task1 {
    public static void main(String[] args) {
        int q, w;
        q = 40;
        w = 7;
        int a = q / w;
        int b = q % w;
        System.out.println(q + " / " + w + " = " + a + " and " + b + " in the remainder.");
    }
}
