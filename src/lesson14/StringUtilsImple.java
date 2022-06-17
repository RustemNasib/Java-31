package lesson14;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImple implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == 0 || number2 == 0");
        }
        double num1;
        double num2;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число");
        }

        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }

        return num1/num2 ;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
//        String str = "Все word вхождения word слова word в тексте text";
//       // поиск слова в строке
//        String find = "word";
//        int i = str.indexOf(find);
//
//        if(i==0) {
//            throw new NullPointerException("Слово не найдено");
//
//     }
        if (text == null || word == null) {
            throw new NullPointerException("Ошибка");
        }
        String[] words = text.split(" "); //создание массива и применение метода
        ArrayList<Integer> indexes = new ArrayList<>(); //наполнение коллекции
        for (int i = 0; i < words.length; i++){
            if (words[i] == word){
                indexes.add(i);
            }
        }
                int[] index = new int[indexes.size()]; // создаем массив с данными из Эррэй
        for(int i = 0; i < index.length; i++) {//прогон
            index[i] = indexes.get(i);//перегон
        }
        return index;


    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");// шаблон
        Matcher m = pattern.matcher(text);                          // ищет по шаблону паттерна в textе данном сверху

        ArrayList<Double> doubls = new ArrayList<>();               //наполняем коллекцию даблами и возвращаем в массив
        while (m.find()){                                           // в то время как нашли одно число
            doubls.add(Double.parseDouble(m.group()));              // добавляем один объект и сразу парсим из стринга в дабл
        }
        ;if(doubls.size()==0){                                    // если чисел в тексте не обнаружено, то выбросить ошибку
                throw new CustomException("чисел в тексте нет");
        }
        double[] result = new double[doubls.size()]; //создаем результативный массив, в который кладем количество из эррэя и применем метод сайз
        for(int i = 0; i<doubls.size(); i++){ // проходим по всем числам коллекции
            result[i] = doubls.get(i); // перегоняем в массив
        }

        return result;                //возвращаем результат
    }
}
