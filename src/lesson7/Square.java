package lesson7;

public class Square {
    private int a;
    private int b;

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

    // периметр квадрата
    public int perimetr() {
        return (a + b) * 2;
    }
    // площадь квадрата
    public double squar() {
        return a * b;
    }
    //углы квадрата
    public String injection() {
        return "90 градусов";
    }

    //высота квадрата
    public int squareHeight() {
        return (a * b) / a;
    }

    //метод, который будет печатать на консоль всю информацию о квадрате
    public String printInfo() {
        String figure = "'Квадрат'";
        double perimetr = (a + b) * 2;
        double squar = a * b;
        double height = (a * b) / a;

        return (("Название: " + figure + "; ") + (("Периметр: ") + perimetr + "; ") + (("Площадь: ") + squar + "; ") + (("Высота: ") + height + "; "));
        // return printInfo().toString();
    }
}
