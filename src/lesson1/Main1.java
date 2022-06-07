package lesson1;

public class Main1 {
    public static void main(String[] args) {
        // Задача, сколько столов влезет в комнау?
        // Имеется ширина и длинна комнаты, есть ширина и длинна стола
        // Нужно посчиать сколько таких столов влезет в комнату

        double shirinaRoom = 3.4;
        double dlinnaRoom = 2;
        double shirinaTable = 2;
        double dlinnaTable = 1.5;

        double ploshadRoom = shirinaRoom * dlinnaRoom;
        double ploshadTable = shirinaTable * dlinnaTable;

        // ругается тк не совпадают типы (число дабл пытаемся сохранить в инт)
        // необходимо приведение типов дабл в инт
        // приведение типов бывает нисходящее и восходящее

        int countTableInsertToRoom = (int) (ploshadRoom / ploshadTable);
        System.out.println(countTableInsertToRoom);
    }
}
