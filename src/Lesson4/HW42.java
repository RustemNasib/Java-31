package Lesson4;

import java.util.Scanner;

public class HW42 {
    public static int main(String[] args) {
        // средн€€ стоимость поездок в страну
        String[][] tours = {{"Turciya", "100000", "6 dney", "samolet"},
                {"Egipt", "150000", "5 dney", "samolet"},
                {"Egipt", "180000", "4 dney", "samolet"},
                {"Kareliya", "60000", "3 dney", "avtobus"},
                {"Baikal", "70000", "10 dney", "samolet"},
                {"Sochi", "90000", "5 dney", "avtobus"}};

        System.out.println("—редн€€ стоимость какой страны вам интересна?");
        Scanner scanner = new Scanner(System.in);
        String countryAveragePrice = scanner.nextLine();

        int count = 0;
        int amountPrice = 0;
        for (int i = 0; i < tours.length; i++) {
            if (countryAveragePrice.equals(tours[i][0])) {
                count++; //count=count+1
                amountPrice += Integer.parseInt(tours[i][1]); //amountPrice = amountPrice + Integer.parseInt(mass[i][1]);
            }
        }
        int averagePrice = amountPrice / count;
        System.out.println(averagePrice);
        return count;
    }
}
















