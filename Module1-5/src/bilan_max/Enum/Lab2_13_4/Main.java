package bilan_max.Enum.Lab2_13_4;

import mainclasses.Arrays;

public class Main {
    public static void main(String[] args) {
        Card []cards=new Card[52];
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
