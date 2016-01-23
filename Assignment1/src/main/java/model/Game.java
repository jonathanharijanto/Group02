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

    // The two inputs should be the int values that represent the suits. Would work fine with the faces, if I ever needed to test equality.
    // Yeah, this is pretty much a stock function, or method or whatever it is in Java.
    // This is called later in the greater compare function.
    // Author: Taylor Kirkpatrick
    public static boolean same_int(int a, int b){
        if(a == b) {
            return true;
        } else {
            return false;
        }
    }
    // Also rather simple, but hey, this is pretty good for hardly understanding Java.
    // This one takes in two ints, two ints representing the faces and one that asks if user wants a greater than or less than comparison.
    // Technically don't need the third one if this function was used cleverly, but let's be convenient.
    // Returns boolean.
    // Also incorporated into the larger compare function.
    // Author: Taylor Kirkpatrick
    public static boolean compare_face(int a, int b, String c){
        if (c.equals("g")){     // The less than is never actually used in this scope. But who knows what the future holds?
            if (a > b){
                return true;
            }
            return false;
        }
        if (c.equals("l")){
            if (a < b){
                return true;
            }
            return false;
        }
        return false;   // Something went wrong here. But logically it'll never happen, so don't worry boys and girls.
    }
    // Fire and forget function. Takes two cards as inputs, returns a boolean if the first card can be removed.
    // NOTE: First argument is the card to be removed, second argument is the top card of another column.
    // Author: Taylor Kirkpatrick
    public static boolean can_remove(Card a, Card b){
        int asuit = a.getSuit();
        int bsuit = b.getSuit();
        int aface = a.getRank();
        int bface = b.getRank();

        if (same_int(asuit,bsuit)){
            if (compare_face(aface,bface,"l")){
                return true;
            }
        }
        return false;
    }
}

}
