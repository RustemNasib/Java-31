package lesson15;

public class Main1 {
    public static void main(String[] args) {

       Fridge fridge = new Fridge();
       fridge.addProduct("Яблоко", 1);
       fridge.addProduct("Яблоко", 2);
       fridge.addProduct("Банан", 3);
       fridge.addProduct("Апельсин", 5);
       fridge.addProduct("Киви", 6);
       fridge.addProduct("Сахар", 2);

       fridge.getProduct("Круасаны", 2);

       Resept salat = new Resept("Фруктовый салат");
       salat.addIngridient("Яблоко", 2);
       salat.addIngridient("Банан", 2);
       salat.addIngridient("Киви", 2);
       salat.addIngridient("Лимонный сок", 10);
       salat.addIngridient("Сахар", 20);

       fridge.canCook (salat);
    }
}
