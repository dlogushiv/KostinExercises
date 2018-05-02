package part7;

// Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
// указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
// После этого программа должна определить и сообщить пользователю о том,
// сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
// пока не будет указано корректное значение.

import java.util.Scanner;

public class Task1_11 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int input;
        int sumLeft = 0;
        int sumRight = 0;
        System.out.print("Please enter even integer number: ");
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            while (input % 2 != 0 || input < 2) {
                System.out.print("Please enter even integer number: ");
                input = scanner.nextInt();
            }
            System.out.println("You enter " + input + ". Your array:");
            int[] a = new int[input];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 12 - 6);
                System.out.print(a[i] + " ");
                //count sum of left part
                if (i < a.length / 2) {
                    sumLeft += Math.abs(a[i]);
                }
                // count sum of right part
                else {
                    sumRight += Math.abs(a[i]);
                }
                // on the last step check which sum is bigger
                if (i == a.length - 1) {
                    System.out.println();
                    if (sumLeft == sumRight) {
                        System.out.println("ABS sums of parts are equals and = " + sumLeft);
                    } else if (sumLeft > sumRight) {
                        System.out.println("ABS sum of left part is bigger and = " + sumLeft);
                    } else {
                        System.out.println("ABS sum of right part is bigger and = " + sumRight);
                    }
                }
            }
        } else {
            System.out.println("You enter not number!");
        }
    }
}
