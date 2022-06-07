package lesson7;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle treugolnik = new Triangle();
        treugolnik.setA(3);
        treugolnik.setB(4);
        treugolnik.setC(5);


        int perim = treugolnik.perimetr();
        System.out.println("Периметр треугольника: " + perim);

        double sqrt = treugolnik.square();
        System.out.println("Площадь треугольника: " + sqrt);

        String angles = treugolnik.angle();
        System.out.println(angles);

        double height = treugolnik.triangleHeight();
        System.out.println("Высота треугольника: " + height);


        String info = treugolnik.printInfo();
        System.out.println("Информация: " + info);

        System.out.print("Вид треугольника: " + treugolnik.triangleShape());


    }


}
