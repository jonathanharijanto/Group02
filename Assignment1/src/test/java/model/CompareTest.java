package model;

import org.junit.Test;

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
}