package Lesson4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        // выбор тура


        String[][] tours = {{"Turciya", "100000", "6 dney", "samolet"},
                {"Egipt", "150000", "5 dney", "samolet"},
                {"Egipt", "180000", "4 dney", "samolet"},
                {"Kareliya", "60000", "3 dney", "avtobus"},
                {"Baikal", "70000", "10 dney", "samolet"},
                {"Sochi", "90000", "5 dney", "avtobus"}};

        System.out.println("В какую страну Вы хотите выбрать тур?");

        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {

            if (country.equals(tours[i][0])) {

                System.out.printf("%s, %s rub, na %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
    }
}


