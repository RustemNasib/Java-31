package lesson8.HomeWork;

public class Kvadrat  {

 private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // периметр квадрата
    public int perimetr() {
        return a * 4;
    }
    // площадь квадрата
    public double squar() {
        return a * a;
    }
    //углы квадрата
    public String injection() {
        return "90 градусов";
    }


    //метод, который будет печатать на консоль всю информацию о квадрате
    public String printInfo() {
        String figure = "'Квадрат'";
        double perimetr = a * 4;
        double squar = a * a;


        return (("Название: " + figure + "; ") + (("Периметр: ") + perimetr + "; ") + (("Площадь: ") + squar + "; "));
        // return printInfo().toString();
    }
    public void form (){

        System.out.println("Я квадратный");

}
}


