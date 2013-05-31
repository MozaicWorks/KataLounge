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

    private Roll roll;
    private int result = 0;
    
    public void roll(Roll roll) {
        this.roll = roll;
        result += roll.getResult();
    }
    
    public int getResult() {
        return result;
    }

}
