package lesson12.Hw;

import java.util.ArrayList;

public class MainList1 {
    public MainList1() {
    }

    public static void main(String[] args) {

        ArrayList<Double> al = new ArrayList<>();
        al.add(1.2);
        al.add(0.4);
        al.add(4.6);


        MethodByList impl = new MethodByList();
        System.out.println(impl.sortedList(al));

//        List<Double> sorted = impl.sortedList (al);
//        System.out.println(sorted);
    }
}
