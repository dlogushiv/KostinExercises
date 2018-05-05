package part7;

/*  Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
    Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке
    стоял её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять
    элементы в рамках одной строки. Порядок остальных элементов строки не важен
    (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
    Вывести преобразованный массив на экран.
*/

public class Task2_4 {
    public static void main(String[] args) {
        int[][] a = new int[6][7];
        // array generation
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // finding max in the rows and moves it to the first position
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            int maxPos = 0;
            int temp = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxPos = j;
                }
                a[i][0] = max;
                a[i][maxPos] = temp;
            }
//            System.out.println("elements " + (maxPos + 1) + " end 1 will be reversed");     //for control
        }
        // printing converted array
        System.out.println("Converted array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
