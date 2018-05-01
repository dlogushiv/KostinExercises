package part7;

// Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и
// сообщите индекс его последнего вхождения в массив.
public class Task1_8 {
    public static void main(String[] args) {
        int max = -15;
        int a[] = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 32 - 16);
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == max) {
                System.out.println("\nLast index of max element = " + i);
                break;
            }
        }
    }
}
