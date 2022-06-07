package Lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Turciya", "100000", "6 dney", "samolet"},
                {"Egipt", "150000", "5 dney", "samolet"},
                {"Egipt", "180000", "4 dney", "samolet"},
                {"Kareliya", "60000", "3 dney", "avtobus"},
                {"Baikal", "70000", "10 dney", "samolet"},
                {"Sohi", "90000", "5 dney", "avtobus"}};

        System.out.println("Na kakoy budjet vi raschitivaete?");
        // 70000 - выводим +- 15000 от той цены, что он хочет

        Scanner scanner = new Scanner(System.in);
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr); // 80000  +-15000

        for (int i = 0; i < tours.length; i++) {
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr); // 40 000
            if (money + 15000 >= priceFromCurrentTour && money - 15000 <= priceFromCurrentTour) {
                System.out.printf("%s, %s rub, na %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }

        }
        System.out.println("В какую страну хотите выбрать тур?");

        Scanner scanner1 = new Scanner(System.in);
        String country = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {

            if (country.equals(tours[i][0])) {

                System.out.printf("%s, %s rub, na %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
        // 1. напечатать все туры в .... страну
        // 2. напечатать все туры в .... страну .... транспортом
        // 3. напечатать среднюю стоимость поездки в любую страну
        // 4. напечатать все туры от .... до ... дней
        // 5. напечатать туры на ваш взгляд привлекательные покупателю

    }


}


