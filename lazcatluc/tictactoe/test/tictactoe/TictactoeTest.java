/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Catalin
 */
public class TictactoeTest {
    private Object X;
    private Object turn;
    private Object Z;
    
    @Before
    public void setUp() {
        X = new Object();
        turn = X;
        Z = new Object();
    }
    
   
    @Test
    public void xPlaysFirst() {
        assertEquals(X, turn);
    }
    
    @Test
    public void zPlaysSecond() throws Exception {        
        play();
        
        assertEquals(Z, turn);
    }
    
    @Test
    public void emptyBoardIsDraw() throws Exception {
        Object DRAW = new Object();
        Object result = DRAW;
        
        assertEquals(DRAW, result);
    }

    private void play() {
        turn = Z;
    }
}