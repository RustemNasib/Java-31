package lesson16;

import java.io.File;
import java.io.FileFilter;

public class Main4 {
    public static void main(String[] args) {
        /**
         * Вытянуть все картинки с загрузок и пути их напечатать на консоль
         */
        File download = new File("C:");
        File[] filesFromDownload = download.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".png") || pathname.getName().endsWith(".jpg")) {
                    return true;

                }

                return false;
            }
        });
        for (File f : filesFromDownload) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
