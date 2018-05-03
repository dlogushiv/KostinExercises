package part7;

// Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

import java.util.Scanner;

public class Task1_13 {
    public static void main(String[] args) {
        int n;
        int[] firstArray;
        int[] secondArray;
        int evenCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number bigger that 3: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            while (n <= 3) {
                System.out.print("Please enter integer number bigger that 3: ");
                n = scanner.nextInt();
            }
            firstArray = new int[n];
            System.out.print("First array:  ");
            // generate, print andcount even numbers in the first array
            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] = (int) (Math.random() * (n + 1));
                System.out.print(firstArray[i] + " ");
                if (firstArray[i] % 2 == 0) {
                    evenCounter++;
                }
            }
            System.out.print("\nSecond array: ");
            // checking quantity of even number in the firs array
            if (evenCounter != 0) {
                secondArray = new int[evenCounter];
                int j = 0;
                // copy only even numbers from a first to second array
                for (int i = 0; i < firstArray.length; i++) {
                    if (firstArray[i] % 2 == 0) {
                        secondArray[j] = firstArray[i];
                        System.out.print(secondArray[j] + " ");
                        j++;
                    }
                }
            } else {
                System.out.println("There is no one even number in the first array.");
            }
        } else {
            System.out.println("You enter not a number! Try next time!");
        }
    }
}
