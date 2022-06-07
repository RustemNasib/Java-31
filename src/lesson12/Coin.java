package lesson12;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private double diametr;
    private int year;
    private String metall;


    @Override
    public String toString() {
        return "Монета{" +
                "номинал=" + nominal +
                ", диаметр=" + diametr +
                ", год=" + year +
                ", металл='" + metall + '\'' +
                '}';
    }

    public Coin(int nominal, double diametr, int year, String metall) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.year = year;
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }


    @Override
    public int compareTo(Coin o) {
        // this - первая монета
        // o - вторая монета
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiametr() != o.getDiametr()) {
            return Double.compare(this.getDiametr(), o.getDiametr());

        }
        if (this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }

        if (!this.getMetall().equals(o.getMetall())) {
            return this.getMetall().compareTo(o.getMetall());

        }
        return 0;
    }
}

