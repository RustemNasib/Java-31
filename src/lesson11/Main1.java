package lesson11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add (1);
        a.add (2);
        a.add (3);
        a.add (4);

        LinkedHashSet<Integer> b = new LinkedHashSet<>();
        b.add (3);
        b.add (4);
        b.add (5);
        b.add (6);
        b.add (7);

//        hashSet.add ("qqq");
//        hashSet.add ("qqq");
//        hashSet.add ("eee");
//        hashSet.add ("yyy");
//        hashSet.add ("!!!");
//        hashSet.add ("6666");

Test test = new Test();
        System.out.println(test.union(a,b));
    }
}
