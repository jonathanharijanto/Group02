package model;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;


/**
 * Created by jonathanharijanto on 1/21/2016.
 */
public class MoveTest {

    @Test
    public void testModelExists() {
        Move mov = new Move();
        assertNotNull(mov);
    }

    @Test
    public void testEqualSuit(){
        Move mov = new Move();
        assertArrayEquals(new int[]{},new int[]{});
    }

}
