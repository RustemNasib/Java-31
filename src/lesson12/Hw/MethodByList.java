package lesson12.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodByList implements ListUtils{


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

        List<String> list = Arrays.asList("a", "b", "c");
        return list;
    }
    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> al = new ArrayList<>();
        al.add(1.2);
      al.add(0.4);
        al.add(4.6);
               Collections.sort(al, Collections.reverseOrder());

        return al;
    }


}
