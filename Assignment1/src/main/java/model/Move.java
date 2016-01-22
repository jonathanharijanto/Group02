package model;

import java.util.ArrayList;

/**
 * Created by jonathanharijanto on 1/21/2016.
 */
public class Move {

    public static boolean checkColumn(ArrayList<Card> cardArray) {
        int cardSize = cardArray.size();
        if (cardSize == 0) {
            return true;
        }
        return false;
    }

    public static void moveCard(ArrayList<Card> cardSource, ArrayList<Card> cardDestination) {
        int lastCardIndex = cardSource.size() - 1;
        // string temp = cardDestination[lastCardIndex]
        // cardSource.add(temp)
        cardDestination.get(lastCardIndex);
        //call removeClass cardDestination[lastCardIndex]
    }
}
