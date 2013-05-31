/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

import java.util.Scanner;

/**
 *
 * @author Catalin
 */
public class Bowling {

    private Roll previousRoll = new RollBuilder().createRoll();
    private Roll roll = new RollBuilder().createRoll();
    private int result = 0;

    public void roll(Roll newRoll) {
        if (previousRoll.hasStrikeBonus() && roll.hasStrikeBonus()) {
            result += newRoll.getFirst();
        }
        if (roll.hasBonus()) {
            result += newRoll.getFirst();
            if (roll.hasStrikeBonus() && !newRoll.hasStrikeBonus()) {
                result += newRoll.getSecond();
            }
        }
        result += newRoll.getResult();
        previousRoll = roll;
        roll = newRoll;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        System.out.println("nr of frames: ");
        Scanner scanner = new Scanner(System.in);
        int frames = scanner.nextInt();
        Bowling bowling = new Bowling();
        Roll currentRoll = new RollBuilder().createRoll();
        for (int i = 1; i <= frames; i++) {
            int[] rolls = new int[2];
            for (int j = 0; j < 2; j++) {
                System.out.println("Frame " + i + ", roll " + (j + 1) + ": ");
                rolls[j] = scanner.nextInt();
                if (rolls[j]==Roll.STRIKE_SCORE && j == 0) {
                    System.out.println("Strike!");
                    break;
                }
            }
            RollBuilder rollBuilder = new RollBuilder().setFirst(rolls[0]).setSecond(rolls[1]);
            if (i == frames) {
                if (currentRoll.hasBonus()) {
                    System.out.println("Bonus throw:");
                    rollBuilder.setBonus(scanner.nextInt());
                }
                if (currentRoll.hasStrikeBonus()) {
                    System.out.println("Strike bonus throw:");
                    rollBuilder.setStrikeBonus(scanner.nextInt());
                }
            }
            currentRoll = rollBuilder.createRoll();
            bowling.roll(currentRoll);
            System.out.println("Current score: "+bowling.result);
        }
        
        System.out.println("Final result: "+bowling.result);
    }
}
