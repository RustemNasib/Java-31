package lesson14;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsImple utils = new StringUtilsImple();

        double result = utils.div ("33","45");
        System.out.println(result);


        try {
            double []nums = utils.findNumbers("h-jh/j12/1kh-hjh56.j345jk.hj-888k");
            for (double d:nums){
                System.out.println(d);
            }
        }catch (CustomException e){
            e.printStackTrace();

        }
        try {
            utils.findWord("Все Word вхождения Word слова Word ","Word");
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
