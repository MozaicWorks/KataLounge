/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

/**
 *
 * @author Catalin
 */
public class Roll {
    public static final int STRIKE_SCORE = 10;
    
    private final int first;
    private final int second;
    private final int bonus;
    private final int strikeBonus;

    public Roll(int first, int second, int bonus, int strikeBonus) {
        this.first = first;
        this.second = second;
        this.bonus = bonus;
        this.strikeBonus = strikeBonus;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    
    public boolean hasBonus() {
        return first + second == STRIKE_SCORE;
    }
    
    public boolean hasStrikeBonus() {
        return first == Roll.STRIKE_SCORE;
    }
    
    public int getResult() {
        return first + second + 
                (hasBonus()?bonus:0) + 
                (hasStrikeBonus()?strikeBonus:0);
    }
    
}
