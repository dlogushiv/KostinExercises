package part6;

// Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class Task2_4 {
    public static void main(String[] args) {
        int n = 1;
        int i = 2;
        do {
            System.out.print(i + " ");
            i = i*2;
            n++;
        } while (n <= 20);
    }
}
