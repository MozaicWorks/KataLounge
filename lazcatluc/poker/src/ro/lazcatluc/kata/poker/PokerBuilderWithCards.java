/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;

/**
 *
 * @author Catalin
 */
public class PokerBuilderWithCards {
    
    private final int card1;
    private final int card2;

    public PokerBuilderWithCards(int card1, int card2) {
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public Poker createPoker() {
        return new PokerBuilder().setPlayer1(new PlayerBuilder().setCard(card1).createPlayer())
                .setPlayer2(new PlayerBuilder().setCard(card2).createPlayer()).createPoker();
    }
    
}
