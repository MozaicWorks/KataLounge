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
    private final int first;
    private final int second;
    private final int bonus;

    public Roll(int first, int second, int bonus) {
        this.first = first;
        this.second = second;
        this.bonus = bonus;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    
    public boolean hasBonus() {
        return first + second == 10;
    }
    
    public boolean hasStrikeBonus() {
        return first == 10;
    }
    
    public int getResult() {
        return first + second + (hasBonus()?bonus:0);
    }
    
}
