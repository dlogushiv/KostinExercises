package part2;

// вычислить косинусы углов 60; 45; 40 градусов не используя toDegree
public class task1 {
    public static void main(String[] args) {
        int a=60;
        int b=45;
        int c=40;
        System.out.println(Math.cos(toRad(a)));
        System.out.println(Math.cos(toRad(b)));
        System.out.println(Math.cos(toRad(c)));

    }
    private static double toRad(int a){
        return a*Math.PI/180;
    }
}
