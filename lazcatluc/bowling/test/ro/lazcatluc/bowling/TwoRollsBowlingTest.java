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
public class TwoRollsBowlingTest {
    
    @Test
    public void twoRollsAddUpTheirResult() throws Exception {
        final int firstResult = 1;
        final int secondResult = 2;
        int expectedResult = 3;
        Bowling bowling = newBowlingWith(
                new RollBuilder().withTotalResult(firstResult).createRoll(),
                new RollBuilder().withTotalResult(secondResult).createRoll());
        
        assertEquals(expectedResult, bowling.getResult());
    }
    
    @Test
    public void twoRollsWithSpareFirstAddTheFirstThrowOfTheSecondRollTwice() throws Exception {
        Roll firstRoll = new RollBuilder().spare().createRoll();
        Roll secondRoll = new RollBuilder().setFirst(1).setSecond(0).createRoll();
        int expectedResult = 12;
        
        Bowling bowling = newBowlingWith(firstRoll, secondRoll);
        
        assertEquals(expectedResult, bowling.getResult());
    }
    
    @Test
    public void twoRollsWithStrikeFirstAddTheFirstAndSecondThrowsOfTheSecondRollTwice() throws Exception {
        Roll firstRoll = new RollBuilder().strike().createRoll();
        Roll secondRoll = new RollBuilder().setFirst(1).setSecond(1).createRoll();
        int expectedResult = 14;
        
        Bowling bowling = newBowlingWith(firstRoll, secondRoll);
        
        assertEquals(expectedResult, bowling.getResult());
    }
    
    private Bowling newBowlingWith(Roll firstRoll, Roll secondRoll) {
        Bowling bowling = new Bowling();
        bowling.roll(firstRoll);
        bowling.roll(secondRoll);
        return bowling;
    }
}
