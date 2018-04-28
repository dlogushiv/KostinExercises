package part6;

// Выведите на экран первые 11 членов последовательности Фибоначчи.
// Напоминаем, что первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих.
public class Task2_11 {
    public static void main(String[] args) {
        long prev = 1;
        long now = 1;
        long next = 0;
        for (int i = 1; i <= 11; i++) {
            if (i == 1 || i == 2) {
                System.out.print(1 + " ");
            } else {
                next = prev + now;
                prev = now;
                now = next;
                System.out.print(next + " ");
            }
        }
    }
}
