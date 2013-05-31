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
public class ThreeRollsBowlingTest {
    
    @Test
    public void threeRollsWithStrikeFirstAndStrikeSecondAddTheFirstResultOfTheThirdThrowThreeTimes() throws Exception {
        Bowling bowling = newBowlingWith(
                new RollBuilder().strike().createRoll(), 
                new RollBuilder().strike().createRoll(), 
                new RollBuilder().setFirst(1).setSecond(1).createRoll());
        int expectedResult = 35;
        
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }
    private Bowling newBowlingWith(Roll firstRoll, Roll secondRoll, Roll thirdRoll) {
        Bowling bowling = new Bowling();
        bowling.roll(firstRoll);
        bowling.roll(secondRoll);
        bowling.roll(thirdRoll);
        return bowling;
    }
}
