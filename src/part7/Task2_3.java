package part7;

// Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
// Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.

public class Task2_3 {
    public static void main(String[] args) {
        int maxMult = 0;
        int maxMultPosition = 0;
        int[][] a = new int[7][4];
        int[] mult = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int rowMult = 1;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 12 - 6);
                System.out.print(a[i][j] + " ");
                rowMult *= Math.abs(a[i][j]);
            }
            mult[i] = rowMult;
            System.out.println();
//            System.out.println(" mult="+rowMult);     //for compare
        }
        for (int i = 0; i < mult.length; i++) {
            if (i == 0) {
                maxMult = mult[i];
                maxMultPosition = i;
            } else if (mult[i] > maxMult) {
                maxMult = mult[i];
                maxMultPosition = i;
            }
        }
        System.out.println("The number of row with max ABS elements multiplication is " + (maxMultPosition + 1));
    }
}
