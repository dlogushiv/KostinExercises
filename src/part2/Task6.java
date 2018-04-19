package part2;

// генерация пс.случ. целого числа и отрезка [-n;n], где n- натуральное
public class Task6 {
    public static void main(String[] args) {
        int n = 8;
        if (n <= 0)
            System.out.println("Chislo ne naturalnoe.");
        else
            System.out.print((int) (Math.random() * n * 2) - n + "    ");
    }
}
