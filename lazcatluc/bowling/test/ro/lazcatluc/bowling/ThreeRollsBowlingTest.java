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
    private Bowling newBowlingWith(Roll firstRoll, Roll secondRoll, Roll thirdRoll) {
        Bowling bowling = new Bowling();
        bowling.roll(firstRoll);
        bowling.roll(secondRoll);
        bowling.roll(thirdRoll);
        return bowling;
    }
}
