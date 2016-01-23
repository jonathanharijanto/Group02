package model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

/**
 * Created by Taylor on 1/21/2016.
 */
public class CompareTest {

    @Test
    public void testCompareExists(){
        Compare comp = new Compare();
        assertNotNull(comp);
    }

    @Test
    public void testEqualSuit(){
        Compare comp = new Compare();
        assertEquals(true, comp.same_int(0,0));
    }
    @Test
    public void testInequalSuit(){
        Compare comp = new Compare();
        assertEquals(false, comp.same_int(0,1));
    }

//    // This test is meant to fail all the time, to make sure I'm actually making tests right. It should never pass.
//    @Test
//    public void testFailedEqual(){
//        Compare comp = new Compare();
//        assertEquals(true, comp.same_int(0,1));
//    } // I'll comment it out when I'm finished with the feature.

    @Test
    public void testFirstNumBiggerTrue(){
        Compare comp = new Compare();
        assertEquals(true, comp.compare_face(13,8,"g"));
    }
    @Test
    public void testFirstNumBiggerFalse(){
        Compare comp = new Compare();
        assertEquals(false, comp.compare_face(2,8,"g"));
    }
    @Test
    public void testFirstNumSmallerTrue(){
        Compare comp = new Compare();
        assertEquals(true, comp.compare_face(4,5,"l"));
    }
    @Test
    public void testFirstNumSmallerFalse(){
        Compare comp = new Compare();
        assertEquals(false, comp.compare_face(5,4,"l"));
    }

    @Test   // These next two tests actually are unrelated to the compare part of this project. Just me testing making sure things work before I start using them.
    public void testCardRankCompare(){
        Card card = new Card(2,3);
        assertEquals(3,card.getRank());
    }
    @Test
    public void testCardSuitCompare(){
        Card card = new Card(2,3);
        assertEquals(2,card.getSuit());
    }

    @Test   // The big finisher.
    public void testCanRemoveTrue(){
        Card fivespades = new Card(1,5);
        Card tenspades = new Card(1,10);
        Compare comp = new Compare();
        assertEquals(true, comp.can_remove(fivespades,tenspades));
    }
    @Test
    public void testCanRemoveFalse(){
        Card fivespades = new Card(1,5);
        Card tenspades = new Card(1,10);
        Compare comp = new Compare();
        assertEquals(false, comp.can_remove(tenspades,fivespades));
    }

}