package part7;

// Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Task1_3 {
    public static void main(String[] args) {
        int a[] = new int[15];
        int evenCounter = 0;
        for (int i : a) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
            if (a[i] != 0 && a[i] % 2 == 0) {
                evenCounter++;
            }
        }
        System.out.println("\nQuantity of even numbers on array = " + evenCounter);
    }
}
