package part7;

// Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
// Вывести массив на экран. После на отдельной строке вывести на экран значение
// максимального элемента этого массива (его индекс не имеет значения).

public class Task2_2 {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 199 - 99);
                System.out.print(a[i][j] + " ");
                if (i == 0 && j == 0) {
                    max = a[i][j];
                } else if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max element in an array: " + max);
    }
}
