package part6;

// В американской армии считается несчастливым число 13, а в японской — 4.
// Перед международными учениями штаб российской армии решил исключить номера боевой техники,
// содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
// чтобы не смущать иностранных коллег.
// Если в распоряжении армии имеется 100 тыс. единиц боевой техники и
// каждая боевая машина имеет номер от 00001 до 99999, то
// сколько всего номеров придётся исключить?
public class Task2_16 {
    public static void main(String[] args) {
        int counter = 0;
        String number;
        for (int i = 1; i < 100000; i++) {
            number = Integer.toString(i);
            if (number.indexOf('4') != -1) {
                counter++;
                System.out.println(i);
            } else if (number.indexOf('1') != -1 && number.indexOf('1') + 1 == number.indexOf('3')) {
                counter++;
                System.out.println(i);
            }
//  Вариант не учитывает №00004 ((
//            for (int j = 0; j < number.length() - 1; j++) {
//                if (number.charAt(j) == '4'  || (number.charAt(j) == '1' && number.charAt(j + 1) == '3')) {
//                    counter++;
//                    System.out.println(i);
//                    break;
//                }
//            }
        }
        System.out.println(counter);
    }
}
