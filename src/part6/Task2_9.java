package part6;

// Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
// Постарайтесь не выполнять лишних действий (например, после того, как вы нашли
// хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
// Также учтите, что наименьший делитель натурального числа n, если он вообще имеется,
// обязательно располагается в отрезке [2; √n].

import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        int a;
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number and I will check whether it is simple: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    System.out.println("Your number is not simple!");
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Your number is simple!");
            }
        } else {
            System.out.println("Input haven't integer number!");
        }
    }
}
