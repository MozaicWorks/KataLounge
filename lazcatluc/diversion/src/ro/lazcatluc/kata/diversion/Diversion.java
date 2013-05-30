/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.kata.diversion;

/**
 *
 * @author Catalin
 */
public class Diversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bitLength = 10;
        System.out.println(nonAdiacentOneSequences(bitLength));
    }

    public static long nonAdiacentOneSequences(int bitLength) {
        if (bitLength < 1) {
            return 1;
        }
        return nonAdiacentOneSequences(bitLength - 1) + nonAdiacentOneSequences(bitLength - 2);
    }
}
