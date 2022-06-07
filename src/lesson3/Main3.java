package lesson3;

public class Main3 {
    public static void main(String[] args) {
        String text = "Hello world!";

       int lengthOfText = text.length();

        if (lengthOfText < 10) {
            System.out.println("Eto korotkiy tekst");
        } else {
            System.out.println("Eto dlinniy tekst");
        }

    }
}
