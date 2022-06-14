package lesson12.Hw;

import java.util.List;

public class MainList {
    public static void main(String[] args) {

        MethodByList impl = new MethodByList();
        List<String> result = impl.asList("sddsd", "sdsdsd");

        System.out.println(result);

    }
}
