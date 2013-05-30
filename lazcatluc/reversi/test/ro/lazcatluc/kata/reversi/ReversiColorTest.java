/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.reversi;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Catalin
 */
@RunWith(Parameterized.class)
public class ReversiColorTest {
    
    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] { {Color.BLACK}, {Color.WHITE} });
    }
    
    private final Color color;
    private Reversi reversi;
    
    @Before
    public void setUp() {
        reversi = new Reversi();
    }
    
    public ReversiColorTest(Color color) {
        this.color = color;
    }
    
    @Test
    public void finishOnOneSquareLineWithAnyColor() throws Exception {
        reversi.line(1, color);
        
        assertTrue(reversi.isFinished());
    }
}
