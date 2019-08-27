package mykhailo_kaloshyn.mainacad.testenum.testenum2;

public class Card {

  private Suit cardSuit;
  private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The card: " + this.cardRank + "_" + this.cardSuit;
    }
}
