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
        assertNonAdiacentOneSequences(0, 0);
    }
    
    @Test
    public void numberOfOneSequencesIsTwo() throws Exception {
        assertNonAdiacentOneSequences(2, 1);
    }
    
    private void assertNonAdiacentOneSequences(int expectedResult, int bitLength) {
        assertEquals(expectedResult, nonAdiacentOneSequences(bitLength));
    }
    
    int nonAdiacentOneSequences(int bitLength) {
        return bitLength * 2;
    }
}