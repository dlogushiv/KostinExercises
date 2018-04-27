package part6;

import java.util.Scanner;

// Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
// инфо: 0! и 1! = 1
public class Task2_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число и я посчитаю его факториал: ");
        boolean flag = false;
        int a;
        int sum = 1;
        while (flag!=true); {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a < 0) {
                    System.out.print("Введите положительное число: ");
                } else {
                    if (a > 1) {
                        for (int i = 1; i <= a; i++) {
                            sum *= i;
                        }
                    }
                    flag = true;
                    System.out.println("Факториал числа " + a + " равен " + sum);
                }
            } /*else {
                System.out.println("Вы ввели не число! Попробуйте еще раз: ");
                // flag = false;
            }*/
        } ;//while (flag != true);
    }
}
