package no.noroff.rpg.items;

/**
 * Abstract Item class
 * Parent class for items.
 */
public abstract class Item {

    //Fields
    protected String name;
    protected int requiredLevel;
    protected SlotSpot slot;

    /**
     * Constructor
     * @param name, the name.
     * @param requiredLevel, the required level.
     * @param slot, the slot.
     */
    public Item(String name, int requiredLevel, SlotSpot slot){
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the required level.
     */
    public int getRequiredLevel() {
        return requiredLevel;
    }

    /**
     * @return the slot spot.
     */
    public SlotSpot getSlot() {
        return slot;
    }

    /**
     * Sets the name.
     * @param name, the name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets required level.
     * @param requiredLevel required level to be set
     */
    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    /**
     * Sets slot
     * @param slot, slot to be set.
     */
    public void setSlot(SlotSpot slot) {
        this.slot = slot;
    }
}
