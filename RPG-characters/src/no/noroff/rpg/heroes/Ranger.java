package no.noroff.rpg.heroes;

import no.noroff.rpg.attributes.BaseAttributes;
import no.noroff.rpg.items.*;

import java.util.Arrays;
import java.util.HashSet;

public class Ranger extends Hero{

    public Ranger(String name) {
        super(name, new BaseAttributes(1,7,1),
                new HashSet<>(Arrays.asList(WeaponType.BOW)),
                new HashSet<>(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL)));
    }

    @Override
    public void levelUp() {
        baseAtt.increase(1,5,1);
        level++;
        updateCharacterDPS();
    }

    @Override
    public void equip(Item item) throws Exception{
        super.equip(item);
        if(item.getSlot() == SlotSpot.WEAPON) {
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

        double totalMainPrimaryAttribute = totalATT.getDexterity();

        double herodps  = weaponDPS*(1 +(totalMainPrimaryAttribute/100));
        this.heroDPS = Math.round(herodps * 100.0) / 100.0;
    }
}
