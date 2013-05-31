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

    private Roll roll = new RollBuilder().createRoll();
    private int result = 0;
    
    public void roll(Roll roll) {
        if (this.roll.hasBonus()) {
            result += roll.getFirst();
        }
        result += roll.getResult();
        this.roll = roll;
    }
    
    public int getResult() {
        return result;
    }

}
