package lesson2;

public class Main2 {
    public static void main(String[] args) {
        // равносторонний, разносторонний или равнобедренный треугольник
        int a = 3;
        int b = 4;
        int c = 5;
        // равносторонний
        if (a==b && b==c && c==a){
            System.out.println("Eto ravnostoronniy treugolnik");
            // разносторонний треугольник
        }else if (a!=b && b!=c && c!=a){
            System.out.println("eto raznostoronniy treugolnik");
            // равнобедреный

        }else
            System.out.println("Eto ravnobedrenniy treugolnik");

    }
}
