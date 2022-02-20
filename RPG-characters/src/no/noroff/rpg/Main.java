package no.noroff.rpg;

import no.noroff.rpg.display.CharacterStatsDisplay;
import no.noroff.rpg.heroes.Mage;
import no.noroff.rpg.items.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Weapon sword = new Weapon("Katana", 2, "weapon");
        for (Weapon.Type myVar : Weapon.Type.values()){
            if(Objects.equals(myVar.toString(), "SWORD")){
                System.out.println(myVar);
            }
        }

         */

        Mage Gandalf = new Mage("Gandalf");
        System.out.println(Gandalf.getDPS());
       // System.out.println(Gandalf.getLevel() + " ," + Gandalf.getBaseAtt().getIntelligence());
        Gandalf.levelUp();
       // System.out.println(Gandalf.getLevel() + " ," + Gandalf.getBaseAtt().getIntelligence());
        Weapon staff = new Weapon("Staff",1, SlotSpot.WEAPON, WeaponType.STAFF);
        Gandalf.equip(staff);
        //Gandalf.printStats();
        System.out.println(CharacterStatsDisplay.statsDisplay(Gandalf));
        System.out.println();
        System.out.println();

        Gandalf.levelUp();

        Armor robe = new Armor("Robe", 2, SlotSpot.BODY, ArmorType.CLOTH);
        Gandalf.equip(robe);
        System.out.println(Gandalf.printStats());
    }
}
