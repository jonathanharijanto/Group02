package model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Cameron on 1/22/2016.
 */
public class GameTest {

    @Test
    public void testModelExists() {
        Deck deck= new Deck();
        assertNotNull(deck);

        Col col = new Col();
        assertNotNull(col);
    }

    /*
    @Test
    public void testDeal(){
        Deck deck= new Deck();

        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();

        assertEquals(col.topCard(), card1 );

    }*/
}
