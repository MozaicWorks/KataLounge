/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class TictactoeTest {
    
   
    @Test
    public void xPlaysFirst() {
        Object X = new Object();
        Object turn = X;
        
        assertEquals(X, turn);
    }
}