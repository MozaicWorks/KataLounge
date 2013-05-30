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
    public void nothingGoesToZero() throws Exception {
        assertRollGoesTo(0, 0, 0);
    }
    
    @Test
    public void rollingOneZeroGoesToOne() throws Exception {
        assertRollGoesTo(1, 0, 1);
    }
    
    @Test
    public void rollingZeroOneGoesToOne() throws Exception {
        assertRollGoesTo(1, 1, 0);
    }
    
    @Test
    public void rollingZeroOneDoesntHaveBonus() throws Exception {
        Bowling bowling = newBowlingWithTwoRolls(0, 1);
        
        assertFalse(bowling.hasBonus());
    }
    
    @Test
    public void rollingFiveFiveHasBonus() throws Exception {
        Bowling bowling = newBowlingWithTwoRolls(5, 5);
        
        assertTrue(bowling.hasBonus());
    }
    
    private void assertRollGoesTo(int expectedResult, int firstRoll, int secondRoll) {
        Bowling bowling = newBowlingWithTwoRolls(firstRoll, secondRoll);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }

    private Bowling newBowlingWithTwoRolls(int firstRoll, int secondRoll) {
        Bowling bowling = new Bowling();
        bowling.roll(new Roll(firstRoll,secondRoll));
        return bowling;
    }
}