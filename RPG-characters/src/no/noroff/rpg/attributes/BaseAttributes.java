package no.noroff.rpg.attributes;

import no.noroff.rpg.items.Item;

import java.util.HashMap;

/*
    Class for the base attributes used in both Hero class and Armor class.
 */

public class BaseAttributes {
    protected int Strength;
    protected int Dexterity;
    protected int Intelligence;

    /**
     * Constructor
     * @param Strength The strength.
     * @param Dexterity The dexterity.
     * @param Intelligence The intelligence.
     */
    public BaseAttributes(int Strength, int Dexterity, int Intelligence){
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
    }

    /**
     * @return Strength
     */
    public int getStrength() {
        return Strength;
    }

    /**
     *
     * @return Dexterity
     */
    public int getDexterity() {
        return Dexterity;
    }

    /**
     *
     * @return Intelligence
     */
    public int getIntelligence() {
        return Intelligence;
    }

    /**
     * Sets Strength
     * @param strength, the strength
     */
    public void setStrength(int strength) {
        Strength = strength;
    }

    /**
     * Sets dexterity
     * @param dexterity, the dexterity
     */
    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    /**
     * Sets intelligence
     * @param intelligence, the intelligence
     */
    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    /**
     * Increases attributes based on input.
     * @param strength the stength.
     * @param dexterity the dexterity.
     * @param intelligence the intelligence.
     */
    public void increase(int strength, int dexterity, int intelligence){
        this.Strength += strength;
        this.Dexterity += dexterity;
        this.Intelligence += intelligence;
    }
}
