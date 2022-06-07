package lesson10;

public class Monkey implements ZooAnimal{

    @Override
    public void voice() {
        System.out.println("yyyyyyaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обезяна прыгает");
    }

    @Override
    public void run() {
        System.out.println("Обезьяна бегает");

    }
}
