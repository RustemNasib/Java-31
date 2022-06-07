package lesson8.HomeWork;

public class Pryamougolnik extends Kvadrat {
    private int b;

    public Pryamougolnik() {
    }

    public Pryamougolnik(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // периметр прямоугольника
    public int perimetr() {
        return (getA() + b) * 2;

    }

    // площадь прямоугольника
    public double square() {
        return getA() * b;

    }

    //углы прямоугольника
    public String injection() {
        return "90 градусов";
    }

    //высота прямоугольника
    public int rectangleHeight() {
        return (getA() * b) / getA();
    }


    //метод, который будет печатать на консоль всю информацию о прямоугольнике
    public String printInfo() {
        String figure = "прямоугольник";
        double perimetr = (getA() + b) * 2;
        double square = getA() * b;
        double height = (getA() * b) / getA();

        return (("Название: " + figure + "; ") + (("Периметр: ") + perimetr + "; ") + (("Площадь: ") + square + "; ") + (("Высота: ") + height + "; "));
        // return printInfo().toString();

          }

          public void form () {
            System.out.println("Я прямоугольный");

        }
    }
