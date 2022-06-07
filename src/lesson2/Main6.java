package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // напечатать на консоль только числа кратные 3 и 5 одновременно от 30 до 60 включительно

        for (int i = 30; i <= 60; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            }
        }
    }
