package no.noroff.rpg.items;

import no.noroff.rpg.attributes.BaseAttributes;

public class Armor extends Item {


    private ArmorType ARMOR_TYPE;
    private BaseAttributes attributes;



    public Armor(String name, int requiredLevel, SlotSpot slot, ArmorType armorType ) {
        super(name, requiredLevel, slot);
        ARMOR_TYPE = armorType;
        attributes = new BaseAttributes(3,3,3);
    }

    public ArmorType getARMOR_TYPE() {
        return ARMOR_TYPE;
    }

    public BaseAttributes getAttributes() {
        return attributes;
    }

}
