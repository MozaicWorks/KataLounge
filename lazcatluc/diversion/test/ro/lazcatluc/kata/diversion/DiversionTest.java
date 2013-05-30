/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.diversion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class DiversionTest {

    @Test
    public void numberOfZeroSequencesIsZero() throws Exception {
        assertNonAdiacentOneSequences(1, 0);
    }
    
    @Test
    public void numberOfOneSequencesIsTwo() throws Exception {
        assertNonAdiacentOneSequences(2, 1);
    }
    
    @Test
    public void numberOfTwoSequencesIsThree() throws Exception {
        assertNonAdiacentOneSequences(3, 2);
    }
    
    @Test
    public void numberOfThreeSequencesIsFive() throws Exception {
        assertNonAdiacentOneSequences(5, 3);
    }
    
    @Test
    public void numberOfFourSequencesIsEight() throws Exception {
        assertNonAdiacentOneSequences(8, 4);
    }
    @Test
    public void numberOfFiveSequencesIsThirteen() throws Exception {
        assertNonAdiacentOneSequences(13, 5);
    }
    private void assertNonAdiacentOneSequences(int expectedResult, int bitLength) {
        assertEquals(expectedResult, nonAdiacentOneSequences(bitLength));
    }
    
    int nonAdiacentOneSequences(int bitLength) {
        if (bitLength < 1) {
            return 1;
        }
        return nonAdiacentOneSequences(bitLength-1)+
               nonAdiacentOneSequences(bitLength-2);
        
    }
}