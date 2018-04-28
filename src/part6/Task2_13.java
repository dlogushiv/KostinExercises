package part6;

// В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
// Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
// «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
// как, например, в билетах с номерами 003102 или 567576.
// Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
// как много сувениров потребуется.
// С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
public class Task2_13 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 999999; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            int numLeft = i / 1000;
            int numRight = i % 1000;
            while (numLeft >= 1) {
                sumLeft = sumLeft + numLeft % 10;
                numLeft = numLeft / 10;
            }
            while (numRight >= 1) {
                sumRight = sumRight + numRight % 10;
                numRight = numRight / 10;
            }
            if (sumLeft == sumRight) {
                //System.out.println(i + " = " + i / 1000 + "  " + i % 1000 + " = " + sumLeft + " and " + sumRight);
                counter++;
            }
        }
        System.out.println("The quantity of Lucky tickets = " + counter);
    }
}
