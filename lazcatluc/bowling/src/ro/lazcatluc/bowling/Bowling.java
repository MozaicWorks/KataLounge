/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

/**
 *
 * @author Catalin
 */
public class Bowling {

    private Roll previousRoll = new RollBuilder().createRoll();
    private Roll roll = new RollBuilder().createRoll();
    private int result = 0;
    
    public void roll(Roll newRoll) {
        if (previousRoll.hasStrikeBonus() && roll.hasStrikeBonus()) {
            result += newRoll.getFirst();
        }
        if (roll.hasBonus()) {
            result += newRoll.getFirst();
            if (roll.hasStrikeBonus() && !newRoll.hasStrikeBonus()) {
                result += newRoll.getSecond();
            }
        }
        result += newRoll.getResult();
        previousRoll = roll;
        roll = newRoll;
    }
    
    public int getResult() {
        return result;
    }

}
