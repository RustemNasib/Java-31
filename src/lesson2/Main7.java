package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // вывести на консоль сумму чисел от 20 до 100, кратных трем
        int summa = 0;
        for (int i = 20; i<=100; i++){
            if (i%3 == 0){
                summa = summa + i; // или summa +=i
            }
        }
        System.out.println(summa);
    }
}
