package part7;

// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше
// (либо сообщите, что их средние арифметические равны).
public class Task1_5 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 6);
            System.out.print(arr1[i] + " ");
            sum1 += arr1[i];
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 6);
            System.out.print(arr2[i] + " ");
            sum2 += arr2[i];
        }
        System.out.println();
        if (sum1 == sum2) {
            System.out.println("Middle arithmetic are equals.");
        } else if (sum1 / arr1.length > sum2 / arr2.length) {
            System.out.println("Middle arithmetic of first array is bigger.");
        } else {
            System.out.println("Middle arithmetic of second array is bigger.");
        }
    }
}
