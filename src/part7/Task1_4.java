package part7;

// Создайте массив из 8 случайных целых чисел из отрезка [1;10].
// Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль.
// Снова выведете массив на экран на отдельной строке.
public class Task1_4 {
    public static void main(String[] args) {
        int a[] = new int[8];
        for (int i=0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
