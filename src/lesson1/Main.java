package lesson1;

public class Main {
    public static void main(String[] args) {
        //мы узнаем четное это число или нет
        int number = 31;
        int ostatok = number % 2;

        System.out.println(ostatok);

        int number1 = 12;
        int ostatok1 = number1 % 2;
        // ostatok (или 1 или 0 однозначно)
boolean isChetnoe = ostatok1 == 0;
        System.out.println(isChetnoe);
    }
}
