/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.lazcatluc.bowling;

public class RollBuilder {

    private int first = 0;
    private int second = 0;
    private int bonus = 0;
    private int strikeBonus = 0;

    public RollBuilder() {
    }

    public RollBuilder setFirst(int first) {
        this.first = first;
        return this;
    }

    public RollBuilder setSecond(int second) {
        this.second = second;
        return this;
    }

    public RollBuilder setBonus(int bonus) {
        this.bonus = bonus;
        return this;
    }
    
    public RollBuilder setStrikeBonus(int strikeBonus) {
        this.strikeBonus = strikeBonus;
        return this;
    }

    public Roll createRoll() {
        return new Roll(first, second, bonus, strikeBonus);
    }
    
    public RollBuilder withTotalResult(int result) {
        setFirst(0);
        setSecond(result);
        setBonus(0);
        setStrikeBonus(0);
        return this;
    }
    
    public RollBuilder strike() {
        setFirst(10);
        setSecond(0);
        return this;
    }
    
    public RollBuilder spare() {
        setFirst(0);
        setSecond(10);
        return this;
    }
}
