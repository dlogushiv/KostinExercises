package part6;

// Электронные часы показывают время в формате от 00:00 до 23:59.
// Подсчитать сколько раз за сутки случается так, что слева от двоеточия
// показывается симметричная комбинация для той, что справа от двоеточия
// (например, 02:20, 11:11 или 15:51).
public class Task2_15 {
    public static void main(String[] args) {
        int counter = 0;
        int hours = 23;
        int minutes = 59;
        String sH, sM;
        for (int h = 0; h <= hours; h++) {
            for (int m = 0; m <= minutes; m++) {
                if (h < 10) {
                    sH = "0" + Integer.toString(h);
                } else {
                    sH = Integer.toString(h);
                }
                if (m < 10) {
                    sM = "0" + Integer.toString(m);
                } else {
                    sM = Integer.toString(m);
                }
                if (sH.charAt(0) == sM.charAt(1) && sH.charAt(1) == sM.charAt(0)) {
                    counter++;
                    //System.out.println(sH + ":" + sM + " - " + counter);
                }
            }
        }
        System.out.println(counter);
    }
}
