package mykhailo_kaloshyn.mainacad.testenum.testenum2;

public class Main {

    public static void main(String[] args) {

        Suit[] suitArr = Suit.values();
        Rank[] rankArr = Rank.values();

        int a = Suit.values().length;
        int b = Rank.values().length;

        Card[][] cardsArr = new Card[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                cardsArr[i][j] = new Card(suitArr[i], rankArr[j]);
                System.out.println(cardsArr[i][j]);
            }
        }

        //System.out.println(Arrays.deepToString(cardsArr));
    }
}
