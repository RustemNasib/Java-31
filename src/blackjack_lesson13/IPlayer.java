package blackjack_lesson13;

public interface IPlayer {
    void addCardToHand (Card card);

    boolean needsCard ();

    void openHand ();
}