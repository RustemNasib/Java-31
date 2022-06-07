package lesson9;

public class Oval extends Krug {
    private int radius2;

    // super.      - вызываем МЕОТОД родителя
    // super (     - вызываем КОНСТРУКТОР родителя

    public Oval() {

    }

    public Oval(int rsdius1, int radius2) {
        super(rsdius1);
        this.radius2 = radius2;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
