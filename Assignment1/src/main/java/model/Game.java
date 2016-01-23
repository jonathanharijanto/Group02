package model;

import java.util.ArrayList;

/**
 * Created by Cameron on 1/22/2016.
 */
public class Game {


    private Deck deck= new Deck();

    private Col col1 = new Col();
    private Col col2 = new Col();
    private Col col3 = new Col();
    private Col col4 = new Col();

    public void Deal(){

        col1.addCard(deck.drawFromDeck());
        col2.addCard(deck.drawFromDeck());
        col3.addCard(deck.drawFromDeck());
        col4.addCard(deck.drawFromDeck());

    }
    public static boolean checkColumn(ArrayList<Card> cardArray) {
        int cardSize = cardArray.size();
        if (cardSize == 0) {
            return true;
        }
        return false;
    }

    public static void moveCard(ArrayList<Card> cardSource, ArrayList<Card> cardDestination) {
        int lastCardIndex = cardSource.size() - 1;
        Card temp = cardSource.get(lastCardIndex);
        cardDestination.add(temp);
        //call removeClass cardDestination[lastCardIndex]
    }

}
