/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class BowlingTest {
    

    @Test
    public void nothingGoesToZero() {
        assertRollGoesTo(0, 0, 0);
    }
    
    @Test
    public void rollingOneZeroGoesToOne() throws Exception {
        assertRollGoesTo(1, 0, 1);
    }
    
    private void assertRollGoesTo(int expectedResult, int firstRoll, int secondRoll) {
        Bowling bowling = new Bowling();
        
        bowling.roll(firstRoll);
        bowling.roll(secondRoll);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }
}