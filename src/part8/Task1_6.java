package part8;

// Создайте гибридный метод,
// для небольших n вычисляющий n-ое число Фибоначчи с помощью рекурсии,
// а для значений, превышающих выясненное вами в предыдущей задаче пороговое n,
// вычисляющий n-ое число Фибоначчи с помощью итерационного алгоритма
// (цикла, в рамках которого будут сохраняться значения двух предыдущих
// элементов последовательности).

public class Task1_6 {
    public static void main(String[] args) {
        int n = 90;
        long prev = 0;
        long now = 0;
        long next = 0;
        for (int i = 1; i <= n; i++) {
            if (i < 51) {
                next = Task1_5.fib(i);
                prev = now;
                now = next;
            } else {
                next = fibIter(prev, now);
                prev = now;
                now = next;
            }
            System.out.println(next + " ");
        }
    }

    static long fibIter(long prev, long now) {
        return prev + now;
    }
}
