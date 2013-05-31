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
    public void rollFiveFiveWithOneBonusGoesToEleven() throws Exception {
        assertGoesTo(11, new RollBuilder().setFirst(5).setSecond(5).setBonus(1).createRoll());
    }
    
    private void assertGoesTo(int expectedResult, Roll roll) {
        Bowling bowling = newBowlingWith(roll);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }

    private Bowling newBowlingWith(Roll roll) {
        Bowling bowling = new Bowling();
        bowling.roll(roll);
        return bowling;
    }
    
}