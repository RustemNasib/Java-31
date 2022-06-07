package lesson7;

public class Triangle {

    private int a;
    private int b;
    private int c;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    // периметр треугольника
    public int perimetr() {
        return this.a + this.b + this.c;

    }

    // Задачи
    // 1- вернуть площадь треугольника
    public double square() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

    }

    //2- напечатать на консоль углы треугольника
    public String angle() {
        double Alfa = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
        double Betta = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        double Yotta = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));

        return (("Угол Альфа: " + Alfa + "; ") + ("Угол Бетта: " + Betta + "; ") + ("Угол Йотта: " + Yotta + "; "));
    }

    //3- вернуть высоту треугольника
    public double triangleHeight() {
        double pp = (a + b + c) / 2.0;
        return 2 * Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }


    //4 - метод, который будет печатать на консоль всю информацию о треугольнике
    public String printInfo() {
        String figure = "треугольник";
        double perimetr = a + b + c;
        double pp = (a + b + c) / 2.0;
        double square = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        double height = 2 * Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

        return (("Название: " + figure + "; ") + (("Периметр: ") + perimetr + "; ") + (("Полупериметр: ") + pp + "; ") + (("Площадь: ") + square + "; ") + (("Высота: ") + height + "; "));
        // return printInfo().toString();
    }

    //5- метод, который будет определять какой это вид треугольника

    public String triangleShape() {

        // равносторонний
        String ravnostor = "равносторонний";
        if (a == b && b == c && c == a) {
            return ravnostor;
        }
        // разносторонний треугольник
        String raznostor = "разносторонний";
        if (a != b && b != c && c != a) {
            return raznostor;
        }
        // равнобедреный
        String ravnobedr = "равнобедренный";
        if (a == b && b != c && c != a) {
            return ravnobedr;
        }
        return triangleShape();
    }
    // На подобии класса Треугольник создать классы: прямоугольник, квадрат, круг, овал
    // и сделать в них все тоже самое
}







