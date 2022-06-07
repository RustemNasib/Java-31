package Lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
// программа, которая будет работать 10 лет, если ее не остановить
        // а когда мы ее остановим, она нам напишет сколько конкретно со старта прошло лет, часов, минут, секунд

        for (int year = 0; year < 10; year++) {
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < 31; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int min = 0; min < 60; min++) {
                            for (int sec = 0; sec < 60; sec++) {
                                System.out.printf("So starta proshlo: %d god, %d mes, %d dnya, %d chasa, %d min, %d sek \n", year, month, day, hour, min, sec);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
