package lesson6;

import lesson6.TextUtils;

public class Main {
    public static void main(String[] args) {
       int vowels=TextUtils.countVowels("jdkkdfdfdfdfdf");
        System.out.println(vowels);

        TextUtils.printReverse("qwerty!!!");

        String codQwer =TextUtils.returnText("qwerty");
        System.out.println(codQwer);

    }
}
