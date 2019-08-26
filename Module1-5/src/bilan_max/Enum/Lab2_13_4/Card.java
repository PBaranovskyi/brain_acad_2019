package bilan_max.Enum.Lab2_13_4;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The card:" + cardRank + "_" + cardSuit;
    }
}
