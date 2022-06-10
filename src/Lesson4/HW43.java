package Lesson4;

import java.util.Scanner;

public class HW43 {
    public static void main(String[] args) {
        // на сколько дней

        String[][] tours = {{"Turciya", "100000", "6 dney", "samolet"},
                {"Egipt", "150000", "5 dney", "samolet"},
                {"Egipt", "180000", "4 dney", "samolet"},
                {"Kareliya", "60000", "3 dney", "avtobus"},
                {"Baikal", "70000", "10 dney", "samolet"},
                {"Sohi", "90000", "5 dney", "avtobus"}};

        System.out.println("Na сколько дней вы хотите выбрать тур?");
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        int daysUser = Integer.parseInt(d);
        for (int i = 0; i < tours.length; i++) {
            int daysFromMass = Integer.parseInt(tours[i][2]);
            // Если 7, тогда подойдут 5-6-7-8-9
            if (daysFromMass >= daysUser - 2 && daysFromMass <= daysUser + 2) {
                System.out.printf("%s, %s rub, na %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
        System.out.println();
    }
}

