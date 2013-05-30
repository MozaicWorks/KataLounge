/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.reversi;

import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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
    public void finishOnOneEmptySquareLine() {
        reversi.line(1, Color.GRAY);
        
        assertTrue(reversi.isFinished());
    }
    
    @Test
    public void finishOnTwoEmptySquareLine() throws Exception {
        
    }
   
}