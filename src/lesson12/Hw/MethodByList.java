package lesson12.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodByList implements ListUtils{


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

//        List<String> list = Arrays.asList("a", "b", "c");
        ArrayList<String>list = new ArrayList<>();
        for (String s: strings){
            list.add (s);
        }
        return list;
    }
    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {

               Collections.sort(data, Collections.reverseOrder());

        return data;
    }


}
