package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class Test implements CollectionUtils {

//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        LinkedList<String> linkedList =new LinkedList<>();
//
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i< 100000; i++) {
//            arrayList.add (0,"dfdfdfd"+i);
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println("ArrayList Add:" + (end1 - start1));
//
//        long start2 = System.currentTimeMillis();
//        for (int i = 0; i< 100000; i++) {
//            linkedList.add (0,"dfdfdfd"+i);
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println("LinkedList Add:" + (end2 - start2));
//
//        System.out.println( "______________");
//        long start3 = System.currentTimeMillis();
//        for (int i = 0; i< 100000; i++) {
//            arrayList.get (i);
//        }
//        long end3 = System.currentTimeMillis();
//        System.out.println("ArrayList Get:" + (end3 - start3));
//
//        long start4 = System.currentTimeMillis();
//        for (int i = 0; i< 100000; i++) {
//            linkedList.get (i);
//        }
//        long end4 = System.currentTimeMillis();
//        System.out.println("LinkedList Get:" + (end4 - start4));


    public Test() {
    }

    @Override
        public String toString () {

            return "Test{}";
        }

        @Override
        public int hashCode () {
            return super.hashCode();
        }

        @Override
        public Collection<Integer> union (Collection < Integer > a, Collection < Integer > b) throws
        NullPointerException {
//            ArrayList<Integer> c = new ArrayList<>();
//            c.addAll(a);
//            c.addAll(b);
            a.addAll(b);
            System.out.println("Объединение коллекций с дубликатами"+ a);
            return a;
        }

        @Override
        public Collection<Integer> intersection (Collection < Integer > a, Collection < Integer > b) throws
        NullPointerException {
//            ArrayList<Integer> c = new ArrayList<>();
//            c.retainAll(a);
//            c.retainAll(b);
        a.retainAll(b); // пересечение
            a.addAll(a); // слияние
            System.out.println("Пересечение коллекций с дубликатами"+ a);
            return null;
        }

        @Override
        public Set<Integer> unionWithoutDuplicate (Collection < Integer > a, Collection < Integer > b) throws
        NullPointerException {
            a.removeAll(b); // удаление дубликатов
            a.addAll(b); // слияние
            System.out.println("объединение коллекций без дубликатов"+ a);

            return null;
            }

        @Override
        public Set<Integer> intersectionWithoutDuplicate (Collection < Integer > a, Collection < Integer > b) throws
        NullPointerException {
            a.retainAll(b); // пересечение
            System.out.println("Пересечение коллекций без дубликатов"+ a);

            return null;
        }

        @Override
        public Collection<Integer> difference (Collection < Integer > a, Collection < Integer > b) throws
        NullPointerException {
            ArrayList<Integer> c = new ArrayList<>(a);
            a.removeAll(b);
            b.removeAll(c);
            a.addAll(b);
            System.out.println(a);

            return null;


        }
    }

