package part1;

// округление вещественного числа до ближайшего целого
public class Task3 {
    public static void main(String[] args) {
        double n = 6.55;
//        if (n % 1 < 0.5) {
//            System.out.println((int) n);
//        } else {
//            System.out.println((int) (n + 1));
//        }
        System.out.println(n%1<0.5?(int)n:(int)(n+1));  // refactoring
    }
}
