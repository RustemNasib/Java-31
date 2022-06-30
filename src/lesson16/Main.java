package lesson16;

public class Main {
    public static void main(String[] args) {
        CopyWithIO copyWithIO = new CopyWithIO();
CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithAppache copyWithAppache = new CopyWithAppache();
CopyWithGuava copyWithGuava = new CopyWithGuava();

        long start1 = System.currentTimeMillis();
        copyWithIO.copy("C:\\Users\\дом\\Downloads\\WhatsAppS.exe","1.exe");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с IO: "+ (end1 - start1) );

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\дом\\Downloads\\WhatsAppS.exe","2.exe");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с NIO: "+ (end2 - start2) );

        long start3 = System.currentTimeMillis();
        copyWithAppache.copy("C:\\Users\\дом\\Downloads\\WhatsAppS.exe","3.exe");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с Appаche: "+ (end3 - start3) );

            long start4 = System.currentTimeMillis();
            copyWithAppache.copy("C:\\Users\\дом\\Downloads\\WhatsAppS.exe","4.exe");
            long end4 = System.currentTimeMillis();
            System.out.println("Копирование с Goava: "+ (end4 - start4) );


    }
}
