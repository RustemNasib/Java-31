package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        /* Задача
        имеется 1000р.
        стоимость: пиццы 230р. жвачки 26 р. конфеты 2,5 р.
        Необходимо купить максимум пицц, затем на оставшуюся сумму жвачек и затем конфет.
         */
        int sum = 1000;
        int pricePizza = 230;
        int priceGum = 26;
        double priceCandy = 2.5;

        // количество пиццы (4)
        int amountPizza = sum / pricePizza;

        // сумма, потраченная на пиццу (920)
        int sumPizza = amountPizza * pricePizza;

        // остаток денег после покупки пиццы (80)
        int remainderAfterPizza = sum - sumPizza;

        // количество жвачек, купленных после покупки пиццы (3)
        int amountGum = remainderAfterPizza / priceGum;

        // сумма, потраченная на жвачки (78)
        int sumGum = priceGum * amountGum;

        //остаток денег, после покупки жвачек (2)
        int remainderAfterGum = remainderAfterPizza - sumGum;

        // количество конфет, купленных на остаток после покупки жвачек (0)
        int amountCandy = (int) (remainderAfterGum / priceCandy);

        // сдача
        float change = sum - sumPizza - sumGum;

        System.out.println("pizza = " + amountPizza);
        System.out.println("gum = " + amountGum);
        System.out.println("candys = " + amountCandy);
        System.out.println("change = " + change);


            }
        }



