/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Catalin
 */
public class PokerNoCardsTest {

    @Test
    public void noCardsGameIsDraw() {
        Poker poker = new PokerBuilder().createPoker();

        assertTrue(poker.isDraw());
    }
}
