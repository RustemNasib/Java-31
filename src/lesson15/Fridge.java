package lesson15;

import java.util.HashMap;

public class Fridge {

    private HashMap<String, Double> products = new HashMap<>();
    private double valume = 50;

    public void addProduct(String product, double weight) {
        if (valume < weight) {
            System.out.println("Нет места в холодильнике");
            return;
        }
        valume = valume - weight;

        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));

        } else {

            products.put(product, weight);
        }
    }

    public void getProduct(String product, double weight) { //берем с холодильника
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет" + product);
            return;
        }
        if (products.get(product) < weight) {
            System.out.println("Такого продукта не хватает, взяли все что есть:" + product);

            valume = valume + products.get(product);
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weight);
        valume = valume + weight;
    }

    public void canCook(Resept resept) {
        // products - все продукты в холодильнике
        // resept - то, что мы хотим приготовить (с ингридиентами)
        boolean canCoook = true;
        for (String ingridient : resept.getIngridients().keySet()) {
            if (!products.containsKey(ingridient)) {
                canCoook = false;
                System.out.println("Нет в холодильнике: " + ingridient + "," + resept.getIngridients().get(ingridient));

            } else if (products.get(ingridient) < resept.getIngridients().get(ingridient)) {
                canCoook = false;
                System.out.println("Не достаточно продукта: " + ingridient + ", " +
                        "есть только" + products.get(ingridient) + ", требуется -" +
                        resept.getIngridients().get(ingridient));
            }
        }
        if (canCoook) {
            System.out.println("Можем приготовить" + resept.getName());

        } else {
            System.out.println("Не можем приготовить" + resept.getName());
        }
    }
}
