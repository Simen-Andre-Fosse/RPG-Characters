package no.noroff.rpg;

import no.noroff.rpg.display.CharacterStatsDisplay;
import no.noroff.rpg.heroes.Mage;
import no.noroff.rpg.items.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
            Example of a character being made and interacted with, then have its stats displayed.
         */
        Mage Gandalf = new Mage("Gandalf");
        Gandalf.levelUp();
        Weapon staff = new Weapon("Staff",1, SlotSpot.WEAPON, WeaponType.STAFF);
        Gandalf.equip(staff);
        Gandalf.levelUp();
        Armor robe = new Armor("Robe", 2, SlotSpot.BODY, ArmorType.CLOTH);
        Gandalf.equip(robe);
        System.out.println(Gandalf.printStats());
    }
}
