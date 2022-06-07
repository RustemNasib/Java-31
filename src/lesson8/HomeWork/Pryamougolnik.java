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

    // �������� ��������������
    public int perimetr() {
        return (getA() + b) * 2;

    }

    // ������� ��������������
    public double square() {
        return getA() * b;

    }

    //���� ��������������
    public String injection() {
        return "90 ��������";
    }

    //������ ��������������
    public int rectangleHeight() {
        return (getA() * b) / getA();
    }


    //�����, ������� ����� �������� �� ������� ��� ���������� � ��������������
    public String printInfo() {
        String figure = "�������������";
        double perimetr = (getA() + b) * 2;
        double square = getA() * b;
        double height = (getA() * b) / getA();

        return (("��������: " + figure + "; ") + (("��������: ") + perimetr + "; ") + (("�������: ") + square + "; ") + (("������: ") + height + "; "));
        // return printInfo().toString();

          }

          public void form () {
            System.out.println("� �������������");

        }
    }
