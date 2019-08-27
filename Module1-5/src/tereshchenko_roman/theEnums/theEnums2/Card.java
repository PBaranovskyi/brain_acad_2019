package tereshchenko_roman.theEnums.theEnums2;

public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card (Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "This card: " + cardRank + "_" + cardSuit;
    }
}
