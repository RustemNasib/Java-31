package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main12 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        HashSet<Integer> b = new LinkedHashSet<>();
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();

        Collection<Integer> union = utils.union(a, b);
        System.out.println(union);

        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println(intersection);
    }
}
