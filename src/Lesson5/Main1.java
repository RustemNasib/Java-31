package Lesson5;

public class Main1 {
    public static void main(String[] args) {
        // К нам приходит путь к картинке.
        // Нужно проверить и напечатать на консоль картинка это или нет.

        String pathToImage = "C:\\Users\\дом\\Desktop";
        if (pathToImage.endsWith(".png")|| pathToImage.endsWith(".jpeg")) {
            System.out.println("Eto kartinka");
        }else{
            System.out.println("Eto ne kartinka");
        }

    }
}
