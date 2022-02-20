package no.noroff.rpg.heroes;

import no.noroff.rpg.attributes.BaseAttributes;
import no.noroff.rpg.display.CharacterStatsDisplay;
import no.noroff.rpg.exceptions.InvalidArmorException;
import no.noroff.rpg.exceptions.InvalidWeaponException;
import no.noroff.rpg.items.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Hero implements HeroInterface{
    protected String name;
    protected int level = 1;
    protected BaseAttributes baseAtt;
    protected BaseAttributes totalATT;
    protected double heroDPS;
    protected HashMap<SlotSpot, Item> equipment;
    protected HashSet<WeaponType> validWeapons;
    protected HashSet<ArmorType> validArmor;


    public double getDPS() {
        updateCharacterDPS();
        return heroDPS;
    }

    public Hero (String name, BaseAttributes baseAtt, HashSet<WeaponType> validWeapons, HashSet<ArmorType> validArmor){
        this.name = name;
        this.baseAtt = baseAtt;
        this.validWeapons = validWeapons;
        this.validArmor = validArmor;
        totalATT = baseAtt;
        initializeEquipment();
        updateCharacterDPS();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public BaseAttributes getBaseAtt() {
        return baseAtt;
    }

    public BaseAttributes getTotalATT() {
        return totalATT;
    }

    private void initializeEquipment(){
        equipment = new HashMap<>();
        equipment.put(SlotSpot.HEAD, null);
        equipment.put(SlotSpot.BODY, null);
        equipment.put(SlotSpot.LEGS, null);
        equipment.put(SlotSpot.WEAPON, null);

    }

    private void updateTotalAttributes(){
        Item head = equipment.get(SlotSpot.HEAD);
        Item body = equipment.get(SlotSpot.BODY);
        Item legs = equipment.get(SlotSpot.LEGS);

        Item[] armorItems = {head, body, legs};

        for(Item item : armorItems){
            if(item != null) {
                totalATT.increase(((Armor) item).getAttributes().getStrength(),
                        ((Armor) item).getAttributes().getIntelligence(),
                        ((Armor) item).getAttributes().getDexterity());
            }
        }

    }

    public StringBuilder printStats(){
        StringBuilder stats = new StringBuilder();
        stats.append("Hero stats: \n")
                .append("Hero name is: ").append(getName()).append("\n")
                .append("Character level: ").append(getLevel()).append("\n")
                .append("Character strength: ").append(getTotalATT().getStrength()).append("\n")
                .append("Character dexterity: ").append(getTotalATT().getDexterity()).append("\n")
                .append("Character intelligence: ").append(getTotalATT().getIntelligence()).append("\n")
                .append("Character DPS : ").append(getDPS()).append("\n");

        return stats;
    }

    public HashMap<SlotSpot, Item> getEquipment(){
        return equipment;
    }

    @Override
    public void levelUp() {

    }
    @Override
    public void equip(Item item) throws Exception{
        if(item.getRequiredLevel() > getLevel()){
            if(item.getSlot() == SlotSpot.WEAPON){
                throw new InvalidWeaponException("This weapon requires a higher level.");
            } else {
                throw new InvalidArmorException("This armor requires a higher level.");
            }
        }
        if(item.getSlot() == SlotSpot.WEAPON){
            if(!validWeapons.contains(((Weapon)item).getWEAPON_TYPE())){
                throw new InvalidWeaponException("Invalid Weapon Type.");
            }
        } else {
            if(!validArmor.contains(((Armor)item).getARMOR_TYPE())){
                throw new InvalidArmorException("Invalid Armor Type.");
            }
        }
            equipment.put(item.getSlot(), item);
            updateTotalAttributes();
    }

    public abstract void updateCharacterDPS();
}


