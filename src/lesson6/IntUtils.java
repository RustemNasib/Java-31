package lesson6;

import java.util.Scanner;

public class IntUtils {
    // 1) Входящими параметрами передаем 3 стороны треугольника, а метод должен печатать на консоль площадь
    public static void areaTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 сторону треугольника: ");
        String storona1 = scanner.nextLine();
        int a = Integer.parseInt(storona1);

        System.out.println("Введите 2 сторону треугольника: ");
        String storona2 = scanner.nextLine();
        int b = Integer.parseInt(storona2);

        System.out.println("Введите 3 сторону треугольника: ");
        String storona3 = scanner.nextLine();
        int c = Integer.parseInt(storona3);
        double pp = (a + b + c) / 2.0;  // полупериметр
        System.out.print("Ploshad treugolnika: " + Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));

        System.out.println();
    }

    // 2) Передаем в метод 4 числа, метод возвращает меньшее число из 4х
    public static int minimal(int a, int b, int c, int d) {

        if (a < b && a < c && a < d) {
            return a;
        }
        if (b < a && b < c && c < d) {
            return b;
        } else if (c < a && c < b && c < d) {
            return c;
        } else {
            return d;
        }

    }

    //3) Передаем в метод слово, метод должен напечатать на консоль это же слово, только большими полностью буквами
    public static String upText (String hello) {
        String word = " ";
        String text1 = word.toUpperCase();
            return text1;
    }


    /* 4) Передаем в метод три стороны треугольника, метод должен напечатать на консоль какой это треугольник:
    равносторонний, разносторонний или равнобедренный
    */
    public static void triangleFigure () {
        int a = 3;
        int b = 4;
        int c = 5;
        // равносторонний
        if (a==b && b==c && c==a){
            System.out.println("Eto ravnostoronniy treugolnik");
            // разносторонний треугольник
        }else if (a!=b && b!=c && c!=a){
            System.out.println("eto raznostoronniy treugolnik");
            // равнобедреный
        }else
            System.out.println("Eto ravnobedrenniy treugolnik");
        System.out.println();
        }

    }









