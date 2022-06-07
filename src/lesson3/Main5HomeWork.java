package lesson3;

import java.util.Scanner;

public class Main5HomeWork {
    public static void main(String[] args) {
        // консольное приложение по рассчету площади и периметра разных фигур

        System.out.println("Viberite figuru:");
        System.out.println("1 - Kvadrat");
        System.out.println("2 - Pryamougolnik");
        System.out.println("3 - Treugolnik");
        System.out.println("4 - Trapeciya");
        System.out.println("5 - Oval");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("Kvadrat")) {
            System.out.println("Vvedite storonu kvadrata: ");
            String storona = scanner.nextLine();
            // 34 ---> int
            int a = Integer.parseInt(storona);
            System.out.println("Perimetr kvadrata: " + (a + a + a + a));
            System.out.println("Ploshad kvadrata: " + (a * a));
        }
        if (figura.equals("2") || figura.equalsIgnoreCase("Pryamougolik")) {
            System.out.println("Vvedite dlinnu pryamougolnika: ");
            String dlinna = scanner.nextLine();
            int a = Integer.parseInt(dlinna);
            System.out.println("Vvedite shirinu pryamougolnika: ");
            String shirina = scanner.nextLine();
            int b = Integer.parseInt(shirina);
            System.out.println("Perimetr pryamougolnika: " + (a + b) * 2);
            System.out.println("Ploshad pryamougolnika: " + (a * b));
        }
        if (figura.equals("3") || figura.equalsIgnoreCase("Treugolnik")) {
            System.out.println("Vvedite 1 storonu treugolnika: ");
            String storona1 = scanner.nextLine();
            int a = Integer.parseInt(storona1);
            System.out.println("Vvedite 2 storonu treugolnika: ");
            String storona2 = scanner.nextLine();
            int b = Integer.parseInt(storona2);
            System.out.println("Vvedite 3 storonu treugolnika: ");
            String storona3 = scanner.nextLine();
            int c = Integer.parseInt(storona3);
            double pp = (a + b + c) / 2.0;  // полупериметр
            System.out.println("Perimetr treugolnika: " + (a + b + c));
            System.out.println("Ploshad treugolnika: " + Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));
        }
        if (figura.equals("4") || figura.equalsIgnoreCase("Trapeciya")) {
            System.out.println("Vvedite verh trapecii: ");
            String verh = scanner.nextLine();
            int a = Integer.parseInt(verh);
            System.out.println("Vvedite niz trapecii: ");
            String niz = scanner.nextLine();
            int b = Integer.parseInt(niz);
            System.out.println("Vvedite 1 storonu trapecii: ");
            String storona1 = scanner.nextLine();
            int c = Integer.parseInt(storona1);
            System.out.println("Vvedite 2 storonu trapecii: ");
            String storona2 = scanner.nextLine();
            int d = Integer.parseInt(storona2);
            System.out.println("Perimetr trapecii: " + (a + b + c + d));
            System.out.println("Ploshad trapecii: " + (((a + b) * Math.sqrt(c * c -
                    Math.pow((Math.pow(b - a, 2) + c * c - d * d) / (2 * (b - a)), 2))) / 2));
            // или S = 1/2*a*b*h, где a, b - основания трапеции, h - высота (тогда нужно спросить высоту)
        }

        if (figura.equals("5") || figura.equalsIgnoreCase("Oval")) {
            System.out.println("Vvedite razmer maloy poluosi: ");
            String mpo = scanner.nextLine();
            double a = Double.parseDouble (mpo);
            System.out.println("Vvedite razmer bolshoy poluosi: ");
            String bpo = scanner.nextLine();
            double b = Double.parseDouble (bpo);

            System.out.println("Okrujnost ovala: " + (4 * (Math.PI * a * b + (a - b) * (a - b)) / (a + b)));
            System.out.println("Ploshad ovala: " + (Math.PI * a * b));
        }
    }
}

