package part6;

// Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
public class Task2_5 {
    public static void main(String[] args) {
        for (int a = 2; a < 10000; a = a * 2 - 1) {
            System.out.print(a + " ");
        }
    }
}
