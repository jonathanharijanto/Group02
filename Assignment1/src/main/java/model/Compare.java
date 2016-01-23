package model;

/**
 * Created by Taylor on 1/21/2016.
 */
public class Compare {
    


    // The two inputs should be the int values that represent the suits. Would work fine with the faces, if I ever needed to test equality.
    // Yeah, this is pretty much a stock function, or method or whatever it is in Java.
    // This is called later in the greater compare function.
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
