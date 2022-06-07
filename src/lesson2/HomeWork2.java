package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("1. chisla chetnie ot - 100 do -50");
        for (int i = -100; i <= -50; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("2. chisla ot 10 do 30 v obratnom poryadke");
        for (int i = 30; i >= 10; i--) {

            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("3.kolichestvo chetnih chisel ot 30 do 60 ");
        int count = 0;
        for (int i = 30; i <= 60; i++) {
            if (i % 2 == 0) {
                count = count + 1;// count++
            }
        }
        System.out.print(count);


        System.out.println();
        System.out.println();
        System.out.println("4. skolko let sobirat 200 000 rub, esli kajdiy mes otkladivat po 9500 rub?");
        double summaNeed = 200000;
        int year = 12;
        int moneyMonth = 9500;
        int summaYear = year * moneyMonth; //114 000
        double akkountYears = summaNeed / summaYear;
        System.out.println(akkountYears);







        System.out.print ("5. chisla ot 20 do 60, krome ot 30 do 40");
        for (int i = 20; i <=60; i++) {
            if (i<30 || i >40 ) {

                System.out.print(i + " ");

            }
        }}}






