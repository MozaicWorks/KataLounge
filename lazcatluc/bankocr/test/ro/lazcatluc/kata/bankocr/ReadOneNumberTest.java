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
    
    @Test
    public void readOneIs1() throws Exception {
        String one = 
        "   "+
        "  |"+
        "  |";
        
        assertParsesTo(1, one);
    }
    
    @Test
    public void readTwoIs2() throws Exception {
        String two = 
        " _ "+
        " _|"+
        "|_ ";
        
        assertParsesTo(2, two);
    }
    
    @Test
    public void readThreeIs3() throws Exception {
        String three=
        " _ "+
        " _|"+
        " _|";
        
        assertParsesTo(3, three);
    }
    
    @Test
    public void readFourIs4() throws Exception {
        String four = 
        "   "+
        "|_|"+
        "  |";
        
        assertParsesTo(4, four);
    }
    
    @Test
    public void readFiveIs5() throws Exception {
        String five =
        " _ "+
        "|_ "+
        " _|"; 
        
        assertParsesTo(5, five);
    }
    
    @Test
    public void readSixIs6() throws Exception {
        String six = 
        " _ "+
        "|_ "+
        "|_|"; 
        
        assertParsesTo(6, six);        
    }
    
    @Test
    public void readSevenIs7() throws Exception {
        String seven = 
        " _ "+
        "  |"+
        "  |";
        
        assertParsesTo(7, seven);
    }
    
    @Test
    public void readEightIs8() throws Exception {
        String eight = 
        " _ "+
        "|_|"+
        "|_|";
        
        assertParsesTo(8, eight);
    }
    
    @Test
    public void readNineIs9() throws Exception {
        String nine = 
        " _ "+
        "|_|"+
        " _|";
        
        assertParsesTo(9, nine);
    }
    
    @Test
    public void readZeroIs0() throws Exception {
        String zero = 
        " _ "+
        "| |"+
        "|_|";
        
        assertParsesTo(0, zero);
    }
    
    private void assertParsesTo(int expectedResult, String from) {
        assertEquals(expectedResult, new Parser().parse(from));
    }
}