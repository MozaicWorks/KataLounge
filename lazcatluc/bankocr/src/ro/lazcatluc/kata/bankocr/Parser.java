/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.bankocr;

/**
 *
 * @author Catalin
 */
public class Parser {

    int parse(String s) {
        if (parseOne(s)) return 1;
        if (parseTwo(s)) return 2;
        if (parseThree(s)) return 3;
        if (parseFour(s)) return 4;
        if (parseFive(s)) return 5;
        if (parseSix(s)) return 6;
        if (parseSeven(s)) return 7;
        if (parseEight(s)) return 8;
        if (parseNine(s)) return 9;
        
        return 0;
    }

    boolean parseFour(String s) {
        return s.startsWith("   ");
    }

    boolean parseSeven(String s) {
        return s.endsWith("  |");
    }

    boolean parseTwo(String s) {
        return s.endsWith(" ");
    }

    boolean parseNine(String s) {
        return s.endsWith(" _|");
    }

    boolean parseOne(String s) {
        return !s.contains("_");
    }

    boolean parseEight(String s) {
        return s.endsWith("_||_|");
    }

    boolean parseFive(String s) {
        return s.endsWith("  _|");
    }

    boolean parseSix(String s) {
        return s.endsWith(" |_|");
    }

    boolean parseThree(String s) {
        return !s.contains("|_") && s.endsWith("_|");
    }
}
