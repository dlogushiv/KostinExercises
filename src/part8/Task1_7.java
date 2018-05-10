package part8;

// Подсчитайте, сколько раз потребуется повторно вычислить четвёртый
// элемент последовательности Фибоначчи для вычисления пятнадцатого элемента.

public class Task1_7 {
    static int counter;

    public static void main(String[] args) {
        counter = 0;
        int n = 15;
        for (int i = 1; i <= n; i++) {
            fibRec(i);
        }
        System.out.println(counter);
    }

    static int fibRec(int n) {
        if (n == 4) {
            counter++;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibRec(n - 2) + fibRec(n - 1);
    }
}
