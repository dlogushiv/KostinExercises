package part7;

// Для проверки остаточных знаний учеников после летних каникул,
// учитель младших классов решил начинать каждый урок с того,
// чтобы задавать каждому ученику пример из таблицы умножения,
// но в классе 15 человек,а примеры среди них не должны повторяться.
// В помощь учителю напишите программу, которая будет выводить на экран
// 15 случайных примеров из таблицы умножения
// (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
// При этом среди 15 примеров не должно быть повторяющихся
// (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

public class Task2_5 {
    public static void main(String[] args) {
        int[][] a = new int[15][2];
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 8 + 2);
            }
            for (int g = 0; g < i; g++) {
                if (i > 0 && a[i][0] * a[i][1] == a[g][0] * a[g][1]) {
                    if (a[i][0] == a[g][0] || a[i][0] == a[g][1]) {
                        // next print - for control
                        //System.out.println("Test #" + (i + 1) + ": " + a[i][0] + " * " + a[i][1] + " = " + (a[i][0] * a[i][1]) + " identical with Test #" + (g + 1) + ". Will try again");
                        --i;
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println("Test #" + (i + 1) + ": " + a[i][0] + " * " + a[i][1]);
                // next print - for output test result
                //System.out.println("         result " + (a[i][0] * a[i][1]));
            }
        }
    }
}
