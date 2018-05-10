package part8;

// Выясните экспериментальным путём,
// начиная с какого элемента последовательности Фибоначчи,
// вычисление с использованием рекурсии становится неприемлемым
// (занимает более минуты по времени).

public class Task1_5 {
    public static void main(String[] args) {
        long startTime;
        for (int i=1; i<=50; i++){
            startTime=System.currentTimeMillis();
            fib(i);
            System.out.println("Time of calculation "+ i +" numbers Fibonacci is "+((System.currentTimeMillis()-startTime)/1000)+ " seconds");
        }
    }

    static long fib (int n) {
        if (n==1 || n == 2) {
            return 1;
        }
        return fib (n-2) + fib (n-1);
    }
}
