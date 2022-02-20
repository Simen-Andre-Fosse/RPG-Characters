package no.noroff.rpg.heroes;

import no.noroff.rpg.attributes.BaseAttributes;
import no.noroff.rpg.items.*;

import java.util.Arrays;
import java.util.HashSet;

public class Mage extends Hero{

    public Mage(String name) {
        super(name,new BaseAttributes(1,1,8),
                new HashSet<>(Arrays.asList(WeaponType.STAFF, WeaponType.WAND)),
                new HashSet<>(Arrays.asList(ArmorType.CLOTH)));

    }

    @Override
    public void levelUp() {
        baseAtt.increase(1,1,5);
        level++;
        updateCharacterDPS();
    }

    @Override
    public void equip(Item item) throws Exception {
        super.equip(item);
        if(item.getSlot() == SlotSpot.WEAPON){
            updateCharacterDPS();
        }
    }

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
