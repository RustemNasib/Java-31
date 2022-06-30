package lesson16;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File startDir = new File("C:\\qwerty\\qwer\\qw");
        if (!startDir.exists()){
            startDir.mkdirs();
        }
        File file = new File("C:\\qwerty\\qwer\\qw\\qwerty.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }

}
