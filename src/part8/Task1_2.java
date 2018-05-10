package part8;

// Создать метод, который будет выводить указанный массив на экран в строку.
// С помощью созданного метода и метода из предыдущей задачи
// заполнить 5 массивов из 10 элементов каждый случайными числами и
// вывести все 5 массивов на экран, каждый на отдельной строке.

public class Task1_2 {
    public static void main(String[] args) {
        int arrLength=10;
        int a=-30;
        int b=40;
        int[] array1=new int[arrLength];
        int[] array2=new int[arrLength];
        int[] array3=new int[arrLength];
        int[] array4=new int[arrLength];
        int[] array5=new int[arrLength];

        for (int i=0; i<arrLength; i++){
            array1[i]=Task1_1.numGen(a,b);
            array2[i]=Task1_1.numGen(a,b);
            array3[i]=Task1_1.numGen(a,b);
            array4[i]=Task1_1.numGen(a,b);
            array5[i]=Task1_1.numGen(a,b);
        }

        printArray(array1);
        printArray(array2);
        printArray(array3);
        printArray(array4);
        printArray(array5);
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length; i++ ) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
