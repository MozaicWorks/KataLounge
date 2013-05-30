/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.reversi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author Catalin
 */
public class ReversiTest {
    
    private Reversi reversi;
    
    @Before
    public void setUp() {
        reversi = new Reversi();
    }

    @Test
    public void finishOnEmptyBoard() {
        reversi.emptyBoard();
        
        assertTrue(reversi.isFinished());
    }
    
    @Test
    public void finishOnOneSquareLine() {
        reversi.line(1);
        
        assertTrue(reversi.isFinished());
    }
    
    @Test
    @Ignore
    public void finishOnOneSquareLineWithAnyColor() throws Exception {
        reversi.line(1);
        
        assertTrue(reversi.isFinished());
    }
   
}