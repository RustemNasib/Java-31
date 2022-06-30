package lesson18;

public class Main {
    public static void main(String[] args) {
        Test englishTest = new Test("Определить уровень Английского языка");
        Question question1 = new Question("I __________ a teacher.");
        Option option1_1 = new Option("am",true);
        Option option1_2 = new Option("are",false);
        Option option1_3 = new Option("be",false);
        Option option1_4 = new Option("is",false);
        question1.addOption(option1_1,option1_2,option1_3,option1_4);

        Question question2 = new Question("_________ you play chess?");
        Option option2_1 = new Option("are",false);
        Option option2_2 = new Option("know",false);
        Option option2_3 = new Option("can",true);
        Option option2_4 = new Option("have",false);
        question2.addOption(option2_1,option2_2,option2_3,option2_4);

        Question question3 = new Question("There isn't __________ fruit in the shop.");
        Option option3_1 = new Option("some",false);
        Option option3_2 = new Option("any",true);
        Option option3_3 = new Option("the",false);
        Option option3_4 = new Option("two",false);
        question3.addOption(option3_1,option3_2,option3_3,option3_4);

        englishTest.addQuestion(question1);
        englishTest.addQuestion(question2);
        englishTest.addQuestion(question3);

        System.out.println(englishTest.getTestName());

englishTest.doTest();
    }
}
