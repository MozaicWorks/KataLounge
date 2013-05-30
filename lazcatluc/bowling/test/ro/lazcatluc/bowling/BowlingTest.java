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
        Bowling bowling = new Bowling();
        int expectedResult = 0;
        
        bowling.roll(0);
        bowling.roll(0);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void rollingOneZeroGoesToOne() throws Exception {
        Bowling bowling = new Bowling();
        int expectedResult = 1;
        
        bowling.roll(1);
        bowling.roll(0);
        int result = bowling.getResult();
        
        assertEquals(expectedResult, result);
    }
}