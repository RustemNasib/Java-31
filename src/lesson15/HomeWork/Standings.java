package lesson15.HomeWork;


import java.util.HashMap;

public class Standings {
    private HashMap<String, Integer> table = new HashMap<>();

    public Standings() {
    }

    public Standings(HashMap<String, Integer> table) {
        this.table = table;
    }

    public HashMap<String, Integer> getTable() {
        return table;
    }

    public void setTable(HashMap<String, Integer> table) {
        this.table = table;
    }

    public void addCommands(String commands, Integer values) { // добавить команду
        if (table.containsKey(commands)) {
            table.put(commands, values + table.get(commands));

        } else {
            table.put(commands, values);
        }
    }

    public void getCommands(String commands, Integer values) {//удалить команду и очки
        table.remove(commands, values);

    }

    public void addValues(String commands, Integer values) { //добавить очки
        if (table.containsKey(values)) {
            table.put(commands, values + table.get(values));
        }
    }

    public void getValues(String commands, Integer values) { //удалить очки
        table.remove(values);
    }
}



 // первый проход по Map
 //        for (String key : table.keySet()) {
 //            System.out.println(key + "-" + table.get(key));
 //        }
 //        // второй проход по коллекции
 //
 //        for (Map.Entry<String, Integer> kv : table.entrySet()) {
 //        System.out.println(kv.getKey() + "-" + kv.getValue());
 //       }


// 1. Разработать класс "Турнирная таблица" с методами:
// 1.1 добавить команду в турнир (по умолчанию 0 баллов)//table.put
// 1.2 исключить команду из турнира // map of, table.remove
// 1.3 добавить команде балл (передаем в метод команду и балл) //SetValue
// 2. Вывести на консоль турнирную таблицу, отсортированную по названию команды// keySet
// 3. Вывести на консоль турнирную таблицу, отсортированную по баллам от большего к меньшему
// 4. Вывести на консоль победителя турнира
// 5. Написать Мэйн, показать как работают методы.
