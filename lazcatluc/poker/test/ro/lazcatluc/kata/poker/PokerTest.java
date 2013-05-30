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
public class PokerTest { 

    @Test
    public void noCardsGameIsDraw() {
        Poker poker = new Poker(new Player(0), new Player(0));
        
        assertTrue(poker.isDraw());
    }
    
    @Test
    public void oneCardFirstCardHigherFirstPlayerWins() throws Exception {
        Player player1 = new Player(1);
        Player player2 = new Player(0);
        
        Poker poker = new Poker(player1, player2);
        
        assertEquals(player1, poker.getWinner());
    }
    
    @Test
    public void oneCardEqualCardsIsDraw() throws Exception {
        Player player1 = new Player(1);
        Player player2 = new Player(1);
        
        Poker poker = new Poker(player1, player2);
        
        assertTrue(poker.isDraw());
    }
}