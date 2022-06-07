package lesson7;

public class MainSquare {

    public static void main(String[] args) {
        Square square = new Square();
        square.setA(4);
        square.setB(4);



        int perim = square.perimetr();
        System.out.println("Периметр квадрата: " + perim);

        double sqrt = square.squar();
        System.out.println("Площадь квадрата: " + sqrt);

        String injection = square.injection();
        System.out.println("Угол квадрата: " + injection);

        double height = square.squareHeight();
        System.out.println("Высота квадрата: " + height);


        String info = square.printInfo();
        System.out.println("Информация: " + info);

    }
}
