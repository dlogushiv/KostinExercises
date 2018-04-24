package part6;

// Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class Task2_3 {
    public static void main(String[] args) {
        int i=90;
        while (i>=0){
            System.out.print(i+" ");
            i-=5;
        }
    }
}
