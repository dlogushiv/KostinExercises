package part5;

// Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
// Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.print("Enter INTEGER number 1: ");
        if (sc1.hasNextInt())
            a = sc1.nextInt();
        else {
            System.out.println("ERROR. You entered not integer number.");
            return;
        }
        System.out.print("Enter INTEGER number 2: ");
        if (sc2.hasNextInt())
            b = sc2.nextInt();
        else {
            System.out.println("ERROR. You entered not integer number.");
            return;
        }
        System.out.println("Sum of your numbers is: " + (a + b));
    }
}
