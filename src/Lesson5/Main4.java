package Lesson5;

public class Main4 {
    public static void main(String[] args) {
        /**
         * ���� �����, ������� ����� ������������.
         * ����������� - ��� ������ ������� �� ��������� ������ � ��������.
         * �������� ������ ��������� ����� � ����� ��� ��������.
         *
         *
         *
         */

        String text = "zcurrentCharFromText text.length";
        String alfabet = "abcdefghijklmnopqrstuvwxyza";
        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexFromAlfabet = alfabet.indexOf(currentCharFromText);
            if (indexFromAlfabet != -1) {
                char charToCodding = alfabet.charAt(indexFromAlfabet + 1);
                System.out.print(charToCodding);
            } else {
                System.out.print(currentCharFromText);
            }
        }

    }
}

