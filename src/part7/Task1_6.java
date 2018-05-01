package part7;

// Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class Task1_6 {
    public static void main(String[] args) {
        int a[] = new int[4];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 90 + 10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                counter++;
            } else break;
        }
        if (counter == 3) {
            System.out.println("Array is strictly increasing!");
        }
    }
}
