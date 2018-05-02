package part7;

// Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class Task1_10 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int neg = 0;
        int zero = 0;
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 4 - 2);
            System.out.print(a[i] + " ");
            if (a[i] == -1) {
                neg++;
            } else if (a[i] == 0) {
                zero++;
            } else {
                pos++;
            }
        }
        System.out.println();
        maxOf(neg, zero, pos);
    }

    private static void maxOf(int neg, int zero, int pos) {
        if (neg > zero && neg > pos) System.out.println("More -1");
        else if (zero > neg && zero > pos) System.out.println("More 0");
        else if (pos > zero && pos > neg) System.out.println("More +1");

    }
}
