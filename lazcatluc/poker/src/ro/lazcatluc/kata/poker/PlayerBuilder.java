/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.poker;


public class PlayerBuilder {
    private int card=0;

    public PlayerBuilder() {
    }

    public PlayerBuilder setCard(int card) {
        this.card = card;
        return this;
    }

    public Player createPlayer() {
        return new Player(card);
    }
    
}
