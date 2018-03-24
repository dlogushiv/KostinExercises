package part1;

// подсчет суммы цифр натурального трехзначного числа
public class Task4 {
    public static void main(String[] args) {
        int n = 111;
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = (n % 100) % 10;
        System.out.println(a + b + c);
    }
}
