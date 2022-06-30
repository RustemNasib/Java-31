package lesson18;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    private String testName;
    private ArrayList <Question> questions = new ArrayList<>();

    public Test() {
    }

    public Test(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

public void addQuestion (Question question){
        questions.add(question);

}

public void doTest () {
    for (int i = 0; i<questions.size(); i++) {
        // взяли следующий вопрос
        Question q = questions.get(i);
        // выводим на консоль номер вопроса и сам вопрос
        System.out.println( (i+1) + "-" + q);
        // достаем все варианы к этому вопросу и печатаем их на консоль
        ArrayList <Option> options = q.getOptions();
        for (int j =0; j<options.size(); j++){
            Option option = options.get(j);
            System.out.println("  " + (j+1) + "-" + option);

            System.out.println("Введите верный вариан ответа (номер): ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            // 1, 2,3,4,5,6, 23, 343, ffdd - варианты, которые могли прийти
            // 1,2,3,4 - варианты, которые мы можем обработать

        }
    }
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return Objects.equals(testName, test.testName) && Objects.equals(questions, test.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testName, questions);
    }

    @Override
    public String toString() {
        return "Test{" +
                "testName='" + testName + '\'' +
                ", questions=" + questions +
                '}';
    }
}
