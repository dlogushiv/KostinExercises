package part4;

// в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза
// о количестве полных часов, содержащихся в n секундах.

// Примеры работы программы:
//        23466
//        Осталось 6 часов
//        10644
//        Осталось 2 часа
//        5891
//        Остался 1 час
//        1249
//        Осталось менее часа
public class Task4 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28800);
        System.out.println(n);
        n = (int) n / 3600;
        switch (n) {
            case 8:
            case 7:
            case 6:
            case 5:
                System.out.println("Осталось " + n + " часов");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Осталось " + n + " часа");
                break;
            case 1:
                System.out.println("Остался " + n + " час");
                break;
            default:
                System.out.println("Осталось менее часа");
        }


    }
}
