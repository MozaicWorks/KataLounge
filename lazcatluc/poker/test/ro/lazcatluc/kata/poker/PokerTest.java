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
        Poker poker = new Poker();
        
        assertTrue(poker.isDraw());
    }
}