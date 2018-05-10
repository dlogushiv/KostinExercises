package part8;

// Создать статический метод, который будет иметь два целочисленных параметра a и b,
// и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
// C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.

public class Task1_1{
    public static void main(String[] args) {
        int a=1;
        int b=15;
        int [] array = new int[20];

        for (int i=0;i<array.length ;i++ ) {
            array[i]=numGen(a,b);
            // for control
            //  if (array[i]<a || array[i]>b){
            //      System.out.print("ERR -> ");
            //  }
            //  if (array[i]==a || array[i]==b) {
            //      System.out.print("OK->");
            //  }
            System.out.print(array[i]+" ");
        }
    }

    public static int numGen(int a, int b){
        if(a>=0){
            return (int)(Math.random()*((b-a)+1)+a);
        } else{
            return (int)(Math.random()*((b-a)+2)+a-1);
        }
    }
}