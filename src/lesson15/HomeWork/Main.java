package lesson15.HomeWork;


import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Standings standings = new Standings();

        standings.addCommands("������", 2);
        standings.addCommands("����", 3);
        standings.addCommands("�������", 5);
        standings.addCommands("�����", 1);



        standings.getCommands("�����", 1);



    }
}


