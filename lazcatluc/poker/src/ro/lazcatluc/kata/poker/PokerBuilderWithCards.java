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
    
    private int card1;
    private int card2;

    public PokerBuilderWithCards() {
        this.card1 = 1;
        this.card2 = 1;
    }
    
    public PokerBuilderWithCards(int card1, int card2) {
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public Poker createPoker() {
        return new PokerBuilder().setPlayer1(new PlayerBuilder().setCard(card1).createPlayer())
                .setPlayer2(new PlayerBuilder().setCard(card2).createPlayer()).createPoker();
    }
    
    public Poker createPlayer1Wins() {
        this.card1 = 2;
        return createPoker();
    }
    
    public Poker createPlayer2Wins() {
        this.card2 = 2;
        return createPoker();
    }
}
