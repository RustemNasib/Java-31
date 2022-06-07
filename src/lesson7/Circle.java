package lesson7;

public class Circle {

private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    // окружность
    public double perimetr() {

        return  2 * Math.PI *rad;
    }
    // площадь круга
    public double squar() {

        return Math.PI * (rad * rad);
    }

    //метод, который будет печатать на консоль всю информацию о круге
    public String printInfo() {
        String figure = "'Круг'";
        double perimetr = 2 * Math.PI *rad;
        double squar = Math.PI * (rad * rad);


        return (("Название: " + figure + "; ") + (("Окружность: ") + perimetr + "; ") + (("Площадь: ") + squar + "; "));
        // return printInfo().toString();
    }
}
