package model;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by Cameron on 1/22/2016.
 */
public class ColTest {
    @Test
    public void testForCol(){
    Col col = new Col();
        assertNotNull(col);

    }

    @Test
    public void testForAdd(){
        Col col = new Col();
        Card card = new Card(1,1);
        Card card1 = new Card(1,1);
        col.addCard(card);
        assertEquals(col.topCard(), card1 );

    }
    @Test
    public void testSize(){
        Col col = new Col();
        Card card = new Card(1,1);
        Card card1 = new Card(1,1);
        col.addCard(card);
        assertEquals(col.sizeOfCol(), 1 );

    }

    @Test
    public void testGetCard(){
        Col col = new Col();
        Card card = new Card(1,1);
        Card card1 = new Card(1,1);
        col.addCard(card);
        assertEquals(col.getCard(col.sizeOfCol()), card1 );

    }




}

