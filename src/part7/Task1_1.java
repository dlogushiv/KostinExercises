package part7;

// Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
// сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
// (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.
// 2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20
public class Task1_1 {
    public static void main(String[] args) {
        int a[]=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=2*(i+1);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
