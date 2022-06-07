package  lesson6;

public class TextUtils {
    /**
     * Создадим метод, в который будем передавать любой текст, а метод будет возвращать количество глассных букв в этом тексте
     * <p>
     * 1- модификатор доступа. Это одно из 4-х слов. Он определяет область видимости данного метода.
     * public - доступно внутри всего проекта
     * ______ (пустой) - он же Package - доступен внутри доступного пакета
     * protected - доступен внутри текущего пакета и дочерним классам
     * private - доступен внутри текущего файла (текущего класса).
     * <p>
     * 2- stаtic (пишем или нет)
     * <p>
     * 3- возвращаемый тип (String, int, boolean...)(или слово void если его нет)
     * <p>
     * 4- название метода (видно когда мы его по этому слову вызывать)
     * <p>
     * 5- явные входящие параметры
     * <p>
     * 6 -тело выполнения метода
     */
    public static int countVowels(String text) {
        // text = "jdkjfkdjfkdfkd"
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'i') {
                count++;
            }
        }
        return count;

        /**
         * Метод, который печатает текст в обратном порядке, который мы передали

         */
    }

    public static void printReverse(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();

    }

    /**
     * мы в метод передаем слово которое нужно закодировать, метод возвращает закодированное слово
     */
    public static String returnText(String text) {


        String alfabet = "abcdefghijklmnopqrstuvwxyza";
        String coddingWord = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexFromAlfabet = alfabet.indexOf(currentCharFromText);
            if (indexFromAlfabet != -1) {
                char charToCodding = alfabet.charAt(indexFromAlfabet + 1);
                coddingWord = coddingWord + charToCodding;

            } else {
                coddingWord = coddingWord + currentCharFromText;
            }

        }
        return coddingWord;
    }
}

