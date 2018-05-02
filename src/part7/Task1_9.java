package part7;

// Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
// с i-ым индексом к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке),
// затем вывести количество целых элементов в третьем массиве.

public class Task1_9 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        float c[] = new float[10];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9 + 1);
            b[i] = (int) (Math.random() * 9 + 1);
            c[i] = (float) a[i] / (float) b[i];
            if (a[i] % b[i] == 0) {
                counter++;
            }
        }
        print(a);
        print(b);
        print(c);
        System.out.println("Quantity of integer number(s) in third array = " + counter);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("  "+a[i] + "   ");
        }
        System.out.println();
    }

    private static void print(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.3f",a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
