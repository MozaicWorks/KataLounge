/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;

/**
 *
 * @author Catalin
 */
public class Poker {
    private final Player player2;
    private final Player player1;
    
    public Poker(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public boolean isDraw() {
        return true;
    }
    
    public Player getWinner() {
        return player1.getCard() > player2.getCard() ? player1 : player2;
    }
}
