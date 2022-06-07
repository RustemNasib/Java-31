package lesson7;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRad(2.1);



        double perim = circle.perimetr();
        System.out.println("Длинна окружности: " + perim);

        double sqrt = circle.squar();
        System.out.println("Площадь круга: " + sqrt);

        String info = circle.printInfo();
        System.out.println("Информация: " + info);
    }
}
