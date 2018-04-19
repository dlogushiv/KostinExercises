package part2;

// генерация пс.случ. числа из отрезка [a;b), где a<b-целые
public class Task7 {
    public static void main(String[] args) {
        int a = -2;
        int b = 8;
        for (int i = 0; i < 10; i++) {
            int g = (int) (Math.random() * (b - a)) + a;
            System.out.print(g + "    ");
        }
    }
}
