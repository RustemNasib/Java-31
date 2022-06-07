package lesson7;

public class MainRectangle {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setA(3);
        rectangle.setB(4);


        int perim = rectangle.perimetr();
        System.out.println("Периметр прямогольника: " + perim);

        double sqrt = rectangle.square();
        System.out.println("Площадь прямоугольника: " + sqrt);

        String injection = rectangle.injection();
        System.out.println("Угол прямоугольника: " + injection);

        double height = rectangle.rectangleHeight();
        System.out.println("Высота прямоугольника: " + height);


        String info = rectangle.printInfo();
        System.out.println("Информация: " + info);



    }
}