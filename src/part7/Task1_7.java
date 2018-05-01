package part7;

// Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Напоминаем, что первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих.
public class Task1_7 {
    public static void main(String[] args) {
        long fib[] = new long[20];
        for (int i = 0; i < fib.length; i++) {
            if (i == 0 || i == 1) {
                fib[i] = 1;
                System.out.print(fib[i] + " ");
            } else {
                fib[i] = fib[i - 2] + fib[i - 1];
                System.out.print(fib[i] + " ");
            }
        }
    }
}
