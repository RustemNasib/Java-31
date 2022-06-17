package lesson15;

import java.util.HashMap;

public class Resept {
    private String name;
    private HashMap <String, Double> ingridients = new HashMap<>();

    public Resept(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Double> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Double> ingridients) {
        this.ingridients = ingridients;
    }

    public void addIngridient (String product, double weight){
        if (ingridients.containsKey(product)) {
            ingridients.put(product, weight + ingridients.get(product));

        } else {

            ingridients.put(product, weight);
        }
    }
}
