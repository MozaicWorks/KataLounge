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
    
    @Test
    public void readFiveIs5() throws Exception {
        String five =
        " _ "+
        "|_ "+
        " _|"; 
        
        assertEquals(5, parse(five));
    }
    
    @Test
    public void readSixIs6() throws Exception {
        String six = 
        " _ "+
        "|_ "+
        "|_|"; 
        
        assertEquals(6, parse(six));        
    }
    
    @Test
    public void readSevenIs7() throws Exception {
        String seven = 
        " _ "+
        "  |"+
        "  |";
        
        assertEquals(7, parse(seven));
    }
    
    @Test
    public void readEightIs8() throws Exception {
        String eight = 
        " _ "+
        "|_|"+
        "|_|";
        
        assertEquals(8, parse(eight));
    }
    
    int parse(String s) {
        if (parseOne(s)) return 1;
        if (parseTwo(s)) return 2;
        if (parseThree(s)) return 3;
        if (parseFour(s)) return 4;
        if (parseFive(s)) return 5;
        if (parseSix(s)) return 6;
        if (parseSeven(s)) return 7;
        return 8;
    }
    
    boolean parseOne(String s) {
        return !s.contains("_");
    }
    
    boolean parseTwo(String s) {
        return s.endsWith(" ");
    }
    
    boolean parseThree(String s) {
        return !s.contains("|_") && s.endsWith("_|");
    }
    
    boolean parseFour(String s) {
        return s.startsWith("   ");
    }
    
    boolean parseFive(String s) {
        return s.endsWith(" _|");
    }
    
    boolean parseSix(String s) {
        return s.endsWith(" |_|");
    }
    
    boolean parseSeven(String s) {
        return s.endsWith("  |");
    }
}