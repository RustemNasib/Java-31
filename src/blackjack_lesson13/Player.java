package blackjack_lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needsCard() {
        System.out.println("--------------Âàøè êàðòû:  -----------");
        this.openHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Íóæíà ëè êàðòà?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("äà")){
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }

    public int valuesHand (){
        int res = 0;
        for(Card c:hand){
            res =res+c.getValue();

        }
        return  res;
    }
}
