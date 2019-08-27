package tereshchenko_roman.theEnums.theEnums2;

public class Main {

    public static void main(String[] args) {
        Card[] cards = new Card[52];

        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);
            }
        }

        for (Card element : cards) {
            System.out.println(element);
        }
    }
}
