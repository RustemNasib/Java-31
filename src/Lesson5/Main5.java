package Lesson5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /**
         * Есть текст, (email от пользователя).
         * нужно понять валидный он или нет
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой e-mail: ");
        String email = scanner.nextLine();

        // если не содержит собачку

        if (!email.contains("@")) {
            System.out.println("E-mail не содержит собачку!!!");
            return;// System.exit(0);


            // 2 - содержание пробелов
            // 3 - что бы содержалась только одна собачка
            // 4 - что бы не начиналось на спец символ
            // 5 - что бы во второй части была точка
            // и др.
        }
        // не должен содержать пробелов
        String email1 = "dfsdfs@fdfs";
        if (email.contains(" ")) {
            System.out.println("E-mail содержит пробелы");
            return;
        }
        // должна содержаться только одна собачка
        String[] partsByDog = email.split("@");
        if (partsByDog.length != 2) {
            System.out.println("E-mail содержит более одной @.");
            return;
        }
        //что бы не начаналась с символов
        String partsBeforeDog = partsByDog[0];
        String[] symbols = {".", "#", "$", "%", "&", "'", "*", "+", "-", "/", ",", "(", ")", "=", "?", "^", "_", "`", "{", "|", "}", "~"};
        if (partsBeforeDog.startsWith("symbols")) {
            System.out.println("E-mail не корректный.");
            return;
        }
        // что бы не заканчивалось символами
        String partsAfterDog = partsByDog[1];
        String[] symbols1 = {".", "#", "$", "%", "&", "'", "*", "+", "-", "/", "=", "?", "^", "_", "`", "{", "|", "}", "~"};
        if (partsAfterDog.endsWith("symbols1")) {
            System.out.println("E-mail не корректный.");
            return;
        }
        // чтобы во второй части была точка
        String partsAfterDog1 = partsByDog[1];
        if (partsAfterDog.endsWith(".")) {
            System.out.println("E-mail корректный.");
            return;
        }


    }
}





