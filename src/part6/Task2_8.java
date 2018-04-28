package part6;

import java.util.Scanner;

// Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
public class Task2_8 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите натуральное число и я выведу его положительные делители: ");
        if (input.hasNextInt()) {
            a = input.nextInt();
            System.out.print("Делители Вашего числа: ");
            for (int i = 1; i <= Math.abs(a); i++) {
                if (a % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Вы ввели не число! Пока!");
        }
    }
}
