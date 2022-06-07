package Lesson5;

public class Main {
    public static void main(String[] args) {
        String text = "qwerty";// Тип переменной (String) название переменной(text) = объект ("qwerty")
        text = text + "!!!";
        System.out.println(text);


        // формула создания любого объекта
        // 1 -тип переменной (тип ссылки)
        // 2 - название переменной (название ссылки)
        // 3- = new (момент создания объекта)
        // 4 - тип объекта  ();
        // String text = new String();


        // 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16
        String numbers = "";
        for (int i = 0 ; i<100; i++){
            numbers=numbers +i+ "-";
        }
        System.out.println(numbers);
    }

}
