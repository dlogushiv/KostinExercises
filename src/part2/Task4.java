package part2;

// вывести "сигнум" (-1 или 0 или 1) числа
public class Task4 {
    public static void main(String[] args) {
        double n = 5;
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println((n < 0 ? -1 : 1));
        }
    }
}
