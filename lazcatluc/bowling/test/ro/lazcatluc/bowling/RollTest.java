/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Catalin
 */
public class RollTest {
    @Test
    public void rollingZeroOneDoesntHaveBonus() throws Exception {
        Roll roll = new RollBuilder().setFirst(0).setSecond(1).createRoll();
        
        assertFalse(roll.hasBonus());
    }
    
    @Test
    public void rollingFiveFiveHasBonus() throws Exception {
        Roll roll = new RollBuilder().setFirst(5).setSecond(5).createRoll();
        
        assertTrue(roll.hasBonus());
    }
    
    @Test
    public void rollingTenHasBonus() throws Exception {
        Roll roll = new RollBuilder().setFirst(10).createRoll();
        
        assertTrue(roll.hasBonus());
    }
    
    @Test
    public void rollingTenHasStrikeBonus() throws Exception {
        Roll roll = new RollBuilder().setFirst(10).createRoll();
        
        assertTrue(roll.hasStrikeBonus());
    }
    
    @Test
    public void rollingFiveFiveDoesntHaveStrikeBonus() throws Exception {
        Roll roll = new RollBuilder().setFirst(5).setSecond(5).createRoll();
        
        assertFalse(roll.hasStrikeBonus());
    }
}
