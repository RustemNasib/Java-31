package lesson12.Hw;

import java.util.*;

public class MethodBySet implements SetUtils {
    public static void main(String[] args) {

    }

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {

        // 1. Привести числа к строковому представлению
        // 2. Объединить две коллекции
        // 3. Вернуть отсортированное множество в обратном порядке


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
        // объединение коллекций
        b.addAll(c);
        // сортировка (удаление дубликатов)
        b. remove(c);
        // объединение
        b.addAll(c);

        return null;
        }



    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedList<Integer> val = new LinkedList<>();
        int val6 = (0);
        int val7 = (1);
        int val8 = (3);
        int val9 = (3);
        int val0 = (2);

        return null;
    }
}