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

    Roll roll;
    
    public void roll(Roll roll) {
        this.roll = roll;
    }
    
    public int getResult() {
        return roll.getResult();
    }

}
