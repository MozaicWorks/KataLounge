/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.bankocr;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Catalin
 */
public class ReadOneNumberTest {
    
    public ReadOneNumberTest() {
    }
    
    @Test
    public void readOneIs1() throws Exception {
        String one = 
        "   "+
        "  |"+
        "  |";
        
        assertEquals(1, parse(one));
    }
    
    @Test
    public void readTwoIs2() throws Exception {
        String two = 
        " _ "+
        " _|"+
        "|_ ";
        
        assertEquals(2, parse(two));
    }
    
    @Test
    public void readThreeIs3() throws Exception {
        String three=
        " _ "+
        " _|"+
        " _|";
        
        assertEquals(3, parse(three));
    }
    
    @Test
    public void readFourIs4() throws Exception {
        String four = 
        "   "+
        "|_|"+
        "  |";
        
        assertEquals(4, parse(four));
    }
    
    int parse(String s) {
        if (parseOne(s)) return 1;
        if (parseTwo(s)) return 2;
        if (parseThree(s)) return 3;
        return 4;
    }
    
    boolean parseOne(String s) {
        return !s.contains("_");
    }
    
    boolean parseTwo(String s) {
        return s.endsWith(" ");
    }
    
    boolean parseThree(String s) {
        return !s.startsWith("  ");
    }
    
}