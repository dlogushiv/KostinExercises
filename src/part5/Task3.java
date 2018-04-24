package part5;

import java.util.Scanner;

// Создать программу, которая будет выводить на экран
// меньшее по модулю из трёх введённых пользователем вещественных чисел.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, min;
        System.out.print("Please, enter number 1: ");
        if (scanner.hasNextDouble()) {
            n1 = scanner.nextDouble();
        } else {
            System.out.println("Enter error");
            return;
        }
        System.out.print("Please, enter number 2: ");
        if (scanner.hasNextDouble()) {
            n2 = scanner.nextDouble();
        } else {
            System.out.println("Enter error");
            return;
        }
        System.out.print("Please, enter number 3: ");
        if (scanner.hasNextDouble()) {
            n3 = scanner.nextDouble();
        } else {
            System.out.println("Enter error");
            return;
        }
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        if (min > n3) {
            min = n3;
        }
        System.out.println("Minimal of your numbers is: " + min);
    }
}
