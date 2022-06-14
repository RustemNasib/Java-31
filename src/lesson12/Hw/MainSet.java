package lesson12.Hw;

import lesson11.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class MainSet {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        int a1 = (0);
        int a2 = (1);
        int a3 = (3);
        int a4 = (2);
        int a5 = (4);
        // преобразуем каждое число в Стринг
        String str1 = Integer.toString(a1);
        String str2 = Integer.toString(a2);
        String str3 = Integer.toString(a3);
        String str4 = Integer.toString(a4);
        String str5 = Integer.toString(a5);



        ArrayList <String> b = new ArrayList<>();
        b.add(str1);
        b.add(str2);
        b.add(str3);
        b.add(str4);
        b.add(str5);

        HashSet<String> c = new HashSet<>();

        c.add("qqq");
        c.add("qqq");
        c.add("eee");
        c.add("yyy");
        c.add("!!!");
        c.add("6666");

        MethodBySet set = new MethodBySet();
        System.out.println(set.orderedSet(a,c));


        LinkedList<Integer> val = new LinkedList<>();
        int val6 = (0);
        int val7 = (1);
        int val8 = (3);
        int val9 = (3);
        int val0 = (2);

        MethodBySet set1 = new MethodBySet();
//        System.out.println(set1.customOrderSet();
    }


}
