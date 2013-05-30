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

    int result = 0;
    
    public void roll(int popice) {
        result += popice;
    }
    
    public void roll(Roll roll) {
        result += roll.getFirst() + roll.getSecond();
    }
    
    public int getResult() {
        return result;
    }
    
    public boolean hasBonus() {
        return result == 10;
    }
}
