package part6;

// Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task2_2 {
    public static void main(String[] args) {
        int n=1;
        int i=1;
        while (n<=55){
            System.out.print(i+" ");
            i+=2;
            n++;
        }
    }
}
