package part7;

// Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
// Вывести массив на экран.

public class Task2_1 {
    public static void main(String[] args) {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
