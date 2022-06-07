package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String text = "Hello World qwerty";

        //напечатать на консоль по одному слову в обратном порядке
        //olleH dlroW ytrewq

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }

    }
}
