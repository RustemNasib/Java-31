package lesson15.HomeWork;


import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Standings standings = new Standings();

        standings.addCommands("Динамо", 2);
        standings.addCommands("ЦСКА", 3);
        standings.addCommands("Спартак", 5);
        standings.addCommands("Зенит", 1);



        standings.getCommands("Зенит", 1);



    }
}


