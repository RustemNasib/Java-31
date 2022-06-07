package lesson3;

public class Main2 {
    public static void main(String[] args) {
        char [] chars = {'w', '5', '2', 'g', '7','h','8', 'k','('};
        //задача - посчитать сколько в массиве цифр

        int count = 0;
        for (int i=0; i < chars.length; i++){
            char ch = chars [i];   // ch=currentCharFromMassive
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3'
                    || ch == '4' || ch == '5' || ch == '6'
                    || ch == '7' || ch == '8' || ch == '9') {
                count ++; //count = count +1
            }
        }
        System.out.println(count);
    }
}
