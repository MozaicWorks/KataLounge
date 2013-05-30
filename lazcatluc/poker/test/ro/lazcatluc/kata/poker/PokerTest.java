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
        Poker poker = new PokerBuilder().createPoker();
        
        assertTrue(poker.isDraw());
    }
    
    @Test
    public void oneCardFirstCardHigherFirstPlayerWins() throws Exception {
        Player player1 = new PlayerBuilder().setCard(2).createPlayer();
        Player player2 = new PlayerBuilder().setCard(1).createPlayer();
        
        Poker poker = new PokerBuilder().setPlayer1(player1).setPlayer2(player2).createPoker();
        
        assertEquals(player1, poker.getWinner());
    }
    
    @Test
    public void oneCardSecondCardHigherSecondPlayerWins() throws Exception {
        Player player1 = new PlayerBuilder().setCard(1).createPlayer();
        Player player2 = new PlayerBuilder().setCard(2).createPlayer();
        
        Poker poker = new PokerBuilder().setPlayer1(player1).setPlayer2(player2).createPoker();
        
        assertEquals(player2, poker.getWinner());
        
    }    
    
    @Test
    public void oneCardEqualCardsIsDraw() throws Exception {
        Poker poker = new PokerBuilderWithCards(2, 2).createPoker();
        
        assertTrue(poker.isDraw());
    }
    
}