package lesson9;

public class Krug {
    // поле
    private int radius;
// конструкторы
    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }
// методы
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krug krug = (Krug) o;

        return this.radius == krug.radius;

    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "круг{" +
                "radius=" + radius +
                '}';
    }
    int hashCode;

}
