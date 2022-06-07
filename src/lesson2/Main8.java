package lesson2;

public class Main8 {
    public static void main(String[] args) {
        //сколько мы заберем в банке через 5 лет, если отдадим 100 тр на депозит под 18% годовых?
        // Проценты прибавляются к телу депозита ежемесячно
        double money = 100000;
        int years = 5;
        int procent = 18;

        for (int month = 0; month < 12 * years; month++) {
            money = money + ((money / 100 * procent) / 12);
        }
        System.out.println(money);
    }
}
