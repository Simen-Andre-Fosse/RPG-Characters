package no.noroff.rpg.items;

import no.noroff.rpg.exceptions.InvalidArmorException;
import no.noroff.rpg.exceptions.InvalidWeaponException;
import no.noroff.rpg.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test void equip_WarriorLevel1EquipsBowLevel2_ExpectsInvalidWeaponException(){
        //Arrange
        Warrior warrior = new Warrior("Arragorn");
        Weapon axe = new Weapon("Axe", 2,SlotSpot.WEAPON,WeaponType.AXE);
        //Act
        InvalidWeaponException thrown = Assertions.assertThrows(InvalidWeaponException.class, () -> {
            warrior.equip(axe);
        });
        String expected = "This weapon requires a higher level.";

        String actual = thrown.getMessage();

        //Assert
        Assertions.assertEquals(expected,actual);
    }


    @Test void equip_WarriorLevel1EquipsArmorPlateLevel2_ExpectsInvalidArmorException(){
        //Arrange
        Warrior warrior = new Warrior("Arragorn");
        Armor armor = new Armor("ArmorPlate", 2, SlotSpot.BODY,ArmorType.PLATE);
        //Act
        InvalidArmorException thrown = Assertions.assertThrows(InvalidArmorException.class, () -> {
            warrior.equip(armor);
        });
        String expected = "This armor requires a higher level.";

        String actual = thrown.getMessage();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test void equip_WarriorEquipsBow_expectsInvalidWeaponException(){
        Warrior warrior = new Warrior("Arragorn");
        Weapon bow = new Weapon("Bow", 1, SlotSpot.WEAPON, WeaponType.BOW);

        //Act
        InvalidWeaponException thrown = Assertions.assertThrows(InvalidWeaponException.class, () -> {
            warrior.equip(bow);
        });
        String expected = "Invalid Weapon Type.";

        String actual = thrown.getMessage();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test void equip_WarriorEquipsWrongArmorType_expectsInvalidArmorException(){
        Warrior warrior = new Warrior("Arragorn");
        Armor armor = new Armor("Armor", 1, SlotSpot.BODY, ArmorType.CLOTH);

        //Act
        InvalidArmorException thrown = Assertions.assertThrows(InvalidArmorException.class, () -> {
            warrior.equip(armor);
        });
        String expected = "Invalid Armor Type.";

        String actual = thrown.getMessage();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test void equip_WarriorEquipsValidWeapon_expectsBooleanTrue() throws Exception {
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        Weapon axe = new Weapon("axe", 1, SlotSpot.WEAPON, WeaponType.AXE);

        //Act
        warrior.equip(axe);
        boolean expected = true;
        boolean actual = warrior.getEquipment().get(SlotSpot.WEAPON) == axe;

        //Assert
        assertEquals(expected, actual);
    }

    @Test void equip_WarriorEquipsValidArmor_expectsBooleanTrue() throws Exception {
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        Armor armor = new Armor("Armor", 1, SlotSpot.BODY, ArmorType.PLATE);

        //Act
        warrior.equip(armor);
        boolean expected = true;
        boolean actual = warrior.getEquipment().get(SlotSpot.BODY) == armor;

        //Assert
        assertEquals(expected, actual);
    }

    @Test void calculateDPS_ifNoWeaponsEquiped_expectsWarriorLevel1DPSIs105(){
        //Arrange
        Warrior warrior = new Warrior("Warrior");

        //Act
        double expected = 1*(1+ (5/100.00));
        double actual = warrior.getDPS();

        //Assert
        assertEquals(expected, actual);
    }

    @Test void calculateDPS_ifWeaponEquiped_expectsWarriorLevel1DPSIs808() throws Exception {
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        Weapon weapon = new Weapon("Axe", 1, SlotSpot.WEAPON, WeaponType.AXE);

        //Act
        warrior.equip(weapon);
        double expected = (5*1)*(1+(5/100.00));
        double actual = warrior.getDPS();

        //Assert
        assertEquals(expected, actual);
    }


    @Test void calculateDPS_ifValidWeaponAndArmorEquipped_expects54() throws Exception {
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        Weapon weapon = new Weapon("Axe", 1, SlotSpot.WEAPON, WeaponType.AXE);
        Armor armor = new Armor("Armor Plate", 1, SlotSpot.BODY,ArmorType.PLATE);

        //Act
        warrior.equip(weapon);
        warrior.equip(armor);
        double expected = 5*(1+ 8/100.00);
        double actual = warrior.getDPS();


        //Assert
        assertEquals(expected,actual);
    }













}