package part5;

// Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.Создать программу, которая будет сообщать,
// является ли целое число, введённое пользователем, чётным или нечётным.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter INTEGER number: ");
        if (scanner.hasNextInt()) {
            if(scanner.nextInt()%2==1)
                System.out.println("Number isn't even.");
            else
                System.out.println("Number is even.");
        } else
            System.out.println("ERROR. You entered not integer number.");
    }
}
