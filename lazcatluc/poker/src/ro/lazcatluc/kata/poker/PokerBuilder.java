/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;


public class PokerBuilder {
    private Player player1 = new PlayerBuilder().createPlayer();
    private Player player2 = new PlayerBuilder().createPlayer();

    public PokerBuilder() {
    }

    public PokerBuilder setPlayer1(Player player1) {
        this.player1 = player1;
        return this;
    }

    public PokerBuilder setPlayer2(Player player2) {
        this.player2 = player2;
        return this;
    }

    public Poker createPoker() {
        return new Poker(player1, player2);
    }
    
}
