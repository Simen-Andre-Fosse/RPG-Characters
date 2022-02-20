package no.noroff.rpg.heroes;

import no.noroff.rpg.attributes.BaseAttributes;
import no.noroff.rpg.items.*;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Class for Mage
 * child of Hero class.
 */
public class Mage extends Hero{

    /**
     * Constructor
     * @param name, name of Mage
     */
    public Mage(String name) {
        super(name,new BaseAttributes(1,1,8),
                new HashSet<>(Arrays.asList(WeaponType.STAFF, WeaponType.WAND)),
                new HashSet<>(Arrays.asList(ArmorType.CLOTH)));

    }

    /**
     * Method for leveling up.
     */
    @Override
    public void levelUp() {
        baseAtt.increase(1,1,5);
        level++;
        updateCharacterDPS();
    }

    /**
     * Method for equipping
     * @param item, the item.
     * @throws Exception, the exception.
     */
    @Override
    public void equip(Item item) throws Exception {
        super.equip(item);
        if(item.getSlot() == SlotSpot.WEAPON){
            updateCharacterDPS();
        }
    }

    /**
     * Method for updating characterDPS
     */
    @Override
    public void updateCharacterDPS() {
        int weaponDPS = 1;
        if(equipment.get(SlotSpot.WEAPON) != null){
            Item weapon = equipment.get(SlotSpot.WEAPON);
            weaponDPS = ((Weapon)weapon).getDPS();
        }

        double totalMainPrimaryAttribute = totalATT.getIntelligence();

        double herodps  = weaponDPS*(1 +(totalMainPrimaryAttribute/100));
        this.heroDPS = Math.round(herodps * 100.0) / 100.0;

    }

}
