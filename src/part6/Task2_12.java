package part6;

import java.util.Scanner;

// Для введённого пользователем с клавиатуры натурального числа
// посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
public class Task2_12 {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter natural number: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("You entered negative number!");
            } else {
                while (a >= 1) {
                    sum = sum + a % 10;
                    a = a / 10;
                }
                System.out.println(sum);
            }
        } else {
            System.out.println("Input haven't integer number!");
        }
    }
}
