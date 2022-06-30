package lesson18;

import java.util.Objects;

public class Option {
    private String option;
    private boolean isCorrect;
    private boolean isChoose;


    public Option() {
    }

    public Option(String option, boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;

    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option1 = (Option) o;
        return isCorrect == option1.isCorrect && Objects.equals(option, option1.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, isCorrect);
    }

    @Override
    public String toString() {
        return option;
    }
}
