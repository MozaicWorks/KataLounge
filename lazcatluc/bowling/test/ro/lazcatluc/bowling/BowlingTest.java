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
        assertGoesTo(0, new RollBuilder().setFirst(0).setSecond(0).createRoll());
    }
    
    @Test
    public void rollingOneZeroGoesToOne() throws Exception {
        assertGoesTo(1, new RollBuilder().setFirst(0).setSecond(1).createRoll());
    }
    
    @Test
    public void rollingZeroOneGoesToOne() throws Exception {
        assertGoesTo(1, new RollBuilder().setFirst(1).setSecond(0).createRoll());
    }
    
    @Test
    public void rollingZeroOneDoesntHaveBonus() throws Exception {
        Bowling bowling = newBowlingWith(new RollBuilder().setFirst(0).setSecond(1).createRoll());
        
        assertFalse(bowling.hasBonus());
    }
    
    @Test
    public void rollingFiveFiveHasBonus() throws Exception {
        Bowling bowling = newBowlingWith(new RollBuilder().setFirst(5).setSecond(5).createRoll());
        
        assertTrue(bowling.hasBonus());
    }
    
    private void assertGoesTo(int expectedResult, Roll roll) {
        Bowling bowling = newBowlingWith(roll);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }
    
    private void assertRollGoesTo(int expectedResult, int firstRoll, int secondRoll) {
        Bowling bowling = newBowlingWithTwoRolls(firstRoll, secondRoll);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }

    private Bowling newBowlingWith(Roll roll) {
        Bowling bowling = new Bowling();
        bowling.roll(roll);
        return bowling;
    }
    private Bowling newBowlingWithTwoRolls(int firstRoll, int secondRoll) {
        return newBowlingWith(new RollBuilder().setFirst(firstRoll)
                .setSecond(secondRoll).createRoll());
    }
}