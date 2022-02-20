package no.noroff.rpg.items;


/**
 * Class for weapon
 * Child of Item.
 */
public class Weapon extends Item{

    //Fields.
    private WeaponType WEAPON_TYPE;
    private int damage = 5;
    private int attackSpeed = 1;
    private int DPS = updateDPS();

    /**
     * Constructor
     * @param name, The name.
     * @param requiredLevel, The required level.
     * @param slot, The slot.
     * @param weaponType, the weapon type.
     */
    public Weapon(String name, int requiredLevel, SlotSpot slot, WeaponType weaponType) {
        super(name, requiredLevel, slot);
        WEAPON_TYPE = weaponType;
    }

    /**
     * @return the damage.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @return the attack speed.
     */
    public int getAttackSpeed() {
        return attackSpeed;
    }

    /**
     * @return the DPS.
     */
    public int getDPS() {
        return DPS;
    }

    /**
     * @return the weapon type.
     */
    public WeaponType getWEAPON_TYPE() {
        return WEAPON_TYPE;
    }


    /**
     * Updates DPS.
     * @return the DPS.
     */
    private int updateDPS(){
        return damage * attackSpeed;
    }

}
