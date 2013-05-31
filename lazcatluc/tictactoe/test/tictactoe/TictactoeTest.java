/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Catalin
 */
public class TictactoeTest {
    private Object X = new Object();
    private Object turn = X;
    private Object Z = new Object();
    
   
    @Test
    public void xPlaysFirst() {
        
        assertEquals(X, turn);
    }
    
    @Test
    public void zPlaysSecond() throws Exception {        
        play();
        
        assertEquals(Z, turn);
    }

    private void play() {
        turn = Z;
    }
}