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
    
    public int getResult() {
        return result;
    }
}
