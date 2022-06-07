package lesson7;

public class MainTovar {
    public static void main(String[] args) {
        // стандартная формула создания нового типа
        Tovar stol = new Tovar();
        Tovar computer = new Tovar();


        // stol.name = "Письменный стол 1500*800"; //нужно заменить
        // stol.price = 12000;
        //stol.salePrice = 9990;
        stol.setName("Письменный стол 1500*800");
        stol.setPrice(12000);
        stol.setSalePrice(9900);


        // computer.name = "Макбук";
        //computer.price = 210000;
        // computer.salePrice= 170000;
        computer.setName("Макбук");
        computer.setPrice(210000);
        computer.setSalePrice(170000);


        System.out.println();

    }
}