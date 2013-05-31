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
    private int squaresPerLine;
    
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
    public void zeroSquaresBoardIsDraw() throws Exception {
        Object DRAW = new Object();
        Object result = DRAW;
        
        board(0);
        
        assertEquals(DRAW, result);
    }
    
    @Test
    public void xWinsOnOneSquareBoardAfterPlaying() throws Exception {
        board(1);
        
        play();
        
        assertEquals(X, winner());
    }
    
    private Object winner() {
        return X;
    }
    
    private void board(int squaresPerLine) {
        this.squaresPerLine = squaresPerLine;
    }

    private void play() {
        turn = Z;
    }
}