package lesson3;

public class Main1 {
    public static void main(String[] args) {
// создать массив длинной в 10 элементов и наполнить его четными числами
// от 30 до .... пока есть ячейки

        int [] numbers = new int [10];

//        numbers [0] = 30;
//        numbers [1] = 32;
//        numbers [2] = 33;
//        numbers [3] = 36;
//        numbers [4] = 38;
//
//        numbers [5] = 40;
//        numbers [6] = 42;
//        numbers [7] = 44;
//        numbers [8] = 46;
//        numbers [9] = 48;

        int value = 30;
        for (int i = 0; i< numbers.length; i++){
            numbers[i]= value;
            value = value +2;//value +=2
        }

    }
}
