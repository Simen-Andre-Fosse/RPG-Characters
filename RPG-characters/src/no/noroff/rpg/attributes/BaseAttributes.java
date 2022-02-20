package no.noroff.rpg.attributes;

import no.noroff.rpg.items.Item;

import java.util.HashMap;

public class BaseAttributes {
    protected int Strength;
    protected int Dexterity;
    protected int Intelligence;


    public BaseAttributes(int Strength, int Dexterity, int Intelligence){
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
    }

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public void increase(int strength, int dexterity, int intelligence){
        this.Strength += strength;
        this.Dexterity += dexterity;
        this.Intelligence += intelligence;
    }
}
