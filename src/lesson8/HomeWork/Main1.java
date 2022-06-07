package lesson8.HomeWork;

public class Main1 {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();
        Pryamougolnik pryamougolnik = new Pryamougolnik();


        int perim = kvadrat.perimetr();
        System.out.println("Периметр квадрата: " + perim);

        double sqrt = kvadrat.squar();
        System.out.println("Площадь квадрата: " + sqrt);

        String injection = kvadrat.injection();
        System.out.println("Угол квадрата: " + injection);

             String info = kvadrat.printInfo();
        System.out.println("Информация: " + info);

        int perim1 = pryamougolnik.perimetr();
        System.out.println("Периметр прямогольника: " + perim1);

        double sqrt1 = pryamougolnik.square();
        System.out.println("Площадь прямоугольника: " + sqrt1);

        String injection1 = pryamougolnik.injection();
        System.out.println("Угол прямоугольника: " + injection1);

        double height = pryamougolnik.rectangleHeight();
        System.out.println("Высота прямоугольника: " + height);


        String info1 = pryamougolnik.printInfo();
        System.out.println("Информация: " + info1);

    }


}