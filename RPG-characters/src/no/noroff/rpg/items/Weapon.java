package no.noroff.rpg.items;

public class Weapon extends Item{
    private WeaponType WEAPON_TYPE;
    private int damage = 5;
    private int attackSpeed = 1;
    private int DPS = updateDPS();


    public Weapon(String name, int requiredLevel, SlotSpot slot, WeaponType weaponType) {
        super(name, requiredLevel, slot);
        WEAPON_TYPE = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getDPS() {
        return DPS;
    }

    public WeaponType getWEAPON_TYPE() {
        return WEAPON_TYPE;
    }

    private int updateDPS(){
        return damage * attackSpeed;
    }

}
