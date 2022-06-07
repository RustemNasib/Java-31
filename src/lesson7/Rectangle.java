package lesson7;

public class Rectangle {
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



    // периметр прямоугольника
    public int perimetr() {
        return (a + b) * 2;

    }

    // площадь прямоугольника
    public double square() {
        return a * b;

    }

    //углы прямоугольника
    public String injection() {
        return "90 градусов";
    }

    //высота прямоугольника
    public int rectangleHeight() {
        return (a * b) / a;
    }


    //метод, который будет печатать на консоль всю информацию о прямоугольнике
    public String printInfo() {
        String figure = "прямоугольник";
        double perimetr = (a + b)*2;
        double square = a * b;
        double height = (a * b) / a;

        return (("Название: " + figure + "; ") + (("Периметр: ") + perimetr + "; ") + (("Площадь: ") + square + "; ") + (("Высота: ") + height + "; "));
        // return printInfo().toString();
    }

}


