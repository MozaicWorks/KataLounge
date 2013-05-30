/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.reversi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class ReversiTest {
    

    @Test
    public void finishOnEmptyBoard() {
        emptyBoard();
        
        assertTrue(isFinished());
    }
    
    boolean isFinished() {
        return true;
    }
    
    void emptyBoard() {
        
    }
   
}