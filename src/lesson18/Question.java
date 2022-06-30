package lesson18;

import java.util.ArrayList;
import java.util.Objects;

public class Question {
    private String question;
    private ArrayList <Option> options = new ArrayList<>();

    private int ball;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question(String question, int ball) {
        this.question = question;
        this.ball = ball;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public void addOption (Option option){
        options.add(option);

    }

    public void addOption (Option...options){
for (Option o: options){
this.options.add(o);
}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return ball == question1.ball && Objects.equals(question, question1.question) && Objects.equals(options, question1.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, options, ball);
    }

    @Override
    public String toString() {
        return question;
    }
}
