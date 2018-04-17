package part2;

// определить кол-во цифр в натур. полож. числе
public class Task3 {
    public static void main(String[] args) {
        int n = -25;
        int res = 1;
        if (n < 0) {
            System.out.println("Error! n<0");
        } else if (n < 10) {
            System.out.println("Number " + n + " has 1 number.");
        } else {
            System.out.print("Number " + n);
            while (n >= 10) {
                n = n / 10;
                res++;
            }
            System.out.println(" has " + res + " numbers.");
        }
    }
}
