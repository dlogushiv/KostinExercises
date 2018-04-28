package part6;

//Электронные часы показывают время в формате от 00:00 до 23:59.
// Подсчитать сколько раз за сутки случается так, что слева от двоеточия
// показывается симметричная комбинация для той, что справа от двоеточия
// (например, 02:20, 11:11 или 15:51).
public class Task2_15 {
    public static void main(String[] args) {
        int counter=0;
        int hours=23;
        int minutes=59;
        for (int h=0;h<=hours;h++){
            for (int m=0;m<=minutes;m++){
                String sH=Integer.toString(h);
                String sM=Integer.toString(m);
                if (sH.indexOf(0)==sM.indexOf(1)&&sH.indexOf(1)==sM.indexOf(0)){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
