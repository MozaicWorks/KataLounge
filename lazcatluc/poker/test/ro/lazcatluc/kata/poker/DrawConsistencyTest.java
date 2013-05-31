/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class DrawConsistencyTest {
    
    @Test
    public void notDrawWhenPlayer1Wins() throws Exception {
        Poker poker = new PokerBuilderWithCards().createPlayer1Wins();
        
        assertFalse(poker.isDraw());
    }
    
    @Test
    public void notDrawWhenPlayer2Wins() throws Exception {
        Poker poker = new PokerBuilderWithCards().createPlayer2Wins();
        
        assertFalse(poker.isDraw());
    }
    
    @Test(expected = IllegalStateException.class)
    public void cannotGetWinnerIfIsDraw() throws Exception {
        Poker poker = new PokerBuilderWithCards().createPoker();
        
        poker.getWinner();
    }
}
