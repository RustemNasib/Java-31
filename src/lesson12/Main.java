package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 4.5, 1900, "Золото");
        Coin coin2 = new Coin(10, 4.5, 1900, "Золото");
        Coin coin3 = new Coin(5, 5, 1940, "Серебро");
        Coin coin4 = new Coin(1, 10, 1990, "Серебро");
        Coin coin5 = new Coin(10, 3, 1960, "Золото");

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        // for each (он доступен для любой коллекции)

        for (Coin c : coins) {
            System.out.println(c);
        }
        // с помощью итератора (он доступен для любой коллекции)

        Iterator<Coin> iter;
        for (iter = coins.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
