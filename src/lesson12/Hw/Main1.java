package lesson12.Hw;

import java.util.ArrayList;

public class Main1 {
    public Main1() {
    }

    public static void main(String[] args) {

        ArrayList<Double> al = new ArrayList<>();
        al.add(1.2);
        al.add(0.4);
        al.add(4.6);


        MethodByImplements impl = new MethodByImplements();
        System.out.println(impl.sortedList(al));
//        System.out.println( al);
    }
}
