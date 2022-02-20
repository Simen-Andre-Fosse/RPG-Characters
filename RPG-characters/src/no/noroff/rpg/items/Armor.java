package no.noroff.rpg.items;

import no.noroff.rpg.attributes.BaseAttributes;

/**
 * Class for Armor
 * Child of Item.
 */
public class Armor extends Item {

    //Fields
    private ArmorType ARMOR_TYPE;
    private BaseAttributes attributes;


    /**
     * Constructor
     * @param name, the name.
     * @param requiredLevel, the required level
     * @param slot, the slot.
     * @param armorType, the armor type.
     */
    public Armor(String name, int requiredLevel, SlotSpot slot, ArmorType armorType ) {
        super(name, requiredLevel, slot);
        ARMOR_TYPE = armorType;
        attributes = new BaseAttributes(3,3,3);
    }

    /**
     * @return the armor type.
     */
    public ArmorType getARMOR_TYPE() {
        return ARMOR_TYPE;
    }

    /**
     * @return the base attributes.
     */
    public BaseAttributes getAttributes() {
        return attributes;
    }
}
